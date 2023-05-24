package org.jasmine.ecommerce.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UploadController {
    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {

        // Implement your file saving logic here

        // If upload was successful, send a success message
        redirectAttributes.addFlashAttribute("message", "You successfully uploaded " + file.getOriginalFilename() + "!");

        return "redirect:/";
    }
}

/*
try {
    // This will save the file to the server's storage. Replace "path/to/upload/directory" with the path to your actual directory.
    Path path = Paths.get("path/to/upload/directory" + file.getOriginalFilename());
    Files.write(path, file.getBytes());
} catch (IOException e) {
    e.printStackTrace();
}
 */
