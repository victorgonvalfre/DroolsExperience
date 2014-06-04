[condition][]Verificar notificacao ativa =$n : Notificacao($o: Obito)
[condition][]e se Doacao foi aceita =$d: Doacao(obito == $o, autorizado == true)
[condition][]mas estourou o tempo limite de {timeStamp}=$d1: Doacao(this == $d, getDelayTime() > {timeStamp})

[consequence][]Display mensagem de tempo esgotado =System.out.println("---> Doação Aceita, mas o tempo para o processo já está no limite! Paciente Invalido!");
[consequence][]Retira Doacao = retract($d);
[consequence][]e Notificacao do processo= retract($n);