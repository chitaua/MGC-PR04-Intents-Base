package es.iessaladillo.pedrojoya.pr04.ui.avatar;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.BreakIterator;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import es.iessaladillo.pedrojoya.pr04.R;
import es.iessaladillo.pedrojoya.pr04.data.local.Database;
import es.iessaladillo.pedrojoya.pr04.data.local.model.Avatar;
import es.iessaladillo.pedrojoya.pr04.utils.ResourcesUtils;

public class AvatarActivity extends AppCompatActivity {


    private List<Avatar> avatares;
    private Database database = Database.getInstance();
    private ImageView imgAvatar1;
    private ImageView imgAvatar2;
    private ImageView imgAvatar3;
    private ImageView imgAvatar4;
    private ImageView imgAvatar5;
    private ImageView imgAvatar6;
    private TextView lblAvatar1;
    private TextView lblAvatar2;
    private TextView lblAvatar3;
    private TextView lblAvatar4;
    private TextView lblAvatar5;
    private TextView lblAvatar6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar);
        setupViews();
        initImageViews();
    }

    private void setupViews() {
        avatares = database.queryAvatars();
        imgAvatar1 = ActivityCompat.requireViewById(this, R.id.imgAvatar1);
        imgAvatar2 = ActivityCompat.requireViewById(this, R.id.imgAvatar2);
        imgAvatar3 = ActivityCompat.requireViewById(this, R.id.imgAvatar3);
        imgAvatar4 = ActivityCompat.requireViewById(this, R.id.imgAvatar4);
        imgAvatar5 = ActivityCompat.requireViewById(this, R.id.imgAvatar5);
        imgAvatar6 = ActivityCompat.requireViewById(this, R.id.imgAvatar6);

    }

    private void initImageViews() {
        imgAvatar1.setImageResource(avatares.get(0).getImageResId());
        imgAvatar1.setTag(avatares.get(0).getImageResId());
        lblAvatar1.setText(avatares.get(0).getName());
        imgAvatar2.setImageResource(avatares.get(1).getImageResId());
        imgAvatar2.setTag(avatares.get(1).getImageResId());
        lblAvatar2.setText(avatares.get(1).getName());
        imgAvatar3.setImageResource(avatares.get(2).getImageResId());
        imgAvatar3.setTag(avatares.get(2).getImageResId());
        lblAvatar3.setText(avatares.get(2).getName());
        imgAvatar4.setImageResource(avatares.get(3).getImageResId());
        imgAvatar4.setTag(avatares.get(3).getImageResId());
        lblAvatar4.setText(avatares.get(3).getName());
        imgAvatar5.setImageResource(avatares.get(4).getImageResId());
        imgAvatar5.setTag(avatares.get(4).getImageResId());
        lblAvatar5.setText(avatares.get(4).getName());
        imgAvatar6.setImageResource(avatares.get(5).getImageResId());
        imgAvatar6.setTag(avatares.get(5).getImageResId());
        lblAvatar6.setText(avatares.get(5).getName());
    }

    // DO NO TOUCH
    private void selectImageView(ImageView imageView) {
        imageView.setAlpha(ResourcesUtils.getFloat(this, R.dimen.selected_image_alpha));
    }

    // DO NOT TOUCH
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
