import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RequestResponse {

    /*
    1)1) Postman manuel test için kullanılır
2) Otomasyon için Rest-Assured library kullanıyoruz
3) Otomasyonu yazabilmek için şu adımların izlenmesi gerekir:
    a) Gereksinimleri anlama
    b) Test case yazma:
        -Test yazmak için Gherkin Language kullanılır
        x) Given: Ön koşullar --> Url, Body ...
        y) When: Yapılacak işlemler --> Get, Put, Post ... requests...
        z) Then: Dönütler, çıktılar --> Assertion, close...
        t) And: Art arda yapılan aynı çoklu işlmeleri bağlamak için kullanılır


     */


    public static void main(String[] args) {
String url="https://petstore.swagger.io/v2/pet/23888099875";
        Response response=given().get("url");
        response.prettyPrint();//sout yerine kullaniyoruz..



    }
}
