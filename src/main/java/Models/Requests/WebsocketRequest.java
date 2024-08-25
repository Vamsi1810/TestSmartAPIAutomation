package Models.Requests;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WebsocketRequest {
    public static class Params {
        private int mode;
        public static class Token {
            private int exchangeType;
            private String[] tokens;

            public Token(int exchangeType, String[] tokens) {
                this.exchangeType = exchangeType;
                this.tokens = tokens;
            }

            public int getExchangeType() {
                return exchangeType;
            }

            public void setExchangeType(int exchangeType) {
                this.exchangeType = exchangeType;
            }

            public String[] getTokens() {
                return tokens;
            }

            public void setTokens(String[] tokens) {
                this.tokens = tokens;
            }
        }
        private Token[] tokenList;

        public Params(int mode, Token[] tokenList) {
            this.mode = mode;
            this.tokenList = tokenList;
        }

        public int getMode() {
            return mode;
        }

        public void setMode(int mode) {
            this.mode = mode;
        }

        public Token[] getTokenList() {
            return tokenList;
        }

        public void setTokenList(Token[] tokenList) {
            this.tokenList = tokenList;
        }
    }
    private int action;
    private Params params;

    public WebsocketRequest(int action, Params params) {
        this.action = action;
        this.params = params;
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }
}
