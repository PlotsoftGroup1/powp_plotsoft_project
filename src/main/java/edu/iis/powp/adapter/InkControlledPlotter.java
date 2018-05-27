package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.observer.Subscriber;

public class InkControlledPlotter implements IPlotter{

    IPlotter plotter;

    public InkControlledPlotter(IPlotter plotter){
        this.plotter = plotter;
    }

    @Override
    public void setPosition(int x, int y) {
        plotter.setPosition(x, y);
    }

    @Override
    public void drawTo(int x, int y) {
        plotter.drawTo(x, y);

        System.out.println(x + " " + y);
    }
}
