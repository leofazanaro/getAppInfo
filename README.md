# GetAppInfo
this class gets information from the applications installed on the device


# Available methods


getVersionName - return a String[]

getVersionCode - return a int[]

geAppName - return a String[]


getAppIcon - return a Drawable[]

getLastUpdateTime - return a Long[]

getFirstInstallTime - return a Long []




# How to use

# 0 - Download Class and import in your project

# 1 - Creat a new objet GetAppInfo.

        GetAppInfo getAppInfo = new GetAppInfo(Context,String_Array);
        
# 2 - Call the method you want to use

        String[] appname = getAppInfo.geAppName();
         
# 3 - Make a for to get results

         String result = "";

        for (int i = 0; i < appname.length;i++ ){

            result = appname[i];
            //now it's up to you :)
        }

    }
        
        
