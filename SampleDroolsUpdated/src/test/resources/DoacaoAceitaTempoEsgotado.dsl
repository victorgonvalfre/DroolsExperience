[condition][]Verificar notificacao ativa =$n : ProcessoNotificacao($o: Obito, arquivado == false)
[condition][]com paciente apto para doacao = $o1: Obito(this == $o, aptoDoacao == true)
[condition][]e se Doacao foi aceita =$d: Doacao(obito == $o, autorizado == true)
[condition][]mas o tempo limite do processo de {timeStamp} horas foi violado=$d1: Doacao(this == $d, getDelayTime() > {timeStamp}*3600000)

[consequence][]Display mensagem de tempo esgotado =System.out.println("---> Doação Aceita, mas o tempo para o processo já está no limite! Paciente Invalido!");
[consequence][]Retira Doacao = retract($d);
[consequence][]e Notificacao do processo= retract($n);