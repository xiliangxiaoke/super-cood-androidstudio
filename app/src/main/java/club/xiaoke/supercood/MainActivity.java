package club.xiaoke.supercood;

//import android.support.v7.app.ActionBarActivity;
import club.xiaoke.supercood.constants.CoordType;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;



/**
 * @author SHANG01
 * 主页面程序
 */
public class MainActivity extends Activity implements OnClickListener {
	
	TextView mainac_type_WGS84;
	TextView mainac_type_GCJ02;
	TextView mainac_type_BAIDU;
	TextView mainac_type_GOOGLE_EARTH;
	TextView mainac_type_GOOGLE_MAP;
	TextView mainac_type_GPS_DEVICE;
	TextView mainac_type_AMAP;
	TextView mainac_type_TECENT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initview();
        initlistener();
        
    }
    
    private void initview(){
    	mainac_type_WGS84 = (TextView) findViewById(R.id.mainac_type_WGS84);
    	mainac_type_GCJ02 = (TextView) findViewById(R.id.mainac_type_GCJ02);
    	mainac_type_BAIDU = (TextView) findViewById(R.id.mainac_type_BAIDU);
    	mainac_type_GOOGLE_EARTH = (TextView) findViewById(R.id.mainac_type_GOOGLE_EARTH);
    	mainac_type_GOOGLE_MAP = (TextView) findViewById(R.id.mainac_type_GOOGLE_MAP);
    	mainac_type_GPS_DEVICE = (TextView) findViewById(R.id.mainac_type_GPS_DEVICE);
    	mainac_type_AMAP = (TextView) findViewById(R.id.mainac_type_AMAP);
    	mainac_type_TECENT = (TextView) findViewById(R.id.mainac_type_TECENT);
    }
    
    private void initlistener(){
    	mainac_type_WGS84.setOnClickListener(this);
    	mainac_type_GCJ02.setOnClickListener(this);
    	mainac_type_BAIDU.setOnClickListener(this);
    	mainac_type_GOOGLE_EARTH.setOnClickListener(this);
    	mainac_type_GOOGLE_MAP.setOnClickListener(this);
    	mainac_type_GPS_DEVICE.setOnClickListener(this);
    	mainac_type_AMAP.setOnClickListener(this);
    	mainac_type_TECENT.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int id = v.getId();
		int originCoordType = 0;
		switch(id){
		case R.id.mainac_type_WGS84:
			originCoordType = CoordType.CT_WGS84;
			break;
		case R.id.mainac_type_GCJ02:
			originCoordType = CoordType.CT_GCJ02;
			break;
		case R.id.mainac_type_BAIDU:
			originCoordType = CoordType.CT_BD09;
			break;
		case R.id.mainac_type_GOOGLE_EARTH:
			originCoordType = CoordType.CT_GOOGLE_EARTH;
			break;
		case R.id.mainac_type_GOOGLE_MAP:
			originCoordType = CoordType.CT_GOOGLE_MAP;
			break;
		case R.id.mainac_type_GPS_DEVICE:
			originCoordType = CoordType.CT_GPS_DEVICE;
			break;
		case R.id.mainac_type_AMAP:
			originCoordType = CoordType.CT_AMAP_GAODE;
			break;
		case R.id.mainac_type_TECENT:
			originCoordType = CoordType.CT_TECENT;
			break;
		}
		
		Intent intent = new Intent();
		intent.setClass(this, CoordConvertActivity.class);
		intent.putExtra("originCoordType", originCoordType);
		startActivity(intent);
		
	}
	
	

   
}
