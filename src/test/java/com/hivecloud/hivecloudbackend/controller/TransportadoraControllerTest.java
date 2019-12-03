package com.hivecloud.hivecloudbackend.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hivecloud.hivecloudbackend.domain.Transportadora;
import com.hivecloud.hivecloudbackend.service.TransportadoraService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(value = TransportadoraController.class)
public class TransportadoraControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TransportadoraService transportadoraService;

    @Test
    public void inserirTransportadora() throws Exception{
        Transportadora transportadoraMock = new Transportadora();

        transportadoraMock.setEmail("hivecloud@gmail.com");
        transportadoraMock.setNome("Hive Cloud");
        transportadoraMock.setEmpresa("65501814000155");
        transportadoraMock.setTelefone("8130620488");
        transportadoraMock.setCelular("81997886730");
        transportadoraMock.setWhatsapp("81997886730");
        transportadoraMock.setModalidade("Rodoviária");
        transportadoraMock.setCep("51260040");
        transportadoraMock.setUf("PE");
        transportadoraMock.setCidade("Recife");
        transportadoraMock.setBairro("Jordão");
        transportadoraMock.setRua("Avenida dona carêntina");
        transportadoraMock.setNumero("20");
        transportadoraMock.setSnAceitouTermos("S");

        Mockito.when(transportadoraService.inserirTransportadora(Mockito
                                          .any(Transportadora.class)))
                                          .thenReturn(transportadoraMock);

        mockMvc.perform(MockMvcRequestBuilders
                .post("/transportadora")
                .content(asJsonString(transportadoraMock))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
    }

    @Test
    public void alterarTransportadora() throws Exception {
        Transportadora transportadoraMock = new Transportadora();

        transportadoraMock.setEmail("hivecloud@gmail.com");
        transportadoraMock.setNome("Hive Cloud");
        transportadoraMock.setEmpresa("65501814000155");
        transportadoraMock.setTelefone("8130620413");
        transportadoraMock.setCelular("81991569994");
        transportadoraMock.setWhatsapp("81997886730");
        transportadoraMock.setModalidade("Rodoviária");
        transportadoraMock.setCep("51260040");
        transportadoraMock.setUf("PE");
        transportadoraMock.setCidade("Recife");
        transportadoraMock.setBairro("Jordão");
        transportadoraMock.setRua("Rua Limoeiro");
        transportadoraMock.setNumero("20");
        transportadoraMock.setSnAceitouTermos("S");

        Mockito.when(transportadoraService
                .alterarTransportadora(Mockito
                .any(Transportadora.class), Mockito.anyLong()))
                .thenReturn(transportadoraMock);

        mockMvc.perform(MockMvcRequestBuilders
                .put("/transportadora/{id}", 1)
                .content(asJsonString(transportadoraMock))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void excluirPorCodigo() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .delete("/transportadora/{id}", 1))
                .andExpect(status().isOk());
    }

    @Test
    public void pesquisarPorCodigo() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/transportadora/{id}", 1)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void listarTransportadoras() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders
                .get("/transportadora")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    private String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}