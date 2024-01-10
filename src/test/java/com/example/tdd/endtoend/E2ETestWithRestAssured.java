package com.example.tdd.endtoend;
import static io.restassured.RestAssured.*;
import org.junit.jupiter.api.Test;

public class E2ETestWithRestAssured {

    @Test
    public void whenGetTasksThenGetStatus200() {
        get("/api/tasks").then().statusCode(200);
    }
}
