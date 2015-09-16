package club.xiaoke.supercood.constants;

public class CoordType {
	
	/**
	 * wgs84
	 */
	public static final int CT_WGS84 = 0X0001;
	/**
	 * 国测局
	 * guo jia ce hui ju 
	 */
	public static final  int CT_GCJ02 = 0X0002;
	/**
	 * 百度
	 * baidu
	 */
	public static final  int CT_BD09 = 0X0003;
	/**
	 * google earth
	 */
	public static final  int CT_GOOGLE_EARTH = 0x0004; //= CT_WGS84;
	/**
	 * GPS模块
	 */
	public static final  int CT_GPS_DEVICE = 0x0005; //= CT_WGS84;
	
	/**
	 * 谷歌地图
	 */
	public static final  int CT_GOOGLE_MAP = 0x0006; //= CT_GCJ02;
	/**
	 * 高德地图
	 */
	public static final  int CT_AMAP_GAODE = 0x0007; //= CT_GCJ02;
	
	/**
	 * 腾讯地图
	 */
	public static final  int CT_TECENT = 0x0008; //= CT_GCJ02;

}
