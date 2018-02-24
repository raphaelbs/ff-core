package br.com.ecvtec.corelibrary.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Util {

    public static String getDataHoraAtualGMT(String timeZone, String format){

            Date currentTime = new Date();

            SimpleDateFormat sdf = new SimpleDateFormat(format);
            sdf.setTimeZone(TimeZone.getTimeZone(timeZone));

            return sdf.format(currentTime);
    }
    
    public static byte[] getArquivoComoArrayDeBytes(String caminhoArquivo) throws FileNotFoundException, IOException{
    
        File file = new File(caminhoArquivo);
        byte[] bFile = new byte[(int) file.length()];

        FileInputStream fileInputStream = new FileInputStream(file);
        fileInputStream.read(bFile);
        fileInputStream.close();
        
        return bFile;
    
    }
        
}
