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

# Step 0: Download Class and import in your project

# Step 1: Create a String[] packages

         String[] packages = {"package.that.you.want","package.that.you.want"};

# Step 2: Create a new objet GetAppInfo.

        GetAppInfo getAppInfo = new GetAppInfo(Context,packages);
        
# Step 3: Call the method you want to use

        String[] appname = getAppInfo.geAppName();
         
# Step 4: Make a for to get results

         String result = "";

        for (int i = 0; i < appname.length;i++ ){

            result = appname[i];
            //now it's up to you :)
        }

    }
        
        
