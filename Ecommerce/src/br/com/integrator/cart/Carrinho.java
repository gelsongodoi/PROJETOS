package br.com.integrator.cart;

import java.math.BigDecimal;
import java.util.*;

import br.com.integrator.entities.ItensPedido;
import br.com.integrator.entities.Produto;

/*
 * Possui a habilidade de adicionar, remover, atualizar e visualizar
 * todos os itens contidos em um carrinho de compras
 */

public class Carrinho {
	//gera um HashMap para adicionar os itens
	private HashMap<Integer, ItensPedido> itens = 
		new HashMap<Integer, ItensPedido>();


	//adiciona o produto ao carrinho
    public void adicionarAoCarrinho(Produto p) {
    	
    	ItensPedido carItem = (ItensPedido)itens.get(p.getId());
		Double desconto = 0.0;  
		Double preco = 0.0;
		
		//caso n�o haja este produto no carrinho
	  	if (carItem == null) {
	  		carItem = new ItensPedido();
	  		
	  		carItem.setProduto(p); //adiciona o produto
	  		carItem.setQtd(new BigDecimal(1)); //adiciona a quantidade
	  		
	  		desconto = Double.parseDouble(carItem.getProduto().getDescGd());
	  		preco = carItem.getProduto().getPreco().doubleValue();
	  		
	  		//faz o c�lculo em caso de haver desconto
	  		carItem.setSubTotal(subTotal(preco, desconto, carItem.getQtd().intValue()));
	  		
			itens.put(p.getId(), carItem);	
	  	}
	  	else { //caso o produto j� esteja no carrinho
	  		preco = carItem.getProduto().getPreco().doubleValue();
	  		//acrescenta em 1 a sua quantidade
	  		carItem.setQtd(new BigDecimal(carItem.getQtd().intValue() + 1)); 
	  		//calcula o subtotal novamente
	  		carItem.setSubTotal(subTotal(preco, desconto, carItem.getQtd().intValue()));
	  	}
    }
    
    //m�todo que calcula o subtotal
    public Double subTotal(Double preco, Double desconto, Integer qtd){
    	if(desconto==null)
    		desconto = 0.0;
    	Double subtotal = (preco - (preco * desconto)/100) * qtd;
    	return subtotal;
    }
    
    
    //remove um determinado produto
    public void removerProduto(Produto p) {
        itens.remove(p.getId());
    }

    //lista os produtos do carrinho
    @SuppressWarnings("unchecked")
	public List listarProdutos() {
    	//retorna um ArrayList
        return new ArrayList(itens.values());
    }

    
	// altera somente a quantidade
	public void setAlterarQuantidade(Integer itemId, Integer novaQtd) {
		ItensPedido carItem = (ItensPedido) itens.get(itemId);
		carItem.setQtd(new BigDecimal(novaQtd));
	}
	
	
	//capta o total geral
	public Double getTotal() {
		Double totalGeral=0.0;
	  	Iterator<?> itens = listarProdutos().iterator();
	  	while (itens.hasNext()) {
	  		ItensPedido cartItem = (ItensPedido) itens.next();
			totalGeral += cartItem.getSubTotal();
	  	}
	  	return totalGeral;
	}
	
	public void limpar(){
		itens.clear();
	}
   
	    
}
