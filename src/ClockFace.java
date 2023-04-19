public class ClockFace {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("/*********** Дата и время ***********\\\n");
        stringBuffer.append(new ClassHandleDate().getProcessedDate());
        stringBuffer.append("/************************************\\\n");
        System.out.println(stringBuffer);

    }
}
