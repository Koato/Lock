package gomez.andy.does_not_uninstall;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyAdmin extends DeviceAdminReceiver {

    public void onEnabled(Context context, Intent intent) {
        mensaje(context,"Administrador de dispositivos: habilitado");
    }

    public void onDisabled(Context context, Intent intent) {
        mensaje(context,"Administrador del dispositivo: deshabilitado");
    }

    private  void mensaje(Context context, String mensaje){
        Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show();
    }
}
