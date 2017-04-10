package sergio.sanchez.photo_stitching.data;

import android.net.Uri;
import android.support.annotation.NonNull;
import com.afollestad.inquiry.annotations.Column;
import java.io.Serializable;

/**
 * Created by sergio on 10/04/2017.
 */

public class Photo implements Serializable {

    public Photo() {
    }

    public Photo(Uri uri) {
        _data = uri.toString();
    }

    @Column public long _id;
    @Column public String _data;
    @Column public long datetaken;

    @NonNull
    public Uri getUri() {
        Uri uri = Uri.parse(_data);
        if (!uri.toString().startsWith("file://") && !uri.toString().startsWith("content://"))
            uri = Uri.parse(String.format("file://%s", uri.toString()));
        return uri;
    }
}
