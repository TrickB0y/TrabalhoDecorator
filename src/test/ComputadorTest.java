package test;

import main.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputadorTest {

    @Test
    void deveRetornarEstatisticaComputador() {
        Computador computador = new PlacaMae("Asus");

        assertEquals("Placa Mãe: Asus", computador.getEspecificacoes());
    }

    @Test
    void deveRetornarEstatisticaComputadorComProcessadorIntel() {
        Computador computador = new ProcessadorIntel(new PlacaMae("Asus"));

        assertEquals("Placa Mãe: Asus, Processador: Intel", computador.getEspecificacoes());
    }

    @Test
    void deveRetornarEstatisticaComputadorComProcessadorIntelMaisMemoriaDDR4() {
        Computador computador = new MemoriaDDR4(new ProcessadorIntel(new PlacaMae("Asus")));

        assertEquals("Placa Mãe: Asus, Processador: Intel, Memória: DDR4", computador.getEspecificacoes());
    }

    @Test
    void deveRetornarEstatisticaComputadorComProcessadorIntelMaisMemoriaDDR4MaisVideoAMD() {
        Computador computador = new VideoAMD(new MemoriaDDR4(new ProcessadorIntel(new PlacaMae("Asus"))));

        assertEquals("Placa Mãe: Asus, Processador: Intel, Memória: DDR4, Vídeo: AMD", computador.getEspecificacoes());
    }

    @Test
    void deveRetornarEstatisticaComputadorComProcessadorAMDMaisMemoriaDDR5MaisVideoNvidia() {
        Computador computador = new VideoNvidia(new MemoriaDDR5(new ProcessadorAMD(new PlacaMae("Gigabyte"))));

        assertEquals("Placa Mãe: Gigabyte, Processador: AMD, Memória: DDR5, Vídeo: Nvidia", computador.getEspecificacoes());
    }

    @Test
    void deveRetornarEstruturaComputador() {
        Computador computador = new PlacaMae("Asus");

        assertEquals("PlacaMae", computador.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaComputadorComProcessador() {
        Computador computador = new ProcessadorIntel(new PlacaMae("Asus"));

        assertEquals("PlacaMae/Processador", computador.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaComputadorComProcessadorMaisMemoria() {
        Computador computador = new MemoriaDDR4(new ProcessadorIntel(new PlacaMae("Asus")));

        assertEquals("PlacaMae/Processador/Memória", computador.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaComputadorComProcessadorMaisMemoriaMaisVideo() {
        Computador computador = new VideoAMD(new MemoriaDDR4(new ProcessadorIntel(new PlacaMae("Asus"))));

        assertEquals("PlacaMae/Processador/Memória/Vídeo", computador.getEstrutura());
    }
}
