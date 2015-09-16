package club.xiaoke.supercood;

import club.xiaoke.supercood.constants.CoordType;
import club.xiaoke.supercood.task.CoordConverttask;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;


/**
 * @author SHANG01
 * 转换坐标界面
 */
public class CoordConvertActivity extends Activity {
	
	//经度
	EditText ac_coord_convert_origin_lng_etxt;
	//纬度
	EditText ac_coord_convert_origin_lat_etxt;
	
	
	double originlng;
	double originlat;
	
	
	/**
	 * 原始坐标类型
	 */
	int originCoordType = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_coordconvert);
		
		initview();
		initlistener();
		initdata();
		
		
	}
	
	private void initview(){
		ac_coord_convert_origin_lng_etxt = (EditText) findViewById(R.id.ac_coord_convert_origin_lng_etxt);
		ac_coord_convert_origin_lat_etxt = (EditText) findViewById(R.id.ac_coord_convert_origin_lat_etxt);
	}
	
	private void initlistener(){
		
	}
	
	private void initdata(){
		Intent intent = getIntent();
		originCoordType = intent.getIntExtra("originCoordType", 0);
		originlat = Double.valueOf(ac_coord_convert_origin_lat_etxt.getText().toString());
		originlng = Double.valueOf(ac_coord_convert_origin_lng_etxt.getText().toString());
		
		/******************************************************
		 * 
		 * 数据转换
		 * 
		 * 
		 *****************************************************/
		//转换为---WGS84
		doconvert(CoordType.CT_WGS84);
		//转换为---国测局
		doconvert(CoordType.CT_GCJ02);
		//转换为---百度地图
		doconvert(CoordType.CT_BD09);
		//转换为---谷歌地球
		doconvert(CoordType.CT_GOOGLE_EARTH);
		//转换为---谷歌地图
		doconvert(CoordType.CT_GOOGLE_MAP);
		//转换为---GPS设备
		doconvert(CoordType.CT_GPS_DEVICE);
		//转换为---高德地图
		doconvert(CoordType.CT_AMAP_GAODE);
		//转换为---腾讯地图
		doconvert(CoordType.CT_TECENT);
		
	}
	
	private void doconvert(int resultCoordType){
		CoordConverttask task = 
				new CoordConverttask(
						originlat, 
						originlng, 
						originCoordType, 
						resultCoordType, 
						this);
		
	}

}
