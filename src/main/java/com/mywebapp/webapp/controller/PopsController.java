package com.mywebapp.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PopsController {

    @GetMapping("/pops")
    @ResponseBody
    public String bar() {
        return "{\n" +
                "  \"data\": {\n" +
                "    \"labels\": [\n" +
                "      \"Africa\",\n" +
                "      \"Asia\",\n" +
                "      \"Europe\",\n" +
                "      \"Latin America\",\n" +
                "      \"North America\"\n" +
                "    ],\n" +
                "    \"datasets\": [\n" +
                "      {\n" +
                "        \"backgroundColor\": [\n" +
                "          \"#3e95cd\",\n" +
                "          \"#8e5ea2\",\n" +
                "          \"#3cba9f\",\n" +
                "          \"#e8c3b9\",\n" +
                "          \"#c45850\"\n" +
                "        ],\n" +
                "        \"label\": \"Population (millions)\",\n" +
                "        \"data\": [\n" +
                "          2478,\n" +
                "          5267,\n" +
                "          734,\n" +
                "          784,\n" +
                "          433\n" +
                "        ]\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"options\": {\n" +
                "    \"plugins\": {\n" +
                "      \"legend\": {\n" +
                "        \"display\": false\n" +
                "      },\n" +
                "      \"title\": {\n" +
                "        \"text\": \"Predicted world population (millions) in 2050\",\n" +
                "        \"display\": true\n" +
                "      }\n" +
                "    }\n" +
                "  }\n" +
                "}";
    }
}
