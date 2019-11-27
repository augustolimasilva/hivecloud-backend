package com.hivecloud.hivecloudbackend.controller;

import com.hivecloud.hivecloudbackend.domain.Transportadora;
import com.hivecloud.hivecloudbackend.service.TransportadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class TransportadoraControllerTest {

    /*@Autowired
    private MockMvc mockMvc;

    @MockBean
    private TransportadoraService transportadoraService;

    public void salvarTransportadora() throws Exception{

        Transportadora transportadora = new Transportadora("projetobackend",
                "Hive Cloud",
                "4405675500018",

                "Áereo",
                "Avenida Recife",
                10,
                "Imbiribeira",
                "Recife",
                "PE",
                "S");
        Mockito.when(cityService.saveCity(Mockito.any(City.class))).thenReturn(mockCity);

        mockMvc.perform(MockMvcRequestBuilders
                .post("/transportadora")
                .content(asJsonString(new City("Recife", "PE")))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
    }*/
}
