/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concatenateexcels;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author wallacechipidza
 */
public class ConcatenateExcels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        File[] files = new File("/Users/wallacechipidza/Dropbox/activity").listFiles();
        OutputStream out = new FileOutputStream(new File("/Users/wallacechipidza/Dropbox/mergedfile.csv"));
    byte[] buf = new byte[256];
    for (File file : files) {
        InputStream in = new FileInputStream(file);
        int b = 0;
        while ( (b = in.read(buf)) >= 0) {
            out.write(buf, 0, b);
            out.flush();
        }
    }
    out.close();
    }
    
}
