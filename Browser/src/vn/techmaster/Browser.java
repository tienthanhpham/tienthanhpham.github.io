package vn.techmaster;

public class Browser {

    public String navigate(String url) {
        String ipAddress = findIP(url);
        String content = sendHttpRequest(ipAddress);
        return content;
    }

    private String findIP(String domainName) {
        return "Dia chi IP: 127.0.0.1";
    }

    private String sendHttpRequest(String ipAdd) {
        return "<html></html>";
    }

}
