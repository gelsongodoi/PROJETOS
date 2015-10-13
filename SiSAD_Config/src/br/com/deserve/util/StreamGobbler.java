package br.com.deserve.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class StreamGobbler implements Runnable {

    private InputStream is;
    private String type;
    private FileWriter fw;

    public StreamGobbler( InputStream is, String type ) {
        this.is = is;
        this.type = type;
    }

    public StreamGobbler( InputStream is, String type, File file )
            throws IOException {
        this.is = is;
        this.type = type;
        this.fw = new FileWriter( file );
    }

    @Override
    public void run() {
        try {
            InputStreamReader isr = new InputStreamReader( is );
			BufferedReader br = new BufferedReader( isr );
            String line = null;
            while ( ( line = br.readLine() ) != null ) {
                if ( fw != null ) {
                    fw.write( line + "\n" );
                } else {
                    System.out.println( type + ">" + line );
                }
            }
            if ( fw != null ) {
                fw.close();
            }
        } catch ( IOException ioe ) {
            ioe.printStackTrace();
        }
    }

}