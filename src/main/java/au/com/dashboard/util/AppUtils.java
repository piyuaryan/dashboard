package au.com.dashboard.util;

import org.springframework.web.multipart.MultipartException;
import org.springframework.web.multipart.MultipartFile;

public class AppUtils {
    public static String SUCCESS = "Success";
    public static String FAIL = "Failure";

    public static void validateOfficeData(MultipartFile file){
        if(!file.getContentType().equals("application/vnd.ms-excel"))
            throw new MultipartException("Only excel files accepted!");
    }
}