package service;

import model.entity.Profile;
import model.request.ProfileRequest;
import model.response.UploadFileResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IProfileService {
    List<Profile> getAll();
    Profile create(ProfileRequest request);
    UploadFileResponse upload(MultipartFile file, Long id) throws  Exception;
}
