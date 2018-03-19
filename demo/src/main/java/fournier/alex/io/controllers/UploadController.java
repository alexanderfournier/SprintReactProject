package fournier.alex.io.controllers;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;






@RestController
public class UploadController {
	
	private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	@Value("{$multipart.location}")
	private String location;
	
	
	@RequestMapping (value= "/upload", method= RequestMethod.POST,produces = MediaType.IMAGE_JPEG_VALUE)
	public String upload(@RequestPart("file") MultipartFile file, 
						@RequestPart("start") int start,
						@RequestPart("end") int end ,
						@RequestPart("speed") int speed,
						@RequestPart("repeat") boolean repeat) throws IllegalStateException, IOException{
		File videofile = new File(location + "/" + System.currentTimeMillis() + ".mp4");
		file.transferTo(videofile);
		log.info("saved file to {}",  videofile.getAbsolutePath());
		return "";
		
	}
	
	
 
}
