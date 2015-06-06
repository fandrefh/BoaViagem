package br.com.casadocodigo.boaviagem;

import java.util.Calendar;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class ViagemActivity extends Activity {
	
	private int ano, mes, dia;
	private Button dataSaida, dataChegada;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_novaviagem);
		
		Calendar calendar = Calendar.getInstance();
		ano = calendar.get(Calendar.YEAR);
		mes = calendar.get(Calendar.MONTH);
		dia = calendar.get(Calendar.DAY_OF_MONTH);
		
		dataSaida = (Button) findViewById(R.id.dataSaida);
		dataChegada = (Button) findViewById(R.id.dataChegada);
		
		dataSaida.setText(dia + "/" + (mes+1) + "/" + ano);
		dataChegada.setText(dia + "/" + (mes+1) + "/" + ano);
		
	}
	
	public void selecionarData(View view) {
		onCreateDialog(view.getId()).show();
	}
	
	@Override
	public Dialog onCreateDialog(int id) {
		switch (id) {
		case R.id.dataSaida:
			return new DatePickerDialog(this, dataSaidaListener, ano, mes, dia);
		case R.id.dataChegada:
			return new DatePickerDialog(this, dataChegadaListener, ano, mes, dia);
		}
		return null;
	}
	
	private OnDateSetListener dataSaidaListener = new OnDateSetListener() {
		@Override
		public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
			//Vamos implementar depois com inflaters
		}
	};
	
	private OnDateSetListener dataChegadaListener = new OnDateSetListener() {
		@Override
		public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
			//Vamos implementar depois com inflaters
		}
	};

}
