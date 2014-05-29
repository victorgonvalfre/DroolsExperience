[condition][]Validar notificacao =$n : Notificacao($o: Obito)
[condition][]Verificar se Doacao foi aceita =$d: Doacao(obito == $o, autorizado == true)
[condition][]Checkar timer esgotado {timeStamp}=$d1: Doacao(this == $d, getDelayTime() > {timeStamp})

[consequence][]Display msgDoacaoTempoEsgotado=System.out.println("---> Doação Aceita, mas o tempo para o processo já está no limite! Paciente Invalido!");
[consequence][]Deleta Doacao = retract($d);
[consequence][]Deleta Notificacao = retract($n);