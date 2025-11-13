package com.github.T4Tis.gs_7_ai_work_bots;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

record TemaInfo(String tema, String membro1, String membro2, String descricao) {
}

@RestController
public class TemaController {

    @GetMapping("/info")
    public TemaInfo getinfo() {
        return new TemaInfo(
                "Bots e agentes de IA como parceiros no dia a dia de trabalho",
                "Isaac Maranho Destro ",
                "inexistente",
                "Explora a implementação de agentes IA que atuam como 'copilotos' no meio corporativo. Sendo o objetivo automatizar tarefas repetitivas e fornecendo feedback em tempo real, permitindo que os humanos foquem em outras coisas mais importantes.");
    }
}
