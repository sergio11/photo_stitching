package sergio.sanchez.photo_stitching.data;

import java.io.Serializable;

/**
 * Created by sergio on 10/04/2017.
 */

public class PhotoHolder implements Serializable {

    public Photo[] photos;

    public PhotoHolder() {
    }

    public PhotoHolder(Photo[] photos) {
        this.photos = photos;
    }
}
