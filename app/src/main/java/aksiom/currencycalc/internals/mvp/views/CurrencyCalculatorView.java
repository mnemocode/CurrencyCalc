package aksiom.currencycalc.internals.mvp.views;

import java.util.List;

import aksiom.currencycalc.internals.mvp.MVP;
import aksiom.currencycalc.realm.Currency;

/**
 * Created by Aksiom on 6/29/2016.
 */
public interface CurrencyCalculatorView extends MVP.View {

    void populateList(List<Currency> data);

    void showConverted(double result);

    void changeCurrency(String currencyCode);

    void swapCurrencies();
}
