//******************************************************************************
//****?????? ???1200012772  ???2012???3?                   *****
//****???2012?10?5?                                                  *****
//****?????3?5?7????                                            *****
//******************************************************************************
int main( )
{
	int a;                     //????a
	//cout << " ?????" << endl;
	cin >> a;    //????
	if( a % 3 == 0 && a % 5 == 0 && a % 7 == 0 )//??3,5,7??
		cout << "3" << " 5" << " 7" << endl;
	else if( a % 3 == 0 && a % 5 == 0 && a % 7 != 0 )//??3,5??
		cout << "3" << " 5" << endl;
	else if( a % 3 == 0 && a % 5 != 0 && a % 7 == 0 )//??3,7??
		cout << "3" << " 7" << endl;
	else if( a % 3 != 0 && a % 5 == 0 && a % 7 == 0 )//??5,7??
		cout << "5" << " 7" << endl;
	else if( a % 3 == 0 && a % 5 != 0 && a % 7 != 0 )//???3??
		cout << "3" << endl;
	else if( a % 3 != 0 && a % 5 == 0 && a % 7 != 0 )//???5??
		cout << "5" << endl;
	else if( a % 3 != 0 && a % 5 != 0 && a % 7 == 0 )//???7??
		cout << "7" << endl;
	else                                             //???3,5,7??
		cout << "n" << endl;
	return 0;
}