package ro.ctrln.service;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ctrln.repository.ThumbnailRepository;

@Service
@Getter
public class ProcessingService {

    @Autowired
    private ThumbnailRepository thumbnailRepository;

//    @Autowired
//    public ProcessingService(ThumbnailRepository thumbnailRepository) {
//        this.thumbnailRepository = thumbnailRepository;
//    }
}
