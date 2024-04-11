package ro.ctrln.service;

import lombok.Getter;
import org.springframework.stereotype.Service;
import ro.ctrln.repository.ThumbnailRepository;

@Service
@Getter
public class ThumbnailService {

   private final ThumbnailRepository thumbnailRepository;

    public ThumbnailService(ThumbnailRepository thumbnailRepository) {
        this.thumbnailRepository = thumbnailRepository;
    }
}
