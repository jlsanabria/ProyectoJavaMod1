package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class DateUtil {

    public static String obtenerFechaHora() {
        LocalDateTime fechaHora = LocalDateTime.now();
        return DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm").format(fechaHora);
    }
}
