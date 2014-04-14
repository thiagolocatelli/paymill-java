# Paymill Java Bindings

You can sign up for a Paymill account at https://paymill.com

Requirements
============

Java 1.5 and later.

Installation
============

### Maven users

Add this dependency to your project's POM:

    <dependency>
      <groupId>com.github.thiagolocatelli</groupId>
      <artifactId>paymill-java</artifactId>
      <version>1.0</version>
    </dependency>
    
### Others

Download the project and build on your local workspace

Usage
=====

PaymillExample.java

```JAVA    
public class PinPaymentsExample {

    public static void main(String[] args) {
        Paymill.apiKey = "YOUR-SECRET-KEY";
        Map<String, Object> chargeMap = new HashMap<String, Object>();
        chargeMap.put("amount", 100);
        chargeMap.put("currency", "AUD");
        chargeMap.put("email", "thiago.locatelli@gmail.com");
        chargeMap.put("description", "Pin Payments Java Bindings tests");
        chargeMap.put("ip_address", "127.0.0.1");
        Map<String, Object> cardMap = new HashMap<String, Object>();
        cardMap.put("expiry_month", 12);
        cardMap.put("expiry_year", 2015);
        cardMap.put("cvc", 123);
        cardMap.put("name", "Roland Robot");
        cardMap.put("address_line1", "42 Sevenoaks St");
        cardMap.put("address_line2", "Apartment 5");
        cardMap.put("address_city", "Lathlain");
        cardMap.put("address_postcode", "6454");
        cardMap.put("address_state", "WA");
        cardMap.put("address_country", "Australia");
        chargeMap.put("card", cardMap);
        try {
            Charge charge = Charge.create(chargeMap);
            System.out.println(charge);
        } catch (PinPaymentsException e) {
            e.printStackTrace();
        }
    }
}
```

Testing
=======

You must have Maven installed. To run the tests, simply run `mvn test`.

License
=======

    Copyright 2013, Inc.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


