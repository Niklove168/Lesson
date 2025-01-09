package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class DataBase {

    public static class Args {
    }

    public static class Headers {
        private String host;
        private String x_request_start;
        private String content_length;
        private String x_forwarded_proto;
        private String x_forwarded_port;
        private String x_amzn_trace_id;
        private String user_agent;
        private String accept;
        private String postman_token;
        private String accept_encoding;
        private String cookie;

        public Headers() {
        }

        public Headers(String host, String x_request_start, String content_length, String x_forwarded_proto, String x_forwarded_port, String x_amzn_trace_id, String user_agent, String accept, String postman_token, String accept_encoding, String cookie) {
            this.host = host;
            this.x_request_start = x_request_start;
            this.content_length = content_length;
            this.x_forwarded_proto = x_forwarded_proto;
            this.x_forwarded_port = x_forwarded_port;
            this.x_amzn_trace_id = x_amzn_trace_id;
            this.user_agent = user_agent;
            this.accept = accept;
            this.postman_token = postman_token;
            this.accept_encoding = accept_encoding;
            this.cookie = cookie;
        }

        // Геттеры и сеттеры для всех полей
        public String Host() { return host; }
        public void Host(String host) { this.host = host; }

        public String Content_length() { return content_length; }
        public void Content_length(String content_length) { this.content_length = content_length; }

        public String X_request_start() { return x_request_start; }
        public void X_request_start(String x_request_start) { this.x_request_start = x_request_start; }

        public String X_forwarded_proto() {return x_forwarded_proto; }
        private void X_forwarded_proto(String x_forwarded_proto) { this.x_forwarded_proto = x_forwarded_proto; }

        public String X_forwarded_port() { return x_forwarded_port; }
        public void X_forwarded_port(String x_forwarded_port) { this.x_forwarded_port = x_forwarded_port; }

        public String X_amzn_trace_id() { return x_amzn_trace_id; }
        public void X_amzn_trace_id(String x_amzn_trace_id) { this.x_amzn_trace_id = x_amzn_trace_id; }

        public String User_agent() { return user_agent; }
        public void User_agent(String user_agent) { this.user_agent = user_agent; }

        public String Accept() { return accept; }
        public void Accept(String accept) { this.accept = accept; }

        public String Postman_token() { return postman_token; }
        public void Postman_token(String postman_token) { this.postman_token = postman_token; }

        public String Accept_encoding() { return accept_encoding; }
        public void Accept_encoding(String accept_encoding) { this.accept_encoding = accept_encoding; }

        public String Cookie() {return cookie; }
        private void Cookie(String cookie) { this.cookie = cookie; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Root {
        private Object args;
        private Object data;
        private Object files;
        private Object form;
        private Headers headers;
        private Object json;
        private String url;

        public Root() {
        }

        public Root(Object args, Headers headers, String url, Object data, Object files, Object form, Object json) {
            this.args = args;
            this.headers = headers;
            this.url = url;
            this.data = data;
            this.files = files;
            this.form = form;
            this.json = json;
        }

        // Геттеры и сеттеры для всех полей
        public Object Args() { return args; }
        public void Args(Object args) { this.args = args; }

        public Headers Headers() { return headers; }
        public void Headers(Headers headers) { this.headers = headers; }

        public String Url() { return url; }
        public void Url(String url) { this.url = url; }

        public Object Data() { return data; }
        public void Data(Object data) { this.data = data; }

        public Object Files() { return files; }
        public void Files(Object files) { this.files = files; }

        public Object Form() { return form; }
        public void form(Object form) { this.form = form; }

        public Object Json() { return json; }
        public void Json(Object json) { this.json = json; }
        }
    }