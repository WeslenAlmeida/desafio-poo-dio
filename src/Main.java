import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java script");
        curso2.setDescricao("descrição curso java script");
        curso2.setCargaHoraria(10);

        //Exemplo de Polimorfismo
        //Conteudo conteudo = new Curso();
        //conteudo.setDescricao();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev weslen = new Dev();
        weslen.setNome("Weslen");
        weslen.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Weslen" + weslen.getConteudosinscritos());
        weslen.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Weslen" + weslen.getConteudosinscritos());
        System.out.println("Conteúdos concluídos Weslen" + weslen.getConteudosConcluidos());
        System.out.println("XP:" + weslen.calcularTotalXp());

        System.out.println("--------------------------");

        Dev davi = new Dev();
        davi.setNome("Davi");
        davi.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Davi" + davi.getConteudosinscritos());
        davi.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Davi" + davi.getConteudosinscritos());
        System.out.println("Conteúdos concluídos Davi" + davi.getConteudosConcluidos());
        System.out.println("XP:" + davi.calcularTotalXp());




    }
}
