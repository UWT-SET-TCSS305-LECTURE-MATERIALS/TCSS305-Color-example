package edu.uw.tcss.app.styles;

import java.awt.*;

public class ColorModelWithAlpha extends ColorModel{

    private int myApla;

    public ColorModelWithAlpha() {
        super();
        myApla = MIN_VALUE;
    }

    public ColorModelWithAlpha(final int theRed, final int theGreen, final int theBlue, final int theAlpha) {
        super(theRed, theGreen, theBlue);
        setAlpha(theAlpha);
    }

    public final void setAlpha(final int theAlpha) {
        if (theAlpha < MIN_VALUE || theAlpha > MAX_VALUE) {
            throw new IllegalArgumentException("The value for alpha must be [0-255]. ");
        }
        myApla = theAlpha;
    }

    @Override
    public Color getColor() {
        return new Color(super.getRed(), getGreen(), getBlue(), myApla);
    }

    @Override
    public String getHexCode() {
        return super.getHexCode() + getHex(myApla);
    }
}
