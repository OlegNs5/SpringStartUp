package ro.ctrln.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Thumbnail {

    private int id;
    private String thumbnailName;
    private String thumnalDiscription;
}
