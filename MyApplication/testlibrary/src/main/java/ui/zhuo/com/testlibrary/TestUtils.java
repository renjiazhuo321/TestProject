package ui.zhuo.com.testlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by jiazhuo.ren on 2017/6/6.
 */

public class TestUtils {
    public static void  showShortToast(Context context,String text){
        Toast.makeText(context,text,Toast.LENGTH_SHORT).show();
    }
}
