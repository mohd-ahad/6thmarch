//package emp.portal.controller;
//
//import emp.portal.entity.DatabaseFile;
//import emp.portal.payload.Response;
//import emp.portal.service.DatabaseFileService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//@RestController
//    public class uploadcontroller {
//
//        @Autowired
//        private DatabaseFileService fileStorageService;
//
//        @PostMapping("/uploadFile")
//        public Response uploadFile(@RequestParam("file") MultipartFile file) {
//            DatabaseFile fileName = fileStorageService.storeFile(file);
//
//            String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
//                    .path("/downloadFile/")
//                    .path(fileName.getFileName())
//                    .toUriString();
//
//            return new Response(fileName.getFileName(), fileDownloadUri,
//                    file.getContentType(), file.getSize());
//        }
//}
