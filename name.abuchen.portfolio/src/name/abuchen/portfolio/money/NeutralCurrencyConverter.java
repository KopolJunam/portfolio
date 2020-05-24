/**
 * A currency converter that doesn't convert for the purpose of showing original
 * values
 */
package name.abuchen.portfolio.money;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class NeutralCurrencyConverter implements CurrencyConverter
{

    @Override
    public Money convert(LocalDate date, Money amount)
    {
        return amount;
    }

    @Override
    public Quote convert(LocalDate date, Quote quote)
    {
        return quote;
    }

    @Override
    public Money convert(LocalDateTime date, Money amount)
    {
        return amount;
    }

    @Override
    public String getTermCurrency()
    {
        throw new RuntimeException("getTermCurrency must not be called for a neutral currency converter"); //$NON-NLS-1$
    }

    @Override
    public ExchangeRate getRate(LocalDate date, String currencyCode)
    {
        throw new RuntimeException("getRate function must not be called for a neutral currency converter"); //$NON-NLS-1$
    }

    @Override
    public CurrencyConverter with(String currencyCode)
    {
        throw new RuntimeException("The function \"with\" must not be called for a neutral currency converter"); //$NON-NLS-1$
    }
}
