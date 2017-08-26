package com.makererequickresponse.mqr;

/**
 * Created by Belal on 3/20/2016.
 */
public class Constants {

    //Firebase app url
    public static final String FIREBASE_APP = "https://makerere-quick-response.firebaseio.com/";

    //Constant to store shared preferences
    public static final String SHARED_PREF = "notificationapp";

    //To store boolean in shared preferences for if the device is registered to not
    public static final String REGISTERED = "registered";

    //To store the firebase id in shared preferences
    public static final String UNIQUE_ID = "uniqueid";

    //register.php address in your server
    public static final String REGISTER_URL = "http://192.168.1.106/mqr/register.php";
    
    //need to test with static ip address with same address as local host
    public static final String TEST_URL = "http://192.168.1.106/mqr/register.php";

    public static final String MESSAGE_URL  = "http://192.168.1.106/mqr/send.php";
}
