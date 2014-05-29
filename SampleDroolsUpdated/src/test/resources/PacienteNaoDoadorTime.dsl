[condition][]Validar notificacao =$n : Notificacao($o: Obito)
[condition][]Checkar time {timeStamp}=$n1: Notificacao(this == $n, getDelayTime() > {timeStamp}) 


[consequence][]Display msg=System.out.println("---> Paciente Inápito! notificação de codigo: -----> "+ $n.getCodigo()+ " não pode ser tratado como possivel doador!");
[consequence][]Retira Notificacao= retract($n)