package cuenta;
public class Cuenta {
private int balance;
void depositar(int cantidad) {
balance+=cantidad;
}
void retirar(int cantidad) {
balance-=cantidad;
}
void transferir(Cuenta destino, int cantidad) {
destino.depositar(cantidad);
retirar(cantidad);
}
int getBalance() {
return balance;
}
void setBalance(int balance) {
this.balance = balance;
}
}
