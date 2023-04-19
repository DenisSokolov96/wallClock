public class ClassHandleDate {

    public String getProcessedDate() throws RuntimeException {

        StringBuilder stringBuilder = new StringBuilder();
        String[] dateMas = new ClassDate().getData().toString().split(" ");
        stringBuilder.append("Сегодня: ").append(dateMas[2]).append(" ");
        stringBuilder.append(translateMonth(dateMas[1])).append(" ").append(dateMas[5]).append(" года\n");
        stringBuilder.append("Время : ").append(dateMas[3]).append("\n");
        stringBuilder.append("День недели : ").append(translateDay(dateMas[0])).append("\n");
        stringBuilder.append("Часовой пояс : ").append(strTimeZone(dateMas[4])).append("\n");

        return stringBuilder.toString();
    }

    private String translateMonth(String strMonth) {
        return switch (strMonth) {
            case "Jan" -> "Января";
            case "Feb" -> "Февраля";
            case "Mar" -> "Марта";
            case "Apr" -> "Апреля";
            case "Jun" -> "Июня";
            case "Jul" -> "Июля";
            case "Aug" -> "Августа";
            case "Sep" -> "Сентября";
            case "Oct" -> "Октября";
            case "Nov" -> "Ноября";
            case "Dec" -> "Декабря";
            default -> "";
        };
    }

    private String translateDay(String strDay) {
        return switch (strDay) {
            case "Mon" -> "понедельник";
            case "Tue" -> "вторник";
            case "Wed" -> "среда";
            case "Thu" -> "четверг";
            case "Fri" -> "пятница";
            case "Sat" -> "суббота";
            case "Sun" -> "воскресенье";
            default -> "";
        };
    }

    private String strTimeZone(String strTimeZone) {
        switch (strTimeZone) {
            case "MSK":
                return "Москва";
            default:
                return "";
        }
    }
}
