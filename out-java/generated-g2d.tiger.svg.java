

import java.awt.*;
import java.awt.geom.*;
import javax.swing.Icon; 

/**
 * This class has been automatically generated using svg2java
 * 
 */
public class ResultingClassName implements Icon {
	
	private float origAlpha = 1.0f;

	/**
	 * Paints the transcoded SVG image on the specified graphics context. You
	 * can install a custom transformation on the graphics context to scale the
	 * image.
	 * 
	 * @param g
	 *            Graphics context.
	 */
	public void paint(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
		// _0
		AffineTransform trans_0 = g.getTransform();
		paintRootGraphicsNode_0(g);
		g.setTransform(trans_0);

	}

	private void paintShapeNode_0_0_0_0_0(Graphics2D g) {
		GeneralPath shape0 = new GeneralPath();
		shape0.moveTo(-122.3, 84.285);
		shape0.curveTo(-122.3, 84.285, -122.200005, 86.179, -123.03001, 86.16);
		shape0.curveTo(-123.850006, 86.14101, -140.3, 38.066, -160.83, 40.309002);
		shape0.curveTo(-160.83, 40.309002, -143.05, 32.956, -122.3, 84.285);
		shape0.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape0);
		g.setPaint(new Color(0, 0, 0, 255));
		g.setStroke(new BasicStroke(0.172f,0,0,4.0f,null,0.0f));
		g.draw(shape0);
	}

	private void paintCompositeGraphicsNode_0_0_0_0(Graphics2D g) {
		// _0_0_0_0_0
		AffineTransform trans_0_0_0_0_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_0_0(g);
		g.setTransform(trans_0_0_0_0_0);
	}

	private void paintShapeNode_0_0_0_1_0(Graphics2D g) {
		GeneralPath shape1 = new GeneralPath();
		shape1.moveTo(-118.77, 81.262);
		shape1.curveTo(-118.77, 81.262, -119.32, 83.078, -120.09, 82.779);
		shape1.curveTo(-120.85999, 82.481, -119.979996, 31.675, -140.04, 26.800999);
		shape1.curveTo(-140.04, 26.800999, -120.81999, 25.936998, -118.76999, 81.26199);
		shape1.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape1);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape1);
	}

	private void paintCompositeGraphicsNode_0_0_0_1(Graphics2D g) {
		// _0_0_0_1_0
		AffineTransform trans_0_0_0_1_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_1_0(g);
		g.setTransform(trans_0_0_0_1_0);
	}

	private void paintShapeNode_0_0_0_2_0(Graphics2D g) {
		GeneralPath shape2 = new GeneralPath();
		shape2.moveTo(-91.284, 123.59);
		shape2.curveTo(-91.284, 123.59, -89.647995, 124.549995, -90.118, 125.229996);
		shape2.curveTo(-90.589, 125.899994, -139.76, 113.1, -149.22, 131.45999);
		shape2.curveTo(-149.22, 131.45999, -145.54001, 112.56999, -91.284, 123.58999);
		shape2.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape2);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape2);
	}

	private void paintCompositeGraphicsNode_0_0_0_2(Graphics2D g) {
		// _0_0_0_2_0
		AffineTransform trans_0_0_0_2_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_2_0(g);
		g.setTransform(trans_0_0_0_2_0);
	}

	private void paintShapeNode_0_0_0_3_0(Graphics2D g) {
		GeneralPath shape3 = new GeneralPath();
		shape3.moveTo(-94.093, 133.8);
		shape3.curveTo(-94.093, 133.8, -92.237, 134.2, -92.471, 134.99);
		shape3.curveTo(-92.704, 135.78, -143.41, 139.12001, -146.6, 159.52);
		shape3.curveTo(-146.6, 159.52, -149.06001, 140.44, -94.093, 133.8);
		shape3.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape3);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape3);
	}

	private void paintCompositeGraphicsNode_0_0_0_3(Graphics2D g) {
		// _0_0_0_3_0
		AffineTransform trans_0_0_0_3_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_3_0(g);
		g.setTransform(trans_0_0_0_3_0);
	}

	private void paintShapeNode_0_0_0_4_0(Graphics2D g) {
		GeneralPath shape4 = new GeneralPath();
		shape4.moveTo(-98.304, 128.28);
		shape4.curveTo(-98.304, 128.28, -96.526, 128.94, -96.872, 129.69);
		shape4.curveTo(-97.218, 130.44, -147.87, 126.350006, -154.0, 146.06);
		shape4.curveTo(-154.0, 146.06, -153.65, 126.82, -98.304, 128.28);
		shape4.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape4);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape4);
	}

	private void paintCompositeGraphicsNode_0_0_0_4(Graphics2D g) {
		// _0_0_0_4_0
		AffineTransform trans_0_0_0_4_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_4_0(g);
		g.setTransform(trans_0_0_0_4_0);
	}

	private void paintShapeNode_0_0_0_5_0(Graphics2D g) {
		GeneralPath shape5 = new GeneralPath();
		shape5.moveTo(-109.01, 110.07);
		shape5.curveTo(-109.01, 110.07, -107.700005, 111.45, -108.340004, 111.97);
		shape5.curveTo(-108.98, 112.490005, -152.72, 86.634, -166.87, 101.68);
		shape5.curveTo(-166.87, 101.68, -158.12999, 84.533005, -109.009995, 110.07);
		shape5.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape5);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape5);
	}

	private void paintCompositeGraphicsNode_0_0_0_5(Graphics2D g) {
		// _0_0_0_5_0
		AffineTransform trans_0_0_0_5_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_5_0(g);
		g.setTransform(trans_0_0_0_5_0);
	}

	private void paintShapeNode_0_0_0_6_0(Graphics2D g) {
		GeneralPath shape6 = new GeneralPath();
		shape6.moveTo(-116.55, 114.26);
		shape6.curveTo(-116.55, 114.26, -115.100006, 115.48, -115.670006, 116.07);
		shape6.curveTo(-116.25001, 116.659996, -162.64001, 95.922, -174.99, 112.47);
		shape6.curveTo(-174.99, 112.47, -168.25, 94.447, -116.55, 114.26);
		shape6.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape6);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape6);
	}

	private void paintCompositeGraphicsNode_0_0_0_6(Graphics2D g) {
		// _0_0_0_6_0
		AffineTransform trans_0_0_0_6_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_6_0(g);
		g.setTransform(trans_0_0_0_6_0);
	}

	private void paintShapeNode_0_0_0_7_0(Graphics2D g) {
		GeneralPath shape7 = new GeneralPath();
		shape7.moveTo(-119.15, 118.34);
		shape7.curveTo(-119.15, 118.34, -117.55, 119.34, -118.04, 120.009995);
		shape7.curveTo(-118.53, 120.67, -167.31, 106.45, -177.29001, 124.52);
		shape7.curveTo(-177.29001, 124.52, -173.07, 105.75, -119.15001, 118.34);
		shape7.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape7);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape7);
	}

	private void paintCompositeGraphicsNode_0_0_0_7(Graphics2D g) {
		// _0_0_0_7_0
		AffineTransform trans_0_0_0_7_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_7_0(g);
		g.setTransform(trans_0_0_0_7_0);
	}

	private void paintShapeNode_0_0_0_8_0(Graphics2D g) {
		GeneralPath shape8 = new GeneralPath();
		shape8.moveTo(-108.42, 118.95);
		shape8.curveTo(-108.42, 118.95, -107.299995, 120.479996, -108.0, 120.92);
		shape8.curveTo(-108.7, 121.35, -148.77, 90.102, -164.73, 103.21);
		shape8.curveTo(-164.73, 103.21, -153.86, 87.326, -108.42, 118.95);
		shape8.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape8);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape8);
	}

	private void paintCompositeGraphicsNode_0_0_0_8(Graphics2D g) {
		// _0_0_0_8_0
		AffineTransform trans_0_0_0_8_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_8_0(g);
		g.setTransform(trans_0_0_0_8_0);
	}

	private void paintShapeNode_0_0_0_9_0(Graphics2D g) {
		GeneralPath shape9 = new GeneralPath();
		shape9.moveTo(-128.2, 90.0);
		shape9.curveTo(-128.2, 90.0, -127.6, 91.8, -128.4, 92.0);
		shape9.curveTo(-129.19998, 92.2, -157.79999, 50.2, -177.0, 57.8);
		shape9.curveTo(-177.0, 57.8, -161.8, 46.0, -128.2, 90.0);
		shape9.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape9);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape9);
	}

	private void paintCompositeGraphicsNode_0_0_0_9(Graphics2D g) {
		// _0_0_0_9_0
		AffineTransform trans_0_0_0_9_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_9_0(g);
		g.setTransform(trans_0_0_0_9_0);
	}

	private void paintShapeNode_0_0_0_10_0(Graphics2D g) {
		GeneralPath shape10 = new GeneralPath();
		shape10.moveTo(-127.5, 96.979);
		shape10.curveTo(-127.5, 96.979, -126.53, 98.607994, -127.27, 98.975);
		shape10.curveTo(-128.01, 99.342995, -164.98999, 64.49899, -182.1, 76.061);
		shape10.curveTo(-182.1, 76.061, -169.8, 61.260998, -127.50001, 96.979);
		shape10.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape10);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape10);
	}

	private void paintCompositeGraphicsNode_0_0_0_10(Graphics2D g) {
		// _0_0_0_10_0
		AffineTransform trans_0_0_0_10_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_10_0(g);
		g.setTransform(trans_0_0_0_10_0);
	}

	private void paintShapeNode_0_0_0_11_0(Graphics2D g) {
		GeneralPath shape11 = new GeneralPath();
		shape11.moveTo(-127.62, 101.35);
		shape11.curveTo(-127.62, 101.35, -126.5, 102.88, -127.200005, 103.32);
		shape11.curveTo(-127.9, 103.75, -167.97, 72.502, -183.93001, 85.607);
		shape11.curveTo(-183.93001, 85.607, -173.06001, 69.726006, -127.62001, 101.350006);
		shape11.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape11);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape11);
	}

	private void paintCompositeGraphicsNode_0_0_0_11(Graphics2D g) {
		// _0_0_0_11_0
		AffineTransform trans_0_0_0_11_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_11_0(g);
		g.setTransform(trans_0_0_0_11_0);
	}

	private void paintShapeNode_0_0_0_12_0(Graphics2D g) {
		GeneralPath shape12 = new GeneralPath();
		shape12.moveTo(-129.83, 103.06);
		shape12.curveTo(-129.33, 109.11, -128.34, 115.68, -126.6, 118.799995);
		shape12.curveTo(-126.6, 118.799995, -130.2, 131.2, -121.4, 144.4);
		shape12.curveTo(-121.4, 144.4, -121.8, 151.59999, -120.200005, 154.79999);
		shape12.curveTo(-120.200005, 154.79999, -116.200005, 163.19998, -111.4, 163.99998);
		shape12.curveTo(-107.520004, 164.64998, -98.793, 167.71999, -88.932, 169.11998);
		shape12.curveTo(-88.932, 169.11998, -71.8, 183.19998, -75.0, 195.99998);
		shape12.curveTo(-75.0, 195.99998, -75.4, 212.39998, -79.0, 213.99998);
		shape12.curveTo(-79.0, 213.99998, -67.4, 202.79999, -77.0, 219.59999);
		shape12.lineTo(-81.4, 238.4);
		shape12.curveTo(-81.4, 238.4, -55.800003, 216.79999, -71.4, 235.2);
		shape12.lineTo(-81.4, 261.2);
		shape12.curveTo(-81.4, 261.2, -61.800003, 242.80002, -69.0, 251.20001);
		shape12.lineTo(-72.2, 260.0);
		shape12.curveTo(-72.2, 260.0, -28.999996, 232.8, -59.799995, 262.4);
		shape12.curveTo(-59.799995, 262.4, -51.799995, 258.8, -47.399994, 261.6);
		shape12.curveTo(-47.399994, 261.6, -40.599995, 260.4, -41.399994, 262.0);
		shape12.curveTo(-41.399994, 262.0, -62.199993, 272.4, -65.799995, 290.8);
		shape12.curveTo(-65.799995, 290.8, -57.399994, 280.8, -60.599995, 291.59998);
		shape12.lineTo(-60.199993, 303.19998);
		shape12.curveTo(-60.199993, 303.19998, -56.199993, 281.59998, -56.599995, 319.19998);
		shape12.curveTo(-56.599995, 319.19998, -37.399994, 301.19998, -48.999996, 321.99997);
		shape12.lineTo(-48.999996, 338.79996);
		shape12.curveTo(-48.999996, 338.79996, -33.799995, 322.39996, -40.199997, 335.19995);
		shape12.curveTo(-40.199997, 335.19995, -30.199997, 326.39996, -34.199997, 341.59995);
		shape12.curveTo(-34.199997, 341.59995, -34.999996, 351.99994, -30.599997, 340.79996);
		shape12.curveTo(-30.599997, 340.79996, -14.599997, 310.19995, -20.599997, 336.39996);
		shape12.curveTo(-20.599997, 336.39996, -21.399996, 355.59998, -16.599997, 340.79996);
		shape12.curveTo(-16.599997, 340.79996, -16.199997, 351.19995, -6.999996, 358.39996);
		shape12.curveTo(-6.999996, 358.39996, -8.199996, 307.59998, 4.600004, 343.59998);
		shape12.lineTo(8.600004, 359.99997);
		shape12.curveTo(8.600004, 359.99997, 11.400004, 350.79996, 11.000004, 345.59998);
		shape12.lineTo(19.000004, 353.59998);
		shape12.curveTo(19.000004, 353.59998, 34.200005, 330.8, 31.000004, 343.99997);
		shape12.curveTo(31.000004, 343.99997, 23.400003, 359.99997, 25.000004, 364.79996);
		shape12.curveTo(25.000004, 364.79996, 41.800003, 329.99997, 43.000004, 328.39996);
		shape12.curveTo(43.000004, 328.39996, 41.000004, 370.79996, 51.800003, 334.79996);
		shape12.curveTo(51.800003, 334.79996, 57.4, 346.79996, 54.600002, 351.19995);
		shape12.curveTo(54.600002, 351.19995, 62.600002, 343.19995, 61.800003, 339.99994);
		shape12.curveTo(61.800003, 339.99994, 66.4, 331.79993, 69.200005, 345.39993);
		shape12.curveTo(69.200005, 345.39993, 71.00001, 354.79993, 72.600006, 351.59995);
		shape12.curveTo(72.600006, 351.59995, 76.600006, 375.59995, 77.8, 352.79996);
		shape12.curveTo(77.8, 352.79996, 79.4, 339.19995, 72.200005, 327.59995);
		shape12.curveTo(72.200005, 327.59995, 73.00001, 324.39993, 70.200005, 320.39993);
		shape12.curveTo(70.200005, 320.39993, 83.8, 341.99994, 76.600006, 313.19992);
		shape12.curveTo(76.600006, 313.19992, 87.80101, 321.19992, 89.00101, 321.19992);
		shape12.curveTo(89.00101, 321.19992, 75.40001, 297.9999, 84.200005, 302.79993);
		shape12.curveTo(84.200005, 302.79993, 79.00001, 292.39993, 97.00101, 304.39993);
		shape12.curveTo(97.00101, 304.39993, 81.00001, 288.39993, 98.601006, 297.99994);
		shape12.curveTo(98.601006, 297.99994, 106.600006, 304.39993, 99.00101, 294.39993);
		shape12.curveTo(99.00101, 294.39993, 84.600006, 278.39993, 106.600006, 296.39993);
		shape12.curveTo(106.600006, 296.39993, 118.200005, 312.79993, 119.00001, 315.59995);
		shape12.curveTo(119.00001, 315.59995, 109.00001, 286.39993, 104.600006, 283.59995);
		shape12.curveTo(104.600006, 283.59995, 113.00001, 247.19995, 154.20001, 262.79996);
		shape12.curveTo(154.20001, 262.79996, 161.00002, 279.99997, 165.40001, 261.59995);
		shape12.curveTo(165.40001, 261.59995, 178.20001, 255.19995, 189.40001, 282.79996);
		shape12.curveTo(189.40001, 282.79996, 193.40001, 269.19995, 192.6, 266.39996);
		shape12.curveTo(192.6, 266.39996, 199.40001, 267.59998, 198.6, 266.39996);
		shape12.curveTo(198.6, 266.39996, 211.8, 270.79996, 213.0, 269.99997);
		shape12.curveTo(213.0, 269.99997, 219.8, 276.79996, 220.2, 273.19998);
		shape12.curveTo(220.2, 273.19998, 229.4, 275.99997, 227.4, 272.4);
		shape12.curveTo(227.4, 272.4, 236.2, 288.0, 236.59999, 291.6);
		shape12.lineTo(238.99998, 277.6);
		shape12.lineTo(240.99998, 280.4);
		shape12.curveTo(240.99998, 280.4, 242.59999, 272.8, 241.79999, 271.6);
		shape12.curveTo(240.99998, 270.40002, 261.8, 278.4, 266.59998, 299.2);
		shape12.lineTo(268.59998, 307.6);
		shape12.curveTo(268.59998, 307.6, 274.59998, 292.80002, 272.99997, 288.80002);
		shape12.curveTo(272.99997, 288.80002, 278.19998, 289.6, 278.59998, 294.00003);
		shape12.curveTo(278.59998, 294.00003, 282.59998, 270.80002, 277.8, 264.80002);
		shape12.curveTo(277.8, 264.80002, 282.19998, 264.00003, 283.4, 267.6);
		shape12.lineTo(283.4, 260.4);
		shape12.curveTo(283.4, 260.4, 290.6, 261.19998, 290.6, 258.8);
		shape12.curveTo(290.6, 258.8, 295.0, 254.79999, 297.0, 259.59998);
		shape12.curveTo(297.0, 259.59998, 284.6, 224.39998, 303.0, 243.59998);
		shape12.curveTo(303.0, 243.59998, 310.2, 254.39998, 306.6, 235.59998);
		shape12.curveTo(303.0, 216.79997, 299.0, 215.19998, 303.80002, 214.79997);
		shape12.curveTo(303.80002, 214.79997, 304.6, 211.19997, 302.6, 209.59998);
		shape12.curveTo(300.6, 207.99998, 303.80002, 209.59998, 303.80002, 209.59998);
		shape12.curveTo(303.80002, 209.59998, 308.6, 213.59998, 303.40002, 191.59998);
		shape12.curveTo(303.40002, 191.59998, 309.80002, 193.19998, 297.80002, 163.99997);
		shape12.curveTo(297.80002, 163.99997, 300.6, 161.59998, 296.6, 153.19997);
		shape12.curveTo(296.6, 153.19997, 304.6, 157.59996, 307.4, 155.99997);
		shape12.curveTo(307.4, 155.99997, 307.0, 154.39996, 303.8, 150.39996);
		shape12.curveTo(303.8, 150.39996, 282.19998, 95.59996, 302.59998, 117.59996);
		shape12.curveTo(302.59998, 117.59996, 314.44998, 131.14996, 308.05, 108.34996);
		shape12.curveTo(308.05, 108.34996, 298.94, 84.34096, 299.72, 80.04496);
		shape12.lineTo(-129.82999, 103.05996);
		shape12.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape12);
		g.setPaint(new Color(0, 0, 0, 255));
		g.setStroke(new BasicStroke(1.0f,0,0,4.0f,null,0.0f));
		g.draw(shape12);
	}

	private void paintCompositeGraphicsNode_0_0_0_12(Graphics2D g) {
		// _0_0_0_12_0
		AffineTransform trans_0_0_0_12_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_12_0(g);
		g.setTransform(trans_0_0_0_12_0);
	}

	private void paintShapeNode_0_0_0_13_0(Graphics2D g) {
		GeneralPath shape13 = new GeneralPath();
		shape13.moveTo(299.72, 80.245);
		shape13.curveTo(300.34, 80.426, 302.55, 81.55, 303.8, 83.200005);
		shape13.curveTo(303.8, 83.200005, 310.59998, 94.00001, 305.4, 75.600006);
		shape13.curveTo(305.4, 75.600006, 296.19998, 46.800007, 305.0, 58.000008);
		shape13.curveTo(305.0, 58.000008, 311.0, 65.200005, 307.8, 51.600006);
		shape13.curveTo(303.94, 35.173004, 301.4, 28.800007, 301.4, 28.800007);
		shape13.curveTo(301.4, 28.800007, 313.0, 33.600006, 286.19998, -5.9999924);
		shape13.lineTo(294.99997, -2.3999925);
		shape13.curveTo(294.99997, -2.3999925, 275.39996, -41.999992, 253.79997, -47.199993);
		shape13.lineTo(245.79997, -53.199993);
		shape13.curveTo(245.79997, -53.199993, 284.19998, -91.2, 271.39996, -128.0);
		shape13.curveTo(271.39996, -128.0, 264.59998, -133.2, 254.99997, -124.0);
		shape13.curveTo(254.99997, -124.0, 248.59998, -119.2, 242.59998, -120.8);
		shape13.curveTo(242.59998, -120.8, 211.79997, -119.600006, 209.79997, -119.600006);
		shape13.curveTo(207.79997, -119.600006, 172.99997, -156.8, 107.39997, -139.20001);
		shape13.curveTo(107.39997, -139.20001, 102.199974, -137.20001, 97.80097, -138.40001);
		shape13.curveTo(97.80097, -138.40001, 79.39997, -154.40001, 30.599976, -131.6);
		shape13.curveTo(30.599976, -131.6, 20.599976, -129.6, 18.999975, -129.6);
		shape13.curveTo(17.399975, -129.6, 14.599976, -129.6, 6.5999756, -123.200005);
		shape13.curveTo(-1.4000244, -116.8, -1.800024, -116.00001, -3.800024, -114.4);
		shape13.curveTo(-3.800024, -114.4, -20.200024, -103.200005, -25.000025, -102.4);
		shape13.curveTo(-25.000025, -102.4, -36.600025, -96.0, -41.000023, -86.0);
		shape13.lineTo(-44.60002, -84.8);
		shape13.curveTo(-44.60002, -84.8, -46.20002, -77.600006, -46.60002, -76.4);
		shape13.curveTo(-46.60002, -76.4, -51.40002, -72.8, -52.20002, -67.200005);
		shape13.curveTo(-52.20002, -67.200005, -61.00002, -61.200005, -60.60002, -56.800003);
		shape13.curveTo(-60.60002, -56.800003, -62.20002, -51.600002, -63.000023, -46.800003);
		shape13.curveTo(-63.000023, -46.800003, -70.20002, -42.000004, -69.400024, -39.200005);
		shape13.curveTo(-69.400024, -39.200005, -77.00002, -25.200005, -75.800026, -18.400005);
		shape13.curveTo(-75.800026, -18.400005, -82.20003, -18.800005, -85.00002, -16.400005);
		shape13.curveTo(-85.00002, -16.400005, -85.800026, -11.600005, -87.400024, -11.200006);
		shape13.curveTo(-87.400024, -11.200006, -90.20003, -10.000006, -87.800026, -6.0000057);
		shape13.curveTo(-87.800026, -6.0000057, -89.400024, -3.2000058, -89.800026, -1.6000056);
		shape13.curveTo(-89.800026, -1.6000056, -89.00002, 1.1999943, -93.400024, 6.799994);
		shape13.curveTo(-93.400024, 6.799994, -99.800026, 25.599993, -97.800026, 30.799994);
		shape13.curveTo(-97.800026, 30.799994, -97.400024, 35.599995, -100.20003, 37.199993);
		shape13.curveTo(-100.20003, 37.199993, -103.800026, 36.79999, -95.400024, 48.799995);
		shape13.curveTo(-95.400024, 48.799995, -94.60002, 49.999996, -97.800026, 52.399994);
		shape13.curveTo(-97.800026, 52.399994, -115.00003, 55.999992, -117.400024, 72.399994);
		shape13.curveTo(-117.400024, 72.399994, -131.00003, 87.2, -131.00003, 92.399994);
		shape13.curveTo(-131.00003, 94.704994, -130.73003, 97.852, -130.03003, 102.45999);
		shape13.curveTo(-130.03003, 102.45999, -130.60004, 110.79999, -103.00003, 111.59999);
		shape13.curveTo(-75.400024, 112.399994, 299.71997, 80.244995, 299.71997, 80.244995);
		shape13.closePath();
		g.setPaint(new Color(204, 114, 38, 255));
		g.fill(shape13);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape13);
	}

	private void paintCompositeGraphicsNode_0_0_0_13(Graphics2D g) {
		// _0_0_0_13_0
		AffineTransform trans_0_0_0_13_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_13_0(g);
		g.setTransform(trans_0_0_0_13_0);
	}

	private void paintShapeNode_0_0_0_14_0(Graphics2D g) {
		GeneralPath shape14 = new GeneralPath();
		shape14.moveTo(-115.6, 102.6);
		shape14.curveTo(-140.6, 63.199997, -126.2, 119.6, -126.2, 119.6);
		shape14.curveTo(-117.399994, 154.0, 12.199997, 116.4, 12.199997, 116.4);
		shape14.curveTo(12.199997, 116.4, 181.0, 86.0, 192.2, 82.0);
		shape14.curveTo(203.4, 78.0, 298.6, 84.4, 298.6, 84.4);
		shape14.lineTo(293.0, 67.600006);
		shape14.curveTo(228.2, 21.200005, 209.0, 44.400005, 195.4, 40.400005);
		shape14.curveTo(181.79999, 36.400005, 184.2, 46.000004, 181.0, 46.800007);
		shape14.curveTo(177.8, 47.60001, 138.6, 22.800007, 132.2, 23.600006);
		shape14.curveTo(125.79999, 24.400005, 100.46, 0.6490059, 115.399994, 32.400005);
		shape14.curveTo(131.4, 66.40001, 56.999992, 71.600006, 40.199997, 60.400005);
		shape14.curveTo(23.400002, 49.200005, 47.399998, 78.8, 47.399998, 78.8);
		shape14.curveTo(65.799995, 98.8, 31.399998, 82.0, 31.399998, 82.0);
		shape14.curveTo(-3.0000038, 69.2, -27.000004, 94.8, -30.2, 95.6);
		shape14.curveTo(-33.399998, 96.399994, -38.2, 99.6, -39.0, 93.2);
		shape14.curveTo(-39.8, 86.799995, -47.31, 70.099, -79.0, 96.399994);
		shape14.curveTo(-99.0, 112.99999, -112.8, 90.99999, -112.8, 90.99999);
		shape14.lineTo(-115.600006, 102.59999);
		shape14.closePath();
		g.setPaint(new Color(204, 114, 38, 255));
		g.fill(shape14);
	}

	private void paintCompositeGraphicsNode_0_0_0_14(Graphics2D g) {
		// _0_0_0_14_0
		AffineTransform trans_0_0_0_14_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_14_0(g);
		g.setTransform(trans_0_0_0_14_0);
	}

	private void paintShapeNode_0_0_0_15_0(Graphics2D g) {
		GeneralPath shape15 = new GeneralPath();
		shape15.moveTo(133.51, 25.346);
		shape15.curveTo(127.10999, 26.146, 101.73999, 2.4070015, 116.70999, 34.146);
		shape15.curveTo(133.31, 69.346, 58.30999, 73.346, 41.509995, 62.146);
		shape15.curveTo(24.708994, 50.946, 48.709995, 80.546, 48.709995, 80.546);
		shape15.curveTo(67.10999, 100.549995, 32.708996, 83.745995, 32.708996, 83.745995);
		shape15.curveTo(-1.6910057, 70.94599, -25.691006, 96.546, -28.891003, 97.34599);
		shape15.curveTo(-32.091, 98.14599, -36.891003, 101.34999, -37.691, 94.94599);
		shape15.curveTo(-38.491, 88.54599, -45.870003, 72.01199, -77.691, 98.14599);
		shape15.curveTo(-98.927, 115.48999, -112.42, 94.03699, -112.42, 94.03699);
		shape15.lineTo(-115.619995, 104.14999);
		shape15.curveTo(-140.62, 64.345985, -125.549995, 122.65999, -125.549995, 122.65999);
		shape15.curveTo(-116.74, 157.06, 13.510002, 118.14999, 13.510002, 118.14999);
		shape15.curveTo(13.510002, 118.14999, 182.31, 87.74599, 193.51001, 83.74599);
		shape15.curveTo(204.71002, 79.74599, 299.04, 86.07299, 299.04, 86.07299);
		shape15.lineTo(293.51, 68.76399);
		shape15.curveTo(228.71, 22.36399, 210.31001, 46.145992, 196.71, 42.145992);
		shape15.curveTo(183.11, 38.145992, 185.51001, 47.74599, 182.31001, 48.545994);
		shape15.curveTo(179.11002, 49.345997, 139.91, 24.545994, 133.51001, 25.345993);
		shape15.closePath();
		g.setPaint(new Color(232, 127, 58, 255));
		g.fill(shape15);
	}

	private void paintCompositeGraphicsNode_0_0_0_15(Graphics2D g) {
		// _0_0_0_15_0
		AffineTransform trans_0_0_0_15_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_15_0(g);
		g.setTransform(trans_0_0_0_15_0);
	}

	private void paintShapeNode_0_0_0_16_0(Graphics2D g) {
		GeneralPath shape16 = new GeneralPath();
		shape16.moveTo(134.82, 27.091);
		shape16.curveTo(128.42001, 27.890999, 103.68001, 3.8619995, 118.020004, 35.891);
		shape16.curveTo(134.22, 72.091995, 59.619003, 75.091995, 42.819008, 63.892);
		shape16.curveTo(26.019012, 52.692, 50.01901, 82.292, 50.01901, 82.292);
		shape16.curveTo(68.41901, 102.29, 34.01901, 85.492, 34.01901, 85.492);
		shape16.curveTo(-0.3809929, 72.69199, -24.381992, 98.292, -27.581993, 99.091995);
		shape16.curveTo(-30.781994, 99.89199, -35.581993, 103.09, -36.381992, 96.69199);
		shape16.curveTo(-37.18199, 90.29199, -44.429993, 73.924995, -76.38199, 99.89199);
		shape16.curveTo(-98.85499, 117.97999, -112.03999, 97.07399, -112.03999, 97.07399);
		shape16.lineTo(-115.63999, 105.68999);
		shape16.curveTo(-139.43999, 66.691986, -124.88999, 125.70999, -124.88999, 125.70999);
		shape16.curveTo(-116.08999, 160.10999, 14.820015, 119.88999, 14.820015, 119.88999);
		shape16.curveTo(14.820015, 119.88999, 183.62003, 89.49199, 194.82, 85.49199);
		shape16.curveTo(206.01999, 81.49199, 299.47, 87.74599, 299.47, 87.74599);
		shape16.lineTo(294.02, 69.927986);
		shape16.curveTo(229.21999, 23.527985, 211.62, 47.890984, 198.01999, 43.890984);
		shape16.curveTo(184.41998, 39.890984, 186.81999, 49.490982, 183.62, 50.291985);
		shape16.curveTo(180.42, 51.091984, 141.22, 26.290985, 134.81999, 27.090984);
		shape16.closePath();
		g.setPaint(new Color(234, 140, 77, 255));
		g.fill(shape16);
	}

	private void paintCompositeGraphicsNode_0_0_0_16(Graphics2D g) {
		// _0_0_0_16_0
		AffineTransform trans_0_0_0_16_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_16_0(g);
		g.setTransform(trans_0_0_0_16_0);
	}

	private void paintShapeNode_0_0_0_17_0(Graphics2D g) {
		GeneralPath shape17 = new GeneralPath();
		shape17.moveTo(136.13, 28.837);
		shape17.curveTo(129.73001, 29.637, 105.00001, 5.6049995, 119.33, 37.637);
		shape17.curveTo(136.13, 75.193, 60.394, 76.482, 44.128, 65.637);
		shape17.curveTo(27.328, 54.437, 51.328, 84.037, 51.328, 84.037);
		shape17.curveTo(69.728, 104.04, 35.328, 87.237, 35.328, 87.237);
		shape17.curveTo(0.9279976, 74.437, -23.072002, 100.04, -26.272, 100.84);
		shape17.curveTo(-29.471996, 101.63999, -34.272, 104.84, -35.072, 98.437);
		shape17.curveTo(-35.871998, 92.036995, -42.989, 75.839, -75.073, 101.64);
		shape17.curveTo(-98.782, 120.47, -111.66, 100.11, -111.66, 100.11);
		shape17.lineTo(-115.66, 107.24);
		shape17.curveTo(-137.46, 70.437, -124.240005, 128.76, -124.240005, 128.76);
		shape17.curveTo(-115.44, 163.16, 16.12999, 121.63999, 16.12999, 121.63999);
		shape17.curveTo(16.12999, 121.63999, 184.93, 91.23699, 196.12999, 87.23699);
		shape17.curveTo(207.32999, 83.23699, 299.90997, 89.41899, 299.90997, 89.41899);
		shape17.lineTo(294.52997, 71.091995);
		shape17.curveTo(229.72997, 24.690994, 212.92996, 49.636993, 199.32997, 45.636993);
		shape17.curveTo(185.72998, 41.636993, 188.12997, 51.23699, 184.92998, 52.036995);
		shape17.curveTo(181.72998, 52.836998, 142.52997, 28.036995, 136.12997, 28.836994);
		shape17.closePath();
		g.setPaint(new Color(236, 153, 97, 255));
		g.fill(shape17);
	}

	private void paintCompositeGraphicsNode_0_0_0_17(Graphics2D g) {
		// _0_0_0_17_0
		AffineTransform trans_0_0_0_17_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_17_0(g);
		g.setTransform(trans_0_0_0_17_0);
	}

	private void paintShapeNode_0_0_0_18_0(Graphics2D g) {
		GeneralPath shape18 = new GeneralPath();
		shape18.moveTo(137.44, 30.583);
		shape18.curveTo(131.04001, 31.383, 106.810005, 7.1289997, 120.64, 39.383);
		shape18.curveTo(137.44, 78.583, 62.237, 78.583, 45.436996, 67.382996);
		shape18.curveTo(28.636993, 56.18299, 52.636997, 85.783, 52.636997, 85.783);
		shape18.curveTo(71.036995, 105.78, 36.636997, 88.982994, 36.636997, 88.982994);
		shape18.curveTo(2.2369957, 76.18299, -21.763004, 101.77999, -24.963001, 102.579994);
		shape18.curveTo(-28.162998, 103.38, -32.963, 106.579994, -33.763, 100.17999);
		shape18.curveTo(-34.563, 93.78299, -41.548, 77.75199, -73.763, 103.37999);
		shape18.curveTo(-98.709, 122.95999, -111.270004, 103.14999, -111.270004, 103.14999);
		shape18.lineTo(-115.670006, 108.77998);
		shape18.curveTo(-135.47, 73.98198, -123.58, 131.81998, -123.58, 131.81998);
		shape18.curveTo(-114.78, 166.21997, 17.440002, 123.379974, 17.440002, 123.379974);
		shape18.curveTo(17.440002, 123.379974, 186.24, 92.98297, 197.44, 88.98297);
		shape18.curveTo(208.64, 84.98297, 300.35, 91.09197, 300.35, 91.09197);
		shape18.lineTo(295.04, 72.254974);
		shape18.curveTo(230.24, 25.854973, 214.24, 51.382973, 200.64001, 47.382973);
		shape18.curveTo(187.04002, 43.382973, 189.44002, 52.98297, 186.24002, 53.782974);
		shape18.curveTo(183.04002, 54.582977, 143.84003, 29.782974, 137.44002, 30.582973);
		shape18.closePath();
		g.setPaint(new Color(238, 165, 117, 255));
		g.fill(shape18);
	}

	private void paintCompositeGraphicsNode_0_0_0_18(Graphics2D g) {
		// _0_0_0_18_0
		AffineTransform trans_0_0_0_18_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_18_0(g);
		g.setTransform(trans_0_0_0_18_0);
	}

	private void paintShapeNode_0_0_0_19_0(Graphics2D g) {
		GeneralPath shape19 = new GeneralPath();
		shape19.moveTo(138.75, 32.328);
		shape19.curveTo(132.35, 33.128, 106.380005, 9.677, 121.95, 41.128);
		shape19.curveTo(141.15, 79.92799, 63.545998, 80.328, 46.745995, 69.128);
		shape19.curveTo(29.945992, 57.927994, 53.945995, 87.528, 53.945995, 87.528);
		shape19.curveTo(72.34599, 107.53, 37.945995, 90.728, 37.945995, 90.728);
		shape19.curveTo(3.5459938, 77.92799, -20.454006, 103.53, -23.654003, 104.329994);
		shape19.curveTo(-26.854, 105.12999, -31.654003, 108.329994, -32.454002, 101.92999);
		shape19.curveTo(-33.254, 95.52799, -40.108, 79.66499, -72.454, 105.12999);
		shape19.curveTo(-98.636, 125.45999, -110.89, 106.17999, -110.89, 106.17999);
		shape19.lineTo(-115.69, 110.329994);
		shape19.curveTo(-133.69, 77.12799, -122.93, 134.87, -122.93, 134.87);
		shape19.curveTo(-114.13, 169.26999, 18.749992, 125.13, 18.749992, 125.13);
		shape19.curveTo(18.749992, 125.13, 187.54999, 94.728, 198.75, 90.728);
		shape19.curveTo(209.95001, 86.728, 300.78, 92.764, 300.78, 92.764);
		shape19.lineTo(295.55, 73.419);
		shape19.curveTo(230.74998, 27.018997, 215.54999, 53.128, 201.94998, 49.128);
		shape19.curveTo(188.34998, 45.128, 190.74998, 54.727997, 187.54999, 55.528);
		shape19.curveTo(184.34999, 56.328003, 145.15, 31.528, 138.74998, 32.328);
		shape19.closePath();
		g.setPaint(new Color(241, 178, 136, 255));
		g.fill(shape19);
	}

	private void paintCompositeGraphicsNode_0_0_0_19(Graphics2D g) {
		// _0_0_0_19_0
		AffineTransform trans_0_0_0_19_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_19_0(g);
		g.setTransform(trans_0_0_0_19_0);
	}

	private void paintShapeNode_0_0_0_20_0(Graphics2D g) {
		GeneralPath shape20 = new GeneralPath();
		shape20.moveTo(140.06, 34.073);
		shape20.curveTo(133.66, 34.873, 107.31, 11.613003, 123.259995, 42.873);
		shape20.curveTo(143.65999, 82.874, 64.854996, 82.074005, 48.054993, 70.874);
		shape20.curveTo(31.25499, 59.673996, 55.254993, 89.274, 55.254993, 89.274);
		shape20.curveTo(73.65499, 109.270004, 39.254993, 92.474, 39.254993, 92.474);
		shape20.curveTo(4.854992, 79.673996, -19.145008, 105.27, -22.345005, 106.07);
		shape20.curveTo(-25.545002, 106.87, -30.345005, 110.07, -31.145004, 103.67);
		shape20.curveTo(-31.945004, 97.274, -38.668003, 81.578, -71.145004, 106.869995);
		shape20.curveTo(-98.564, 127.95, -110.51001, 109.21999, -110.51001, 109.21999);
		shape20.lineTo(-115.71001, 111.869995);
		shape20.curveTo(-131.71, 81.673996, -122.270004, 137.93, -122.270004, 137.93);
		shape20.curveTo(-113.47, 172.32999, 20.050003, 126.869995, 20.050003, 126.869995);
		shape20.curveTo(20.050003, 126.869995, 188.85, 96.474, 200.05, 92.474);
		shape20.curveTo(211.25, 88.474, 301.21002, 94.437, 301.21002, 94.437);
		shape20.lineTo(296.05002, 74.58299);
		shape20.curveTo(231.25002, 28.182991, 216.85002, 54.873993, 203.25002, 50.873993);
		shape20.curveTo(189.65001, 46.872993, 192.05002, 56.47399, 188.85002, 57.273994);
		shape20.curveTo(185.65002, 58.073997, 146.45001, 33.272995, 140.05002, 34.072994);
		shape20.closePath();
		g.setPaint(new Color(243, 191, 156, 255));
		g.fill(shape20);
	}

	private void paintCompositeGraphicsNode_0_0_0_20(Graphics2D g) {
		// _0_0_0_20_0
		AffineTransform trans_0_0_0_20_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_20_0(g);
		g.setTransform(trans_0_0_0_20_0);
	}

	private void paintShapeNode_0_0_0_21_0(Graphics2D g) {
		GeneralPath shape21 = new GeneralPath();
		shape21.moveTo(141.36, 35.819);
		shape21.curveTo(134.96, 36.619, 107.520004, 13.944, 124.56, 44.619);
		shape21.curveTo(146.56, 84.218994, 66.164, 83.819, 49.364, 72.619);
		shape21.curveTo(32.563995, 61.419006, 56.564, 91.019005, 56.564, 91.019005);
		shape21.curveTo(74.964, 111.020004, 40.564, 94.219, 40.564, 94.219);
		shape21.curveTo(6.1639977, 81.419, -17.836002, 107.020004, -21.036, 107.82);
		shape21.curveTo(-24.235996, 108.619995, -29.036, 111.82, -29.835999, 105.42);
		shape21.curveTo(-30.635998, 99.019, -37.226997, 83.492, -69.836, 108.619995);
		shape21.curveTo(-98.491, 130.44, -110.13, 112.259995, -110.13, 112.259995);
		shape21.lineTo(-115.729996, 113.42);
		shape21.curveTo(-130.12999, 85.019, -121.619995, 140.98, -121.619995, 140.98);
		shape21.curveTo(-112.81999, 175.38, 21.36, 128.62, 21.36, 128.62);
		shape21.curveTo(21.36, 128.62, 190.16, 98.218994, 201.36, 94.218994);
		shape21.curveTo(212.56, 90.218994, 301.66, 96.10999, 301.66, 96.10999);
		shape21.lineTo(296.56, 75.745995);
		shape21.curveTo(231.76, 29.345993, 218.16, 56.618996, 204.56, 52.618996);
		shape21.curveTo(190.95999, 48.618996, 193.36, 58.218994, 190.16, 59.018997);
		shape21.curveTo(186.96, 59.819, 147.76001, 35.018997, 141.36, 35.818996);
		shape21.closePath();
		g.setPaint(new Color(245, 204, 176, 255));
		g.fill(shape21);
	}

	private void paintCompositeGraphicsNode_0_0_0_21(Graphics2D g) {
		// _0_0_0_21_0
		AffineTransform trans_0_0_0_21_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_21_0(g);
		g.setTransform(trans_0_0_0_21_0);
	}

	private void paintShapeNode_0_0_0_22_0(Graphics2D g) {
		GeneralPath shape22 = new GeneralPath();
		shape22.moveTo(142.67, 37.565);
		shape22.curveTo(136.27, 38.364998, 108.83, 15.688999, 125.869995, 46.364998);
		shape22.curveTo(147.87, 85.965, 67.474, 85.565, 50.673996, 74.365);
		shape22.curveTo(33.873993, 63.164993, 57.873997, 92.765, 57.873997, 92.765);
		shape22.curveTo(76.273994, 112.76, 41.873997, 95.965, 41.873997, 95.965);
		shape22.curveTo(7.4729958, 83.16499, -16.527004, 108.759995, -19.727005, 109.56);
		shape22.curveTo(-22.927006, 110.36, -27.727005, 113.56, -28.527004, 107.159996);
		shape22.curveTo(-29.327003, 100.759995, -35.786003, 85.405, -68.52701, 110.35999);
		shape22.curveTo(-98.41801, 132.93, -109.740005, 115.28999, -109.740005, 115.28999);
		shape22.lineTo(-115.740005, 114.95999);
		shape22.curveTo(-129.35, 88.563995, -120.96001, 144.04, -120.96001, 144.04);
		shape22.curveTo(-112.16, 178.44, 22.669998, 130.35999, 22.669998, 130.35999);
		shape22.curveTo(22.669998, 130.35999, 191.47, 99.96498, 202.67, 95.96498);
		shape22.curveTo(213.87, 91.96498, 302.09, 97.78298, 302.09, 97.78298);
		shape22.lineTo(297.08, 76.90998);
		shape22.curveTo(232.26999, 30.50998, 219.46999, 58.364983, 205.87, 54.364983);
		shape22.curveTo(192.27, 50.364983, 194.67, 59.96498, 191.47, 60.764984);
		shape22.curveTo(188.27, 61.564987, 149.07, 36.764984, 142.67, 37.564983);
		shape22.closePath();
		g.setPaint(new Color(248, 216, 196, 255));
		g.fill(shape22);
	}

	private void paintCompositeGraphicsNode_0_0_0_22(Graphics2D g) {
		// _0_0_0_22_0
		AffineTransform trans_0_0_0_22_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_22_0(g);
		g.setTransform(trans_0_0_0_22_0);
	}

	private void paintShapeNode_0_0_0_23_0(Graphics2D g) {
		GeneralPath shape23 = new GeneralPath();
		shape23.moveTo(143.98, 39.31);
		shape23.curveTo(137.58, 40.11, 110.53, 17.223001, 127.17999, 48.11);
		shape23.curveTo(149.18, 88.91, 68.78299, 87.31, 51.982994, 76.11);
		shape23.curveTo(35.183, 64.91, 59.182995, 94.51, 59.182995, 94.51);
		shape23.curveTo(77.58299, 114.51, 43.182995, 97.71, 43.182995, 97.71);
		shape23.curveTo(8.782993, 84.909996, -15.217007, 110.51, -18.417004, 111.31);
		shape23.curveTo(-21.618004, 112.11, -26.418003, 115.31, -27.218002, 108.909996);
		shape23.curveTo(-28.018002, 102.509995, -34.346, 87.31799, -67.218, 112.10999);
		shape23.curveTo(-98.345, 135.42, -109.36, 118.329994, -109.36, 118.329994);
		shape23.lineTo(-115.76, 116.509995);
		shape23.curveTo(-128.76001, 92.509995, -120.310005, 147.09, -120.310005, 147.09);
		shape23.curveTo(-111.51, 181.48999, 23.979988, 132.11, 23.979988, 132.11);
		shape23.curveTo(23.979988, 132.11, 192.78, 101.71, 203.97998, 97.71);
		shape23.curveTo(215.17996, 93.71, 302.52997, 99.456, 302.52997, 99.456);
		shape23.lineTo(297.57996, 78.074005);
		shape23.curveTo(232.77995, 31.673004, 220.77995, 60.110004, 207.17996, 56.110004);
		shape23.curveTo(193.57997, 52.110004, 195.97997, 61.710003, 192.77997, 62.510006);
		shape23.curveTo(189.57997, 63.31001, 150.37997, 38.510006, 143.97997, 39.310005);
		shape23.closePath();
		g.setPaint(new Color(250, 229, 215, 255));
		g.fill(shape23);
	}

	private void paintCompositeGraphicsNode_0_0_0_23(Graphics2D g) {
		// _0_0_0_23_0
		AffineTransform trans_0_0_0_23_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_23_0(g);
		g.setTransform(trans_0_0_0_23_0);
	}

	private void paintShapeNode_0_0_0_24_0(Graphics2D g) {
		GeneralPath shape24 = new GeneralPath();
		shape24.moveTo(145.29, 41.055);
		shape24.curveTo(138.89, 41.855, 112.92, 18.411001, 128.48999, 49.855);
		shape24.curveTo(149.68999, 92.656, 70.091995, 89.056, 53.291992, 77.856);
		shape24.curveTo(36.49199, 66.656006, 60.491993, 96.256004, 60.491993, 96.256004);
		shape24.curveTo(78.89199, 116.26, 44.491993, 99.456, 44.491993, 99.456);
		shape24.curveTo(10.091991, 86.656, -13.908009, 112.26, -17.108006, 113.06);
		shape24.curveTo(-20.308002, 113.85999, -25.108006, 117.06, -25.908005, 110.659996);
		shape24.curveTo(-26.708004, 104.259995, -32.905006, 89.231995, -65.908005, 113.85999);
		shape24.curveTo(-98.27301, 137.90999, -108.98, 121.35999, -108.98, 121.35999);
		shape24.lineTo(-115.78001, 118.05999);
		shape24.curveTo(-128.58, 94.85599, -119.65001, 150.15, -119.65001, 150.15);
		shape24.curveTo(-110.850006, 184.54999, 25.289993, 133.85999, 25.289993, 133.85999);
		shape24.curveTo(25.289993, 133.85999, 194.09, 103.459984, 205.29, 99.455986);
		shape24.curveTo(216.48999, 95.455986, 302.96, 101.12999, 302.96, 101.12999);
		shape24.lineTo(298.09, 79.23699);
		shape24.curveTo(233.29, 32.83699, 222.09, 61.85599, 208.48999, 57.85599);
		shape24.curveTo(194.88998, 53.854992, 197.29, 63.45599, 194.09, 64.25599);
		shape24.curveTo(190.89, 65.055984, 151.69, 40.25499, 145.29, 41.05499);
		shape24.closePath();
		g.setPaint(new Color(252, 242, 235, 255));
		g.fill(shape24);
	}

	private void paintCompositeGraphicsNode_0_0_0_24(Graphics2D g) {
		// _0_0_0_24_0
		AffineTransform trans_0_0_0_24_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_24_0(g);
		g.setTransform(trans_0_0_0_24_0);
	}

	private void paintShapeNode_0_0_0_25_0(Graphics2D g) {
		GeneralPath shape25 = new GeneralPath();
		shape25.moveTo(-115.8, 119.6);
		shape25.curveTo(-128.6, 97.6, -119.0, 153.2, -119.0, 153.2);
		shape25.curveTo(-110.2, 187.6, 26.600006, 135.59999, 26.600006, 135.59999);
		shape25.curveTo(26.600006, 135.59999, 195.40001, 105.19999, 206.6, 101.19999);
		shape25.curveTo(217.8, 97.19999, 303.40002, 102.79999, 303.40002, 102.79999);
		shape25.lineTo(298.60004, 80.39999);
		shape25.curveTo(233.80003, 33.999985, 223.40004, 63.599987, 209.80003, 59.599987);
		shape25.curveTo(196.20003, 55.599987, 198.60004, 65.19999, 195.40004, 65.999985);
		shape25.curveTo(192.20004, 66.79998, 153.00003, 41.999985, 146.60004, 42.799984);
		shape25.curveTo(140.20004, 43.599983, 114.980034, 19.792984, 129.80003, 51.599983);
		shape25.curveTo(152.03003, 99.306984, 69.04103, 89.22698, 54.600037, 79.59998);
		shape25.curveTo(37.800037, 68.39999, 61.800037, 97.999985, 61.800037, 97.999985);
		shape25.curveTo(80.200035, 117.999985, 45.800037, 101.19998, 45.800037, 101.19998);
		shape25.curveTo(11.400036, 88.39998, -12.599964, 113.999985, -15.799961, 114.79998);
		shape25.curveTo(-18.999958, 115.599976, -23.799961, 118.79998, -24.59996, 112.39998);
		shape25.curveTo(-25.39996, 105.99998, -31.46496, 91.14398, -64.59996, 115.599976);
		shape25.curveTo(-98.19996, 140.39998, -108.59996, 124.39998, -108.59996, 124.39998);
		shape25.lineTo(-115.79996, 119.599976);
		shape25.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape25);
	}

	private void paintCompositeGraphicsNode_0_0_0_25(Graphics2D g) {
		// _0_0_0_25_0
		AffineTransform trans_0_0_0_25_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_25_0(g);
		g.setTransform(trans_0_0_0_25_0);
	}

	private void paintShapeNode_0_0_0_26_0(Graphics2D g) {
		GeneralPath shape26 = new GeneralPath();
		shape26.moveTo(-74.2, 149.6);
		shape26.curveTo(-74.2, 149.6, -81.399994, 161.20001, -60.6, 174.40001);
		shape26.curveTo(-60.6, 174.40001, -59.199997, 175.8, -77.2, 171.6);
		shape26.curveTo(-77.2, 171.6, -83.399994, 169.6, -85.0, 159.20001);
		shape26.curveTo(-85.0, 159.20001, -89.8, 154.80002, -94.6, 149.20001);
		shape26.curveTo(-99.399994, 143.6, -74.2, 149.6, -74.2, 149.6);
		shape26.closePath();
		g.setPaint(new Color(0, 0, 0, 255));
		g.fill(shape26);
	}

	private void paintCompositeGraphicsNode_0_0_0_26(Graphics2D g) {
		// _0_0_0_26_0
		AffineTransform trans_0_0_0_26_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_26_0(g);
		g.setTransform(trans_0_0_0_26_0);
	}

	private void paintShapeNode_0_0_0_27_0(Graphics2D g) {
		GeneralPath shape27 = new GeneralPath();
		shape27.moveTo(65.8, 102.0);
		shape27.curveTo(65.8, 102.0, 83.498, 128.82, 82.9, 133.6);
		shape27.curveTo(81.6, 144.0, 81.4, 153.6, 84.6, 157.6);
		shape27.curveTo(87.800995, 161.6, 96.601, 194.8, 96.601, 194.8);
		shape27.curveTo(96.601, 194.8, 96.201, 196.0, 108.6, 158.0);
		shape27.curveTo(108.6, 158.0, 120.2, 142.0, 100.2, 123.6);
		shape27.curveTo(100.2, 123.6, 65.0, 94.8, 65.799995, 102.0);
		shape27.closePath();
		g.setPaint(new Color(204, 204, 204, 255));
		g.fill(shape27);
	}

	private void paintCompositeGraphicsNode_0_0_0_27(Graphics2D g) {
		// _0_0_0_27_0
		AffineTransform trans_0_0_0_27_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_27_0(g);
		g.setTransform(trans_0_0_0_27_0);
	}

	private void paintShapeNode_0_0_0_28_0(Graphics2D g) {
		GeneralPath shape28 = new GeneralPath();
		shape28.moveTo(-54.2, 176.4);
		shape28.curveTo(-54.2, 176.4, -43.0, 183.59999, -57.4, 214.79999);
		shape28.lineTo(-51.0, 212.4);
		shape28.curveTo(-51.0, 212.4, -51.8, 223.59999, -55.0, 226.0);
		shape28.lineTo(-47.8, 222.8);
		shape28.curveTo(-47.8, 222.8, -43.0, 230.8, -47.0, 235.6);
		shape28.curveTo(-47.0, 235.6, -30.2, 243.6, -31.0, 250.0);
		shape28.curveTo(-31.0, 250.0, -24.6, 242.0, -28.6, 235.6);
		shape28.curveTo(-32.6, 229.20001, -39.8, 233.20001, -39.0, 214.8);
		shape28.lineTo(-47.8, 218.0);
		shape28.curveTo(-47.8, 218.0, -42.2, 209.2, -42.2, 202.8);
		shape28.lineTo(-50.2, 205.2);
		shape28.curveTo(-50.2, 205.2, -34.731003, 178.62, -45.4, 177.2);
		shape28.curveTo(-51.4, 176.4, -54.2, 176.4, -54.2, 176.4);
		shape28.closePath();
		g.setPaint(new Color(0, 0, 0, 255));
		g.fill(shape28);
	}

	private void paintCompositeGraphicsNode_0_0_0_28(Graphics2D g) {
		// _0_0_0_28_0
		AffineTransform trans_0_0_0_28_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_28_0(g);
		g.setTransform(trans_0_0_0_28_0);
	}

	private void paintShapeNode_0_0_0_29_0(Graphics2D g) {
		GeneralPath shape29 = new GeneralPath();
		shape29.moveTo(-21.8, 193.2);
		shape29.curveTo(-21.8, 193.2, -19.0, 188.8, -21.8, 189.59999);
		shape29.curveTo(-24.599998, 190.39998, -55.8, 205.2, -61.8, 214.79999);
		shape29.curveTo(-61.8, 214.79999, -27.399998, 190.4, -21.8, 193.19998);
		shape29.closePath();
		g.setPaint(new Color(204, 204, 204, 255));
		g.fill(shape29);
	}

	private void paintCompositeGraphicsNode_0_0_0_29(Graphics2D g) {
		// _0_0_0_29_0
		AffineTransform trans_0_0_0_29_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_29_0(g);
		g.setTransform(trans_0_0_0_29_0);
	}

	private void paintShapeNode_0_0_0_30_0(Graphics2D g) {
		GeneralPath shape30 = new GeneralPath();
		shape30.moveTo(-11.4, 201.2);
		shape30.curveTo(-11.4, 201.2, -8.599999, 196.8, -11.4, 197.59999);
		shape30.curveTo(-14.2, 198.39998, -45.4, 213.2, -51.4, 222.79999);
		shape30.curveTo(-51.4, 222.79999, -17.0, 198.4, -11.400002, 201.19998);
		shape30.closePath();
		g.fill(shape30);
	}

	private void paintCompositeGraphicsNode_0_0_0_30(Graphics2D g) {
		// _0_0_0_30_0
		AffineTransform trans_0_0_0_30_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_30_0(g);
		g.setTransform(trans_0_0_0_30_0);
	}

	private void paintShapeNode_0_0_0_31_0(Graphics2D g) {
		GeneralPath shape31 = new GeneralPath();
		shape31.moveTo(1.8, 186.0);
		shape31.curveTo(1.8, 186.0, 4.6, 181.6, 1.8, 182.4);
		shape31.curveTo(-1.0, 183.19998, -32.2, 198.0, -38.2, 207.59999);
		shape31.curveTo(-38.2, 207.59999, -3.7999992, 183.2, 1.7999992, 185.99998);
		shape31.closePath();
		g.fill(shape31);
	}

	private void paintCompositeGraphicsNode_0_0_0_31(Graphics2D g) {
		// _0_0_0_31_0
		AffineTransform trans_0_0_0_31_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_31_0(g);
		g.setTransform(trans_0_0_0_31_0);
	}

	private void paintShapeNode_0_0_0_32_0(Graphics2D g) {
		GeneralPath shape32 = new GeneralPath();
		shape32.moveTo(-21.4, 229.6);
		shape32.curveTo(-21.4, 229.6, -21.4, 223.6, -24.199999, 224.40001);
		shape32.curveTo(-26.999998, 225.20001, -63.0, 242.8, -69.0, 252.40001);
		shape32.curveTo(-69.0, 252.40001, -27.0, 226.8, -21.400002, 229.6);
		shape32.closePath();
		g.fill(shape32);
	}

	private void paintCompositeGraphicsNode_0_0_0_32(Graphics2D g) {
		// _0_0_0_32_0
		AffineTransform trans_0_0_0_32_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_32_0(g);
		g.setTransform(trans_0_0_0_32_0);
	}

	private void paintShapeNode_0_0_0_33_0(Graphics2D g) {
		GeneralPath shape33 = new GeneralPath();
		shape33.moveTo(-20.2, 218.8);
		shape33.curveTo(-20.2, 218.8, -19.0, 214.0, -21.800001, 214.8);
		shape33.curveTo(-23.800001, 214.8, -50.2, 226.40001, -56.200005, 236.0);
		shape33.curveTo(-56.200005, 236.0, -26.600004, 214.4, -20.200005, 218.8);
		shape33.closePath();
		g.fill(shape33);
	}

	private void paintCompositeGraphicsNode_0_0_0_33(Graphics2D g) {
		// _0_0_0_33_0
		AffineTransform trans_0_0_0_33_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_33_0(g);
		g.setTransform(trans_0_0_0_33_0);
	}

	private void paintShapeNode_0_0_0_34_0(Graphics2D g) {
		GeneralPath shape34 = new GeneralPath();
		shape34.moveTo(-34.6, 266.4);
		shape34.lineTo(-44.6, 274.0);
		shape34.curveTo(-44.6, 274.0, -34.199997, 266.4, -30.599998, 267.6);
		shape34.curveTo(-30.599998, 267.6, -37.399998, 278.80002, -38.199997, 284.0);
		shape34.curveTo(-38.199997, 284.0, -27.799997, 271.2, -22.199997, 271.6);
		shape34.curveTo(-22.199997, 271.6, -14.599997, 272.0, -14.599997, 282.80002);
		shape34.curveTo(-14.599997, 282.80002, -8.999996, 272.40002, -5.7999964, 272.80002);
		shape34.curveTo(-5.7999964, 272.80002, -4.5999966, 279.2, -5.7999964, 286.00003);
		shape34.curveTo(-5.7999964, 286.00003, -1.7999964, 278.40002, 2.2000036, 280.00003);
		shape34.curveTo(2.2000036, 280.00003, 8.600004, 278.00003, 7.8000035, 289.60004);
		shape34.curveTo(7.8000035, 289.60004, 7.8000035, 300.00003, 7.0000033, 302.80005);
		shape34.curveTo(7.0000033, 302.80005, 12.600003, 276.40005, 15.000004, 276.00006);
		shape34.curveTo(15.000004, 276.00006, 23.000004, 274.80005, 27.800003, 283.60007);
		shape34.curveTo(27.800003, 283.60007, 23.800003, 276.00006, 28.600002, 278.00006);
		shape34.curveTo(28.600002, 278.00006, 39.4, 279.60007, 42.600002, 286.40005);
		shape34.curveTo(42.600002, 286.40005, 35.800003, 274.40005, 41.4, 277.60007);
		shape34.lineTo(49.4, 284.00006);
		shape34.curveTo(49.4, 284.00006, 57.800003, 305.20007, 59.800003, 306.80005);
		shape34.curveTo(59.800003, 306.80005, 52.200005, 285.20004, 53.800003, 285.20004);
		shape34.curveTo(53.800003, 285.20004, 51.800003, 273.20004, 57.000004, 288.00003);
		shape34.curveTo(57.000004, 288.00003, 53.800003, 274.00003, 59.400005, 274.80002);
		shape34.curveTo(65.00001, 275.6, 69.40001, 285.6, 77.8, 283.2);
		shape34.curveTo(77.8, 283.2, 87.401, 288.80002, 89.401, 219.6);
		shape34.lineTo(-34.599, 266.4);
		shape34.closePath();
		g.fill(shape34);
	}

	private void paintCompositeGraphicsNode_0_0_0_34(Graphics2D g) {
		// _0_0_0_34_0
		AffineTransform trans_0_0_0_34_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_34_0(g);
		g.setTransform(trans_0_0_0_34_0);
	}

	private void paintShapeNode_0_0_0_35_0(Graphics2D g) {
		GeneralPath shape35 = new GeneralPath();
		shape35.moveTo(-29.8, 173.6);
		shape35.curveTo(-29.8, 173.6, -14.999999, 167.6, 25.0, 173.6);
		shape35.curveTo(25.0, 173.6, 32.2, 174.0, 39.0, 165.20001);
		shape35.curveTo(45.8, 156.40002, 72.6, 149.20001, 79.0, 151.20001);
		shape35.lineTo(88.601, 157.6);
		shape35.lineTo(89.401, 158.8);
		shape35.curveTo(89.401, 158.8, 101.8, 169.2, 102.2, 176.8);
		shape35.curveTo(102.59999, 184.40001, 87.800995, 232.4, 78.2, 248.4);
		shape35.curveTo(68.6, 264.4, 58.999996, 276.8, 39.799995, 274.4);
		shape35.curveTo(39.799995, 274.4, 18.999996, 270.4, -6.600006, 274.4);
		shape35.curveTo(-6.600006, 274.4, -35.800007, 272.8, -38.600006, 264.8);
		shape35.curveTo(-41.400005, 256.8, -27.400005, 241.59999, -27.400005, 241.59999);
		shape35.curveTo(-27.400005, 241.59999, -23.000006, 233.2, -24.200005, 218.79999);
		shape35.curveTo(-25.400003, 204.39998, -25.000004, 176.4, -29.800005, 173.59999);
		shape35.closePath();
		g.setPaint(new Color(0, 0, 0, 255));
		g.fill(shape35);
	}

	private void paintCompositeGraphicsNode_0_0_0_35(Graphics2D g) {
		// _0_0_0_35_0
		AffineTransform trans_0_0_0_35_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_35_0(g);
		g.setTransform(trans_0_0_0_35_0);
	}

	private void paintShapeNode_0_0_0_36_0(Graphics2D g) {
		GeneralPath shape36 = new GeneralPath();
		shape36.moveTo(-7.8, 175.6);
		shape36.curveTo(0.5999994, 194.0, -29.0, 259.2, -29.0, 259.2);
		shape36.curveTo(-31.0, 260.80002, -16.34, 266.85, -6.200001, 264.40002);
		shape36.curveTo(4.7459993, 261.76, 45.0, 266.00003, 45.0, 266.00003);
		shape36.curveTo(68.6, 250.40002, 81.4, 206.00003, 81.4, 206.00003);
		shape36.curveTo(81.4, 206.00003, 91.801, 182.00003, 74.200005, 178.80003);
		shape36.curveTo(56.600006, 175.60004, -7.7999954, 175.60004, -7.7999954, 175.60004);
		shape36.closePath();
		g.setPaint(new Color(229, 102, 140, 255));
		g.fill(shape36);
	}

	private void paintCompositeGraphicsNode_0_0_0_36(Graphics2D g) {
		// _0_0_0_36_0
		AffineTransform trans_0_0_0_36_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_36_0(g);
		g.setTransform(trans_0_0_0_36_0);
	}

	private void paintShapeNode_0_0_0_37_0(Graphics2D g) {
		GeneralPath shape37 = new GeneralPath();
		shape37.moveTo(-9.831, 206.5);
		shape37.curveTo(-6.505, 193.71, -4.9210005, 181.91, -7.8, 175.6);
		shape37.curveTo(-7.8, 175.6, 54.600002, 182.0, 65.799995, 161.20001);
		shape37.curveTo(70.04099, 153.33002, 84.800995, 184.00002, 84.399994, 193.6);
		shape37.curveTo(84.399994, 193.6, 21.399994, 208.0, 6.599991, 196.8);
		shape37.lineTo(-9.831009, 206.5);
		shape37.closePath();
		g.setPaint(new Color(178, 50, 89, 255));
		g.fill(shape37);
	}

	private void paintCompositeGraphicsNode_0_0_0_37(Graphics2D g) {
		// _0_0_0_37_0
		AffineTransform trans_0_0_0_37_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_37_0(g);
		g.setTransform(trans_0_0_0_37_0);
	}

	private void paintShapeNode_0_0_0_38_0(Graphics2D g) {
		GeneralPath shape38 = new GeneralPath();
		shape38.moveTo(-5.4, 222.8);
		shape38.curveTo(-5.4, 222.8, -3.4, 230.0, -5.8, 234.0);
		shape38.curveTo(-5.8, 234.0, -7.4, 234.8, -8.6, 235.2);
		shape38.curveTo(-8.6, 235.2, -7.4000006, 238.8, -1.4000006, 240.4);
		shape38.curveTo(-1.4000006, 240.4, 0.5999994, 244.79999, 2.9999995, 245.2);
		shape38.curveTo(5.3999996, 245.6, 10.199999, 251.2, 14.199999, 250.0);
		shape38.curveTo(18.199999, 248.8, 29.399998, 244.8, 29.399998, 244.8);
		shape38.curveTo(29.399998, 244.8, 34.999996, 241.6, 43.799995, 245.2);
		shape38.curveTo(43.799995, 245.2, 46.174995, 244.4, 46.599995, 240.4);
		shape38.curveTo(47.099995, 235.7, 50.199993, 232.0, 52.199993, 230.0);
		shape38.curveTo(54.199993, 228.0, 63.799995, 215.2, 62.59999, 214.8);
		shape38.curveTo(61.399986, 214.40001, -5.400009, 222.8, -5.400009, 222.8);
		shape38.closePath();
		g.setPaint(new Color(165, 38, 76, 255));
		g.fill(shape38);
	}

	private void paintCompositeGraphicsNode_0_0_0_38(Graphics2D g) {
		// _0_0_0_38_0
		AffineTransform trans_0_0_0_38_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_38_0(g);
		g.setTransform(trans_0_0_0_38_0);
	}

	private void paintShapeNode_0_0_0_39_0(Graphics2D g) {
		GeneralPath shape39 = new GeneralPath();
		shape39.moveTo(-9.8, 174.4);
		shape39.curveTo(-9.8, 174.4, -12.6, 196.79999, -9.400001, 205.2);
		shape39.curveTo(-6.200001, 213.6, -7.0000005, 215.59999, -7.8000007, 219.59999);
		shape39.curveTo(-8.6, 223.59999, -4.200001, 233.59999, 1.3999991, 239.59999);
		shape39.lineTo(13.4, 241.2);
		shape39.curveTo(13.4, 241.2, 28.599998, 237.59999, 37.8, 240.4);
		shape39.curveTo(37.8, 240.4, 46.794, 241.73999, 50.199997, 226.79999);
		shape39.curveTo(50.199997, 226.79999, 54.999996, 220.4, 62.199997, 217.59999);
		shape39.curveTo(69.399994, 214.79999, 76.6, 173.19998, 72.6, 165.19998);
		shape39.curveTo(68.6, 157.19998, 54.199997, 152.79999, 38.199997, 168.39998);
		shape39.curveTo(22.199997, 183.99997, 20.199997, 167.19998, -9.800003, 174.39998);
		shape39.closePath();
		g.setPaint(new Color(255, 114, 127, 255));
		g.fill(shape39);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape39);
	}

	private void paintCompositeGraphicsNode_0_0_0_39(Graphics2D g) {
		// _0_0_0_39_0
		AffineTransform trans_0_0_0_39_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_39_0(g);
		g.setTransform(trans_0_0_0_39_0);
	}

	private void paintShapeNode_0_0_0_40_0(Graphics2D g) {
		GeneralPath shape40 = new GeneralPath();
		shape40.moveTo(-8.2, 249.2);
		shape40.curveTo(-8.2, 249.2, -9.0, 247.2, -13.4, 246.8);
		shape40.curveTo(-13.4, 246.8, -35.8, 243.2, -44.199997, 230.8);
		shape40.curveTo(-44.199997, 230.8, -50.999996, 225.2, -46.6, 236.8);
		shape40.curveTo(-46.6, 236.8, -36.199997, 257.2, -29.399998, 260.0);
		shape40.curveTo(-29.399998, 260.0, -12.999998, 264.0, -8.199997, 249.2);
		shape40.closePath();
		g.setPaint(new Color(255, 255, 204, 255));
		g.fill(shape40);
		g.setPaint(new Color(0, 0, 0, 255));
		g.setStroke(new BasicStroke(0.5f,0,0,4.0f,null,0.0f));
		g.draw(shape40);
	}

	private void paintCompositeGraphicsNode_0_0_0_40(Graphics2D g) {
		// _0_0_0_40_0
		AffineTransform trans_0_0_0_40_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_40_0(g);
		g.setTransform(trans_0_0_0_40_0);
	}

	private void paintShapeNode_0_0_0_41_0(Graphics2D g) {
		GeneralPath shape41 = new GeneralPath();
		shape41.moveTo(71.742, 185.23);
		shape41.curveTo(72.40099, 177.31999, 74.354, 168.70999, 72.6, 165.2);
		shape41.curveTo(66.154, 152.31, 49.181, 157.7, 38.199997, 168.4);
		shape41.curveTo(22.199997, 184.0, 20.199997, 167.2, -9.800003, 174.4);
		shape41.curveTo(-9.800003, 174.4, -11.545003, 188.36, -10.705003, 198.37999);
		shape41.curveTo(-10.705003, 198.37999, 26.599998, 186.79999, 27.399998, 192.4);
		shape41.curveTo(27.399998, 192.4, 28.999998, 189.2, 38.199997, 189.2);
		shape41.curveTo(47.399994, 189.2, 70.142, 188.03, 71.742, 185.23);
		shape41.closePath();
		g.setPaint(new Color(204, 63, 76, 255));
		g.fill(shape41);
	}

	private void paintCompositeGraphicsNode_0_0_0_41(Graphics2D g) {
		// _0_0_0_41_0
		AffineTransform trans_0_0_0_41_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_41_0(g);
		g.setTransform(trans_0_0_0_41_0);
	}

	private void paintShapeNode_0_0_0_42_0(Graphics2D g) {
		GeneralPath shape42 = new GeneralPath();
		shape42.moveTo(28.6, 175.2);
		shape42.curveTo(28.6, 175.2, 33.4, 180.0, 29.800001, 189.59999);
		shape42.curveTo(29.800001, 189.59999, 15.400002, 205.59999, 17.400002, 219.59999);
		g.setPaint(new Color(165, 25, 38, 255));
		g.setStroke(new BasicStroke(2.0f,0,0,4.0f,null,0.0f));
		g.draw(shape42);
	}

	private void paintCompositeGraphicsNode_0_0_0_42(Graphics2D g) {
		// _0_0_0_42_0
		AffineTransform trans_0_0_0_42_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_42_0(g);
		g.setTransform(trans_0_0_0_42_0);
	}

	private void paintShapeNode_0_0_0_43_0(Graphics2D g) {
		GeneralPath shape43 = new GeneralPath();
		shape43.moveTo(-19.4, 260.0);
		shape43.curveTo(-19.4, 260.0, -23.8, 247.2, -15.0, 254.0);
		shape43.lineTo(-11.4, 257.6);
		shape43.curveTo(-12.599999, 259.2, -18.2, 263.2, -19.4, 260.0);
		shape43.closePath();
		g.setPaint(new Color(255, 255, 204, 255));
		g.fill(shape43);
		g.setPaint(new Color(0, 0, 0, 255));
		g.setStroke(new BasicStroke(0.5f,0,0,4.0f,null,0.0f));
		g.draw(shape43);
	}

	private void paintCompositeGraphicsNode_0_0_0_43(Graphics2D g) {
		// _0_0_0_43_0
		AffineTransform trans_0_0_0_43_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_43_0(g);
		g.setTransform(trans_0_0_0_43_0);
	}

	private void paintShapeNode_0_0_0_44_0(Graphics2D g) {
		GeneralPath shape44 = new GeneralPath();
		shape44.moveTo(-14.36, 261.2);
		shape44.curveTo(-14.36, 261.2, -17.88, 250.96, -10.84, 256.40002);
		shape44.lineTo(-7.96, 259.28003);
		shape44.curveTo(-12.52, 260.56003, -7.96, 263.12003, -14.360001, 261.20004);
		shape44.closePath();
		g.setPaint(new Color(255, 255, 204, 255));
		g.fill(shape44);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape44);
	}

	private void paintCompositeGraphicsNode_0_0_0_44(Graphics2D g) {
		// _0_0_0_44_0
		AffineTransform trans_0_0_0_44_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_44_0(g);
		g.setTransform(trans_0_0_0_44_0);
	}

	private void paintShapeNode_0_0_0_45_0(Graphics2D g) {
		GeneralPath shape45 = new GeneralPath();
		shape45.moveTo(-9.56, 261.2);
		shape45.curveTo(-9.56, 261.2, -13.08, 250.96, -6.0400004, 256.40002);
		shape45.lineTo(-3.1600003, 259.28003);
		shape45.curveTo(-6.5200005, 260.56003, -3.1600003, 263.12003, -9.56, 261.20004);
		shape45.closePath();
		g.setPaint(new Color(255, 255, 204, 255));
		g.fill(shape45);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape45);
	}

	private void paintCompositeGraphicsNode_0_0_0_45(Graphics2D g) {
		// _0_0_0_45_0
		AffineTransform trans_0_0_0_45_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_45_0(g);
		g.setTransform(trans_0_0_0_45_0);
	}

	private void paintShapeNode_0_0_0_46_0(Graphics2D g) {
		GeneralPath shape46 = new GeneralPath();
		shape46.moveTo(-2.96, 261.4);
		shape46.curveTo(-2.96, 261.4, -6.48, 251.15999, 0.55999994, 256.6);
		shape46.curveTo(0.55999994, 256.6, 4.943, 258.93, 3.441, 259.48);
		shape46.curveTo(0.48000002, 260.56, 3.441, 263.32, -2.96, 261.40002);
		shape46.closePath();
		g.setPaint(new Color(255, 255, 204, 255));
		g.fill(shape46);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape46);
	}

	private void paintCompositeGraphicsNode_0_0_0_46(Graphics2D g) {
		// _0_0_0_46_0
		AffineTransform trans_0_0_0_46_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_46_0(g);
		g.setTransform(trans_0_0_0_46_0);
	}

	private void paintShapeNode_0_0_0_47_0(Graphics2D g) {
		GeneralPath shape47 = new GeneralPath();
		shape47.moveTo(3.52, 261.32);
		shape47.curveTo(3.52, 261.32, 0.0, 251.08, 7.041, 256.52002);
		shape47.lineTo(9.921, 259.40002);
		shape47.curveTo(8.9609995, 260.68002, 9.921, 263.24002, 3.5199995, 261.32004);
		shape47.closePath();
		g.setPaint(new Color(255, 255, 204, 255));
		g.fill(shape47);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape47);
	}

	private void paintCompositeGraphicsNode_0_0_0_47(Graphics2D g) {
		// _0_0_0_47_0
		AffineTransform trans_0_0_0_47_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_47_0(g);
		g.setTransform(trans_0_0_0_47_0);
	}

	private void paintShapeNode_0_0_0_48_0(Graphics2D g) {
		GeneralPath shape48 = new GeneralPath();
		shape48.moveTo(10.2, 262.0);
		shape48.curveTo(10.2, 262.0, 5.3999996, 249.6, 14.6, 256.0);
		shape48.lineTo(18.2, 259.6);
		shape48.curveTo(17.0, 261.2, 18.2, 264.4, 10.200001, 262.0);
		shape48.closePath();
		g.setPaint(new Color(255, 255, 204, 255));
		g.fill(shape48);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape48);
	}

	private void paintCompositeGraphicsNode_0_0_0_48(Graphics2D g) {
		// _0_0_0_48_0
		AffineTransform trans_0_0_0_48_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_48_0(g);
		g.setTransform(trans_0_0_0_48_0);
	}

	private void paintShapeNode_0_0_0_49_0(Graphics2D g) {
		GeneralPath shape49 = new GeneralPath();
		shape49.moveTo(-18.2, 244.8);
		shape49.curveTo(-18.2, 244.8, -5.000001, 242.0, 1.0, 245.2);
		shape49.curveTo(1.0, 245.2, 7.0, 246.4, 8.2, 246.0);
		shape49.curveTo(9.4, 245.6, 12.6, 245.2, 12.6, 245.2);
		g.setPaint(new Color(165, 38, 76, 255));
		g.setStroke(new BasicStroke(2.0f,0,0,4.0f,null,0.0f));
		g.draw(shape49);
	}

	private void paintCompositeGraphicsNode_0_0_0_49(Graphics2D g) {
		// _0_0_0_49_0
		AffineTransform trans_0_0_0_49_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_49_0(g);
		g.setTransform(trans_0_0_0_49_0);
	}

	private void paintShapeNode_0_0_0_50_0(Graphics2D g) {
		GeneralPath shape50 = new GeneralPath();
		shape50.moveTo(15.8, 253.6);
		shape50.curveTo(15.8, 253.6, 27.8, 240.0, 39.8, 244.40001);
		shape50.curveTo(46.815998, 246.97002, 45.8, 243.6, 46.6, 240.8);
		shape50.curveTo(47.399998, 238.0, 47.6, 233.8, 52.6, 230.8);
		g.draw(shape50);
	}

	private void paintCompositeGraphicsNode_0_0_0_50(Graphics2D g) {
		// _0_0_0_50_0
		AffineTransform trans_0_0_0_50_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_50_0(g);
		g.setTransform(trans_0_0_0_50_0);
	}

	private void paintShapeNode_0_0_0_51_0(Graphics2D g) {
		GeneralPath shape51 = new GeneralPath();
		shape51.moveTo(33.0, 237.6);
		shape51.curveTo(33.0, 237.6, 29.0, 226.8, 26.2, 239.6);
		shape51.curveTo(23.400002, 252.40001, 20.2, 256.0, 18.6, 258.80002);
		shape51.curveTo(18.6, 258.80002, 18.6, 264.00003, 27.0, 263.6);
		shape51.curveTo(27.0, 263.6, 37.8, 263.2, 38.2, 260.4);
		shape51.curveTo(38.600002, 257.59998, 37.0, 246.0, 33.0, 237.59999);
		shape51.closePath();
		g.setPaint(new Color(255, 255, 204, 255));
		g.fill(shape51);
		g.setPaint(new Color(0, 0, 0, 255));
		g.setStroke(new BasicStroke(0.5f,0,0,4.0f,null,0.0f));
		g.draw(shape51);
	}

	private void paintCompositeGraphicsNode_0_0_0_51(Graphics2D g) {
		// _0_0_0_51_0
		AffineTransform trans_0_0_0_51_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_51_0(g);
		g.setTransform(trans_0_0_0_51_0);
	}

	private void paintShapeNode_0_0_0_52_0(Graphics2D g) {
		GeneralPath shape52 = new GeneralPath();
		shape52.moveTo(47.0, 244.8);
		shape52.curveTo(47.0, 244.8, 50.6, 242.40001, 53.0, 243.6);
		g.setPaint(new Color(165, 38, 76, 255));
		g.setStroke(new BasicStroke(2.0f,0,0,4.0f,null,0.0f));
		g.draw(shape52);
	}

	private void paintCompositeGraphicsNode_0_0_0_52(Graphics2D g) {
		// _0_0_0_52_0
		AffineTransform trans_0_0_0_52_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_52_0(g);
		g.setTransform(trans_0_0_0_52_0);
	}

	private void paintShapeNode_0_0_0_53_0(Graphics2D g) {
		GeneralPath shape53 = new GeneralPath();
		shape53.moveTo(53.5, 228.4);
		shape53.curveTo(53.5, 228.4, 56.4, 223.5, 61.2, 222.7);
		g.draw(shape53);
	}

	private void paintCompositeGraphicsNode_0_0_0_53(Graphics2D g) {
		// _0_0_0_53_0
		AffineTransform trans_0_0_0_53_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_53_0(g);
		g.setTransform(trans_0_0_0_53_0);
	}

	private void paintShapeNode_0_0_0_54_0(Graphics2D g) {
		GeneralPath shape54 = new GeneralPath();
		shape54.moveTo(-25.8, 265.2);
		shape54.curveTo(-25.8, 265.2, -7.799999, 268.40002, -3.3999996, 266.80002);
		shape54.lineTo(-2.9999995, 268.80002);
		shape54.lineTo(-23.8, 267.6);
		shape54.curveTo(-23.8, 267.6, -35.4, 262.0, -25.8, 265.2);
		shape54.closePath();
		g.setPaint(new Color(178, 178, 178, 255));
		g.fill(shape54);
	}

	private void paintCompositeGraphicsNode_0_0_0_54(Graphics2D g) {
		// _0_0_0_54_0
		AffineTransform trans_0_0_0_54_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_54_0(g);
		g.setTransform(trans_0_0_0_54_0);
	}

	private void paintShapeNode_0_0_0_55_0(Graphics2D g) {
		GeneralPath shape55 = new GeneralPath();
		shape55.moveTo(-11.8, 172.0);
		shape55.lineTo(7.8, 172.8);
		shape55.curveTo(7.8, 172.8, 15.0, 203.6, 11.4, 211.20001);
		shape55.curveTo(11.4, 211.20001, 10.2, 214.00002, 7.3999996, 208.40001);
		shape55.curveTo(7.3999996, 208.40001, -11.0, 175.6, -14.200001, 173.6);
		shape55.curveTo(-17.400002, 171.6, -13.000001, 172.0, -11.800001, 172.0);
		shape55.closePath();
		g.setPaint(new Color(255, 255, 204, 255));
		g.fill(shape55);
		g.setPaint(new Color(0, 0, 0, 255));
		g.setStroke(new BasicStroke(0.5f,0,0,4.0f,null,0.0f));
		g.draw(shape55);
	}

	private void paintCompositeGraphicsNode_0_0_0_55(Graphics2D g) {
		// _0_0_0_55_0
		AffineTransform trans_0_0_0_55_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_55_0(g);
		g.setTransform(trans_0_0_0_55_0);
	}

	private void paintShapeNode_0_0_0_56_0(Graphics2D g) {
		GeneralPath shape56 = new GeneralPath();
		shape56.moveTo(-88.9, 169.3);
		shape56.curveTo(-88.9, 169.3, -80.0, 171.0, -67.4, 173.6);
		shape56.curveTo(-67.4, 173.6, -62.600002, 196.0, -59.4, 200.8);
		shape56.curveTo(-56.2, 205.6, -59.800003, 205.6, -63.4, 202.8);
		shape56.curveTo(-67.0, 200.0, -81.8, 186.0, -83.8, 181.6);
		shape56.curveTo(-85.8, 177.20001, -88.9, 169.3, -88.9, 169.3);
		shape56.closePath();
		g.setPaint(new Color(255, 255, 204, 255));
		g.fill(shape56);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape56);
	}

	private void paintCompositeGraphicsNode_0_0_0_56(Graphics2D g) {
		// _0_0_0_56_0
		AffineTransform trans_0_0_0_56_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_56_0(g);
		g.setTransform(trans_0_0_0_56_0);
	}

	private void paintShapeNode_0_0_0_57_0(Graphics2D g) {
		GeneralPath shape57 = new GeneralPath();
		shape57.moveTo(-67.039, 173.82);
		shape57.curveTo(-67.039, 173.82, -61.239002, 175.37001, -60.230003, 177.58);
		shape57.curveTo(-59.222004, 179.8, -61.432003, 183.09, -61.432003, 183.09);
		shape57.curveTo(-61.432003, 183.09, -62.432003, 186.4, -63.634003, 184.23999);
		shape57.curveTo(-64.836006, 182.06999, -67.708, 174.40999, -67.039, 173.81999);
		shape57.closePath();
		g.setPaint(new Color(255, 255, 204, 255));
		g.fill(shape57);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape57);
	}

	private void paintCompositeGraphicsNode_0_0_0_57(Graphics2D g) {
		// _0_0_0_57_0
		AffineTransform trans_0_0_0_57_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_57_0(g);
		g.setTransform(trans_0_0_0_57_0);
	}

	private void paintShapeNode_0_0_0_58_0(Graphics2D g) {
		GeneralPath shape58 = new GeneralPath();
		shape58.moveTo(-67.0, 173.6);
		shape58.curveTo(-67.0, 173.6, -63.4, 178.8, -59.8, 178.8);
		shape58.curveTo(-56.199997, 178.8, -55.818, 178.39, -53.0, 179.0);
		shape58.curveTo(-48.4, 180.0, -48.8, 178.0, -42.2, 179.2);
		shape58.curveTo(-39.56, 179.68, -37.0, 178.8, -34.2, 180.0);
		shape58.curveTo(-31.400002, 181.2, -28.2, 180.4, -27.0, 178.4);
		shape58.curveTo(-25.8, 176.4, -21.0, 172.2, -21.0, 172.2);
		shape58.curveTo(-21.0, 172.2, -33.8, 174.0, -36.6, 174.8);
		shape58.curveTo(-36.6, 174.8, -59.0, 176.0, -67.0, 173.6);
		shape58.closePath();
		g.fill(shape58);
	}

	private void paintCompositeGraphicsNode_0_0_0_58(Graphics2D g) {
		// _0_0_0_58_0
		AffineTransform trans_0_0_0_58_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_58_0(g);
		g.setTransform(trans_0_0_0_58_0);
	}

	private void paintShapeNode_0_0_0_59_0(Graphics2D g) {
		GeneralPath shape59 = new GeneralPath();
		shape59.moveTo(-22.4, 173.8);
		shape59.curveTo(-22.4, 173.8, -28.849998, 177.3, -29.25, 179.7);
		shape59.curveTo(-29.650002, 182.09999, -24.0, 185.8, -24.0, 185.8);
		shape59.curveTo(-24.0, 185.8, -21.25, 190.40001, -20.65, 188.0);
		shape59.curveTo(-20.05, 185.59999, -21.6, 174.2, -22.4, 173.8);
		shape59.closePath();
		g.setPaint(new Color(255, 255, 204, 255));
		g.fill(shape59);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape59);
	}

	private void paintCompositeGraphicsNode_0_0_0_59(Graphics2D g) {
		// _0_0_0_59_0
		AffineTransform trans_0_0_0_59_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_59_0(g);
		g.setTransform(trans_0_0_0_59_0);
	}

	private void paintShapeNode_0_0_0_60_0(Graphics2D g) {
		GeneralPath shape60 = new GeneralPath();
		shape60.moveTo(-59.885, 179.26);
		shape60.curveTo(-59.885, 179.26, -52.878, 190.45, -52.661, 179.23999);
		shape60.curveTo(-52.661, 179.23999, -52.104, 177.98, -53.864, 177.95999);
		shape60.curveTo(-59.939, 177.88998, -58.418, 173.78, -59.885, 179.26);
		shape60.closePath();
		g.setPaint(new Color(255, 255, 204, 255));
		g.fill(shape60);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape60);
	}

	private void paintCompositeGraphicsNode_0_0_0_60(Graphics2D g) {
		// _0_0_0_60_0
		AffineTransform trans_0_0_0_60_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_60_0(g);
		g.setTransform(trans_0_0_0_60_0);
	}

	private void paintShapeNode_0_0_0_61_0(Graphics2D g) {
		GeneralPath shape61 = new GeneralPath();
		shape61.moveTo(-52.707, 179.51);
		shape61.curveTo(-52.707, 179.51, -44.786, 190.7, -45.422, 179.42);
		shape61.curveTo(-45.422, 179.42, -45.415, 179.09, -47.168, 178.94);
		shape61.curveTo(-51.915, 178.52, -51.57, 174.0, -52.707, 179.51001);
		shape61.closePath();
		g.setPaint(new Color(255, 255, 204, 255));
		g.fill(shape61);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape61);
	}

	private void paintCompositeGraphicsNode_0_0_0_61(Graphics2D g) {
		// _0_0_0_61_0
		AffineTransform trans_0_0_0_61_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_61_0(g);
		g.setTransform(trans_0_0_0_61_0);
	}

	private void paintShapeNode_0_0_0_62_0(Graphics2D g) {
		GeneralPath shape62 = new GeneralPath();
		shape62.moveTo(-45.494, 179.52);
		shape62.curveTo(-45.494, 179.52, -37.534, 190.15001, -38.203, 180.48001);
		shape62.curveTo(-38.203, 180.48001, -38.084, 179.25002, -39.738, 178.95001);
		shape62.curveTo(-43.629997, 178.24, -43.841, 175.00002, -45.494, 179.52002);
		shape62.closePath();
		g.setPaint(new Color(255, 255, 204, 255));
		g.fill(shape62);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape62);
	}

	private void paintCompositeGraphicsNode_0_0_0_62(Graphics2D g) {
		// _0_0_0_62_0
		AffineTransform trans_0_0_0_62_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_62_0(g);
		g.setTransform(trans_0_0_0_62_0);
	}

	private void paintShapeNode_0_0_0_63_0(Graphics2D g) {
		GeneralPath shape63 = new GeneralPath();
		shape63.moveTo(-38.618, 179.6);
		shape63.curveTo(-38.618, 179.6, -30.718, 191.16, -30.369999, 181.38);
		shape63.curveTo(-30.369999, 181.38, -28.725998, 180.0, -30.471998, 179.78);
		shape63.curveTo(-36.289997, 179.04, -35.491997, 174.59, -38.617996, 179.6);
		shape63.closePath();
		g.setPaint(new Color(255, 255, 204, 255));
		g.fill(shape63);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape63);
	}

	private void paintCompositeGraphicsNode_0_0_0_63(Graphics2D g) {
		// _0_0_0_63_0
		AffineTransform trans_0_0_0_63_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_63_0(g);
		g.setTransform(trans_0_0_0_63_0);
	}

	private void paintShapeNode_0_0_0_64_0(Graphics2D g) {
		GeneralPath shape64 = new GeneralPath();
		shape64.moveTo(-74.792, 183.13);
		shape64.lineTo(-82.45, 181.6);
		shape64.curveTo(-85.049995, 176.6, -87.149994, 170.45001, -87.149994, 170.45001);
		shape64.curveTo(-87.149994, 170.45001, -80.799995, 171.45001, -68.299995, 174.25002);
		shape64.curveTo(-68.299995, 174.25002, -67.423996, 177.57002, -65.951996, 183.36002);
		shape64.lineTo(-74.79199, 183.13002);
		shape64.closePath();
		g.setPaint(new Color(229, 229, 178, 255));
		g.fill(shape64);
	}

	private void paintCompositeGraphicsNode_0_0_0_64(Graphics2D g) {
		// _0_0_0_64_0
		AffineTransform trans_0_0_0_64_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_64_0(g);
		g.setTransform(trans_0_0_0_64_0);
	}

	private void paintShapeNode_0_0_0_65_0(Graphics2D g) {
		GeneralPath shape65 = new GeneralPath();
		shape65.moveTo(-9.724, 178.47);
		shape65.curveTo(-11.39, 175.96, -12.707, 174.21, -13.357, 173.8);
		shape65.curveTo(-16.37, 171.92, -12.227, 172.29001, -11.098001, 172.29001);
		shape65.lineTo(7.356, 173.05);
		shape65.curveTo(7.356, 173.05, 7.88, 175.29001, 8.564, 178.68001);
		shape65.curveTo(8.564, 178.68001, -1.5240002, 176.67001, -9.724, 178.47);
		shape65.closePath();
		g.fill(shape65);
	}

	private void paintCompositeGraphicsNode_0_0_0_65(Graphics2D g) {
		// _0_0_0_65_0
		AffineTransform trans_0_0_0_65_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_65_0(g);
		g.setTransform(trans_0_0_0_65_0);
	}

	private void paintShapeNode_0_0_0_66_0(Graphics2D g) {
		GeneralPath shape66 = new GeneralPath();
		shape66.moveTo(43.88, 40.321);
		shape66.curveTo(71.601, 44.281, 97.121, 8.640999, 98.881, -1.0400009);
		shape66.curveTo(100.64, -10.720001, 90.520996, -22.6, 90.520996, -22.6);
		shape66.curveTo(91.840996, -25.68, 87.001, -39.760002, 81.72099, -49.0);
		shape66.curveTo(76.44099, -58.239998, 60.539993, -57.266, 42.999992, -58.239998);
		shape66.curveTo(27.159992, -59.12, 8.679993, -35.799995, 7.359993, -34.039997);
		shape66.curveTo(6.0399933, -32.28, 12.199993, 6.0010033, 13.519993, 11.7210045);
		shape66.curveTo(14.839993, 17.441006, 12.199993, 43.841003, 12.199993, 43.841003);
		shape66.curveTo(46.439995, 34.741005, 16.159992, 36.361004, 43.879993, 40.321003);
		shape66.closePath();
		g.setPaint(new Color(204, 114, 38, 255));
		g.fill(shape66);
	}

	private void paintCompositeGraphicsNode_0_0_0_66(Graphics2D g) {
		// _0_0_0_66_0
		AffineTransform trans_0_0_0_66_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_66_0(g);
		g.setTransform(trans_0_0_0_66_0);
	}

	private void paintShapeNode_0_0_0_67_0(Graphics2D g) {
		GeneralPath shape67 = new GeneralPath();
		shape67.moveTo(8.088, -33.392);
		shape67.curveTo(6.7920003, -31.663998, 12.84, 5.9210014, 14.136, 11.537003);
		shape67.curveTo(15.431999, 17.153004, 12.84, 43.073, 12.84, 43.073);
		shape67.curveTo(45.512, 34.193, 16.728, 35.729004, 43.944, 39.617);
		shape67.curveTo(71.160995, 43.505, 96.216995, 8.5130005, 97.945, -0.9920006);
		shape67.curveTo(99.673, -10.496, 89.737, -22.16, 89.737, -22.16);
		shape67.curveTo(91.033, -25.184, 86.281, -39.008, 81.097, -48.08);
		shape67.curveTo(75.913, -57.152004, 60.302002, -56.195, 43.08, -57.152);
		shape67.curveTo(27.528002, -58.016, 9.384003, -35.120003, 8.088001, -33.392);
		shape67.closePath();
		g.setPaint(new Color(234, 142, 81, 255));
		g.fill(shape67);
	}

	private void paintCompositeGraphicsNode_0_0_0_67(Graphics2D g) {
		// _0_0_0_67_0
		AffineTransform trans_0_0_0_67_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_67_0(g);
		g.setTransform(trans_0_0_0_67_0);
	}

	private void paintShapeNode_0_0_0_68_0(Graphics2D g) {
		GeneralPath shape68 = new GeneralPath();
		shape68.moveTo(8.816, -32.744);
		shape68.curveTo(7.544, -31.048, 13.48, 5.8409996, 14.752, 11.353001);
		shape68.curveTo(16.024, 16.865002, 13.48, 42.305, 13.48, 42.305);
		shape68.curveTo(44.884, 33.145, 17.296, 35.097, 44.008, 38.913002);
		shape68.curveTo(70.721, 42.729004, 95.313, 8.385002, 97.009, -0.9439964);
		shape68.curveTo(98.705, -10.2719965, 88.953, -21.719995, 88.953, -21.719995);
		shape68.curveTo(90.225006, -24.687996, 85.561005, -38.255997, 80.47301, -47.159996);
		shape68.curveTo(75.38501, -56.063995, 60.063007, -55.124996, 43.160007, -56.063995);
		shape68.curveTo(27.896008, -56.911995, 10.088009, -34.439995, 8.816006, -32.743996);
		shape68.closePath();
		g.setPaint(new Color(239, 170, 124, 255));
		g.fill(shape68);
	}

	private void paintCompositeGraphicsNode_0_0_0_68(Graphics2D g) {
		// _0_0_0_68_0
		AffineTransform trans_0_0_0_68_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_68_0(g);
		g.setTransform(trans_0_0_0_68_0);
	}

	private void paintShapeNode_0_0_0_69_0(Graphics2D g) {
		GeneralPath shape69 = new GeneralPath();
		shape69.moveTo(9.544, -32.096);
		shape69.curveTo(8.296, -30.432001, 14.12, 5.760998, 15.368, 11.168999);
		shape69.curveTo(16.616001, 16.577, 14.12, 41.537, 14.12, 41.537);
		shape69.curveTo(43.556, 32.496998, 17.864, 34.465, 44.072, 38.209);
		shape69.curveTo(70.281, 41.953, 94.409, 8.257, 96.073, -0.89500046);
		shape69.curveTo(97.737, -10.048, 88.169, -21.28, 88.169, -21.28);
		shape69.curveTo(89.417, -24.192001, 84.840996, -37.504, 79.849, -46.239998);
		shape69.curveTo(74.857, -54.975994, 59.823997, -54.054996, 43.239998, -54.975998);
		shape69.curveTo(28.263998, -55.808, 10.791996, -33.76, 9.543999, -32.096);
		shape69.closePath();
		g.setPaint(new Color(244, 198, 168, 255));
		g.fill(shape69);
	}

	private void paintCompositeGraphicsNode_0_0_0_69(Graphics2D g) {
		// _0_0_0_69_0
		AffineTransform trans_0_0_0_69_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_69_0(g);
		g.setTransform(trans_0_0_0_69_0);
	}

	private void paintShapeNode_0_0_0_70_0(Graphics2D g) {
		GeneralPath shape70 = new GeneralPath();
		shape70.moveTo(10.272, -31.448);
		shape70.curveTo(9.048, -29.816, 14.76, 5.6810017, 15.984, 10.984999);
		shape70.curveTo(17.208, 16.288996, 14.76, 40.768997, 14.76, 40.768997);
		shape70.curveTo(42.628, 31.848997, 18.432, 33.832996, 44.136, 37.504997);
		shape70.curveTo(69.841, 41.177, 93.505005, 8.128998, 95.137, -0.8480034);
		shape70.curveTo(96.769, -9.824003, 87.385, -20.840004, 87.385, -20.840004);
		shape70.curveTo(88.609, -23.696003, 84.121, -36.752003, 79.225006, -45.320004);
		shape70.curveTo(74.32901, -53.888004, 59.585007, -52.985004, 43.320007, -53.888004);
		shape70.curveTo(28.632008, -54.704002, 11.496008, -33.08, 10.272007, -31.448004);
		shape70.closePath();
		g.setPaint(new Color(249, 226, 211, 255));
		g.fill(shape70);
	}

	private void paintCompositeGraphicsNode_0_0_0_70(Graphics2D g) {
		// _0_0_0_70_0
		AffineTransform trans_0_0_0_70_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_70_0(g);
		g.setTransform(trans_0_0_0_70_0);
	}

	private void paintShapeNode_0_0_0_71_0(Graphics2D g) {
		GeneralPath shape71 = new GeneralPath();
		shape71.moveTo(44.2, 36.8);
		shape71.curveTo(69.4, 40.399998, 92.601, 8.0, 94.201004, -0.79999924);
		shape71.curveTo(95.80101, -9.599998, 86.601006, -20.4, 86.601006, -20.4);
		shape71.curveTo(87.801, -23.199999, 83.40001, -36.0, 78.600006, -44.4);
		shape71.curveTo(73.8, -52.800003, 59.34601, -51.914, 43.400005, -52.800003);
		shape71.curveTo(29.000006, -53.600002, 12.200005, -32.4, 11.000004, -30.800003);
		shape71.curveTo(9.800003, -29.200005, 15.400003, 5.5999985, 16.600004, 10.799995);
		shape71.curveTo(17.800005, 15.999992, 15.400004, 39.999996, 15.400004, 39.999996);
		shape71.curveTo(40.900005, 31.399996, 19.000004, 33.199997, 44.200005, 36.799995);
		shape71.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape71);
	}

	private void paintCompositeGraphicsNode_0_0_0_71(Graphics2D g) {
		// _0_0_0_71_0
		AffineTransform trans_0_0_0_71_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_71_0(g);
		g.setTransform(trans_0_0_0_71_0);
	}

	private void paintShapeNode_0_0_0_72_0(Graphics2D g) {
		GeneralPath shape72 = new GeneralPath();
		shape72.moveTo(90.601, 2.8);
		shape72.curveTo(90.601, 2.8, 62.799995, 10.4, 51.199997, 8.8);
		shape72.curveTo(51.199997, 8.8, 35.399998, 2.2000003, 26.599997, 24.0);
		shape72.curveTo(26.599997, 24.0, 22.999996, 31.2, 20.999996, 33.2);
		shape72.curveTo(18.999996, 35.2, 90.601, 2.8000011, 90.601, 2.8000011);
		shape72.closePath();
		g.setPaint(new Color(204, 204, 204, 255));
		g.fill(shape72);
	}

	private void paintCompositeGraphicsNode_0_0_0_72(Graphics2D g) {
		// _0_0_0_72_0
		AffineTransform trans_0_0_0_72_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_72_0(g);
		g.setTransform(trans_0_0_0_72_0);
	}

	private void paintShapeNode_0_0_0_73_0(Graphics2D g) {
		GeneralPath shape73 = new GeneralPath();
		shape73.moveTo(94.401, 0.6);
		shape73.curveTo(94.401, 0.6, 65.4, 12.8, 55.4, 12.400001);
		shape73.curveTo(55.4, 12.400001, 39.0, 7.8000007, 30.600002, 22.400002);
		shape73.curveTo(30.600002, 22.400002, 22.200003, 31.600002, 19.000002, 33.2);
		shape73.curveTo(19.000002, 33.2, 18.600002, 34.8, 25.000002, 30.800001);
		shape73.lineTo(35.4, 36.0);
		shape73.curveTo(35.4, 36.0, 50.2, 45.6, 59.800003, 29.6);
		shape73.curveTo(59.800003, 29.6, 63.800003, 18.400002, 63.800003, 16.400002);
		shape73.curveTo(63.800003, 14.400002, 85.0, 8.800001, 86.601006, 8.400002);
		shape73.curveTo(88.201004, 8.000002, 94.801, 3.8000016, 94.40101, 0.60000134);
		shape73.closePath();
		g.setPaint(new Color(0, 0, 0, 255));
		g.fill(shape73);
	}

	private void paintCompositeGraphicsNode_0_0_0_73(Graphics2D g) {
		// _0_0_0_73_0
		AffineTransform trans_0_0_0_73_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_73_0(g);
		g.setTransform(trans_0_0_0_73_0);
	}

	private void paintShapeNode_0_0_0_74_0(Graphics2D g) {
		GeneralPath shape74 = new GeneralPath();
		shape74.moveTo(47.0, 36.514);
		shape74.curveTo(40.128, 36.514, 31.755001, 32.649, 31.755001, 26.4);
		shape74.curveTo(31.755001, 20.152, 40.128002, 13.887, 47.0, 13.887);
		shape74.curveTo(53.874, 13.887, 59.446, 18.952, 59.446, 25.2);
		shape74.curveTo(59.446, 31.449001, 53.874, 36.514, 47.0, 36.514);
		shape74.closePath();
		g.setPaint(new Color(153, 204, 50, 255));
		g.fill(shape74);
	}

	private void paintCompositeGraphicsNode_0_0_0_74(Graphics2D g) {
		// _0_0_0_74_0
		AffineTransform trans_0_0_0_74_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_74_0(g);
		g.setTransform(trans_0_0_0_74_0);
	}

	private void paintShapeNode_0_0_0_75_0(Graphics2D g) {
		GeneralPath shape75 = new GeneralPath();
		shape75.moveTo(43.377, 19.83);
		shape75.curveTo(38.531, 20.552, 33.441998, 22.055, 33.514, 21.839);
		shape75.curveTo(35.054, 17.220001, 41.415, 13.887001, 47.0, 13.887001);
		shape75.curveTo(51.296, 13.887001, 55.084, 15.865001, 57.32, 18.875);
		shape75.curveTo(57.32, 18.875, 52.003998, 18.545, 43.377, 19.83);
		shape75.closePath();
		g.setPaint(new Color(101, 153, 0, 255));
		g.fill(shape75);
	}

	private void paintCompositeGraphicsNode_0_0_0_75(Graphics2D g) {
		// _0_0_0_75_0
		AffineTransform trans_0_0_0_75_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_75_0(g);
		g.setTransform(trans_0_0_0_75_0);
	}

	private void paintShapeNode_0_0_0_76_0(Graphics2D g) {
		GeneralPath shape76 = new GeneralPath();
		shape76.moveTo(55.4, 19.6);
		shape76.curveTo(55.4, 19.6, 51.0, 16.4, 51.0, 18.6);
		shape76.curveTo(51.0, 18.6, 54.6, 23.0, 55.4, 19.6);
		shape76.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape76);
	}

	private void paintCompositeGraphicsNode_0_0_0_76(Graphics2D g) {
		// _0_0_0_76_0
		AffineTransform trans_0_0_0_76_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_76_0(g);
		g.setTransform(trans_0_0_0_76_0);
	}

	private void paintShapeNode_0_0_0_77_0(Graphics2D g) {
		GeneralPath shape77 = new GeneralPath();
		shape77.moveTo(45.4, 27.726);
		shape77.curveTo(42.901, 27.726, 40.875, 25.7, 40.875, 23.2);
		shape77.curveTo(40.875, 20.701, 42.901, 18.675001, 45.4, 18.675001);
		shape77.curveTo(47.9, 18.675001, 49.926003, 20.701, 49.926003, 23.2);
		shape77.curveTo(49.926003, 25.7, 47.9, 27.726002, 45.4, 27.726002);
		shape77.closePath();
		g.setPaint(new Color(0, 0, 0, 255));
		g.fill(shape77);
	}

	private void paintCompositeGraphicsNode_0_0_0_77(Graphics2D g) {
		// _0_0_0_77_0
		AffineTransform trans_0_0_0_77_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_77_0(g);
		g.setTransform(trans_0_0_0_77_0);
	}

	private void paintShapeNode_0_0_0_78_0(Graphics2D g) {
		GeneralPath shape78 = new GeneralPath();
		shape78.moveTo(-58.6, 14.4);
		shape78.curveTo(-58.6, 14.4, -61.8, -6.800001, -59.399998, -11.200001);
		shape78.curveTo(-59.399998, -11.200001, -48.6, -21.2, -49.0, -24.800001);
		shape78.curveTo(-49.0, -24.800001, -49.4, -42.800003, -50.6, -43.6);
		shape78.curveTo(-51.799995, -44.399994, -59.399998, -50.399998, -65.4, -44.0);
		shape78.curveTo(-65.4, -44.0, -75.8, -26.0, -75.0, -19.6);
		shape78.lineTo(-75.0, -17.6);
		shape78.curveTo(-75.0, -17.6, -82.6, -18.0, -84.2, -16.0);
		shape78.curveTo(-84.2, -16.0, -85.399994, -10.8, -86.6, -10.4);
		shape78.curveTo(-86.6, -10.4, -89.4, -7.9999995, -87.4, -5.2);
		shape78.curveTo(-87.4, -5.2, -89.4, -2.7999997, -89.0, 1.2000003);
		shape78.lineTo(-81.4, 5.2000003);
		shape78.curveTo(-81.4, 5.2000003, -79.4, 19.6, -68.6, 24.800001);
		shape78.curveTo(-63.764, 27.129002, -60.6, 20.400002, -58.6, 14.400002);
		shape78.closePath();
		g.setPaint(new Color(204, 114, 38, 255));
		g.fill(shape78);
	}

	private void paintCompositeGraphicsNode_0_0_0_78(Graphics2D g) {
		// _0_0_0_78_0
		AffineTransform trans_0_0_0_78_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_78_0(g);
		g.setTransform(trans_0_0_0_78_0);
	}

	private void paintShapeNode_0_0_0_79_0(Graphics2D g) {
		GeneralPath shape79 = new GeneralPath();
		shape79.moveTo(-59.6, 12.56);
		shape79.curveTo(-59.6, 12.56, -62.48, -6.5199995, -60.32, -10.4800005);
		shape79.curveTo(-60.32, -10.4800005, -50.6, -19.48, -50.96, -22.720001);
		shape79.curveTo(-50.96, -22.720001, -51.32, -38.920002, -52.399998, -39.64);
		shape79.curveTo(-53.479996, -40.359997, -60.32, -45.76, -65.72, -40.0);
		shape79.curveTo(-65.72, -40.0, -75.08, -23.8, -74.36, -18.04);
		shape79.lineTo(-74.36, -16.240002);
		shape79.curveTo(-74.36, -16.240002, -81.2, -16.600002, -82.64, -14.800001);
		shape79.curveTo(-82.64, -14.800001, -83.72, -10.120001, -84.8, -9.760001);
		shape79.curveTo(-84.8, -9.760001, -87.32, -7.6000013, -85.520004, -5.0800014);
		shape79.curveTo(-85.520004, -5.0800014, -87.32001, -2.9200013, -86.96001, 0.6799989);
		shape79.lineTo(-80.12001, 4.279999);
		shape79.curveTo(-80.12001, 4.279999, -78.32001, 17.239998, -68.600006, 21.919998);
		shape79.curveTo(-64.24801, 24.014997, -61.400005, 17.96, -59.600006, 12.5599985);
		shape79.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape79);
	}

	private void paintCompositeGraphicsNode_0_0_0_79(Graphics2D g) {
		// _0_0_0_79_0
		AffineTransform trans_0_0_0_79_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_79_0(g);
		g.setTransform(trans_0_0_0_79_0);
	}

	private void paintShapeNode_0_0_0_80_0(Graphics2D g) {
		GeneralPath shape80 = new GeneralPath();
		shape80.moveTo(-51.05, -42.61);
		shape80.curveTo(-52.14, -43.47, -59.629997, -49.24, -65.479996, -43.0);
		shape80.curveTo(-65.479996, -43.0, -75.619995, -25.45, -74.84, -19.21);
		shape80.lineTo(-74.84, -17.259998);
		shape80.curveTo(-74.84, -17.259998, -82.25, -17.649998, -83.81, -15.699999);
		shape80.curveTo(-83.81, -15.699999, -84.979996, -10.629999, -86.149994, -10.239999);
		shape80.curveTo(-86.149994, -10.239999, -88.88, -7.8999987, -86.92999, -5.1699986);
		shape80.curveTo(-86.92999, -5.1699986, -88.87999, -2.8299987, -88.48999, 1.0700011);
		shape80.lineTo(-81.07999, 4.970001);
		shape80.curveTo(-81.07999, 4.970001, -79.12999, 19.010002, -68.59999, 24.080002);
		shape80.curveTo(-63.88599, 26.350002, -60.79999, 19.79, -58.84999, 13.9400015);
		shape80.curveTo(-58.84999, 13.9400015, -61.96999, -6.7299986, -59.62999, -11.019998);
		shape80.curveTo(-59.62999, -11.019998, -49.09999, -20.769997, -49.48999, -24.279999);
		shape80.curveTo(-49.48999, -24.279999, -49.87999, -41.829998, -51.04999, -42.61);
		shape80.closePath();
		g.setPaint(new Color(235, 149, 92, 255));
		g.fill(shape80);
	}

	private void paintCompositeGraphicsNode_0_0_0_80(Graphics2D g) {
		// _0_0_0_80_0
		AffineTransform trans_0_0_0_80_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_80_0(g);
		g.setTransform(trans_0_0_0_80_0);
	}

	private void paintShapeNode_0_0_0_81_0(Graphics2D g) {
		GeneralPath shape81 = new GeneralPath();
		shape81.moveTo(-51.5, -41.62);
		shape81.curveTo(-52.48, -42.539997, -59.86, -48.079998, -65.56, -42.0);
		shape81.curveTo(-65.56, -42.0, -75.439995, -24.9, -74.68, -18.82);
		shape81.lineTo(-74.68, -16.92);
		shape81.curveTo(-74.68, -16.92, -81.9, -17.3, -83.42, -15.4);
		shape81.curveTo(-83.42, -15.4, -84.56, -10.459999, -85.7, -10.08);
		shape81.curveTo(-85.7, -10.08, -88.36, -7.8, -86.46, -5.14);
		shape81.curveTo(-86.46, -5.14, -88.36, -2.86, -87.979996, 0.94000006);
		shape81.lineTo(-80.759995, 4.74);
		shape81.curveTo(-80.759995, 4.74, -78.85999, 18.42, -68.59999, 23.36);
		shape81.curveTo(-64.00599, 25.572, -60.999992, 19.18, -59.09999, 13.4800005);
		shape81.curveTo(-59.09999, 13.4800005, -62.13999, -6.659999, -59.85999, -10.839999);
		shape81.curveTo(-59.85999, -10.839999, -49.59999, -20.34, -49.97999, -23.759998);
		shape81.curveTo(-49.97999, -23.759998, -50.35999, -40.86, -51.49999, -41.62);
		shape81.closePath();
		g.setPaint(new Color(242, 184, 146, 255));
		g.fill(shape81);
	}

	private void paintCompositeGraphicsNode_0_0_0_81(Graphics2D g) {
		// _0_0_0_81_0
		AffineTransform trans_0_0_0_81_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_81_0(g);
		g.setTransform(trans_0_0_0_81_0);
	}

	private void paintShapeNode_0_0_0_82_0(Graphics2D g) {
		GeneralPath shape82 = new GeneralPath();
		shape82.moveTo(-51.95, -40.63);
		shape82.curveTo(-52.82, -41.61, -60.09, -46.920002, -65.64, -41.0);
		shape82.curveTo(-65.64, -41.0, -75.26, -24.35, -74.52, -18.43);
		shape82.lineTo(-74.52, -16.58);
		shape82.curveTo(-74.52, -16.58, -81.549995, -16.95, -83.03, -15.1);
		shape82.curveTo(-83.03, -15.1, -84.14, -10.290001, -85.25, -9.92);
		shape82.curveTo(-85.25, -9.92, -87.84, -7.7, -85.99, -5.11);
		shape82.curveTo(-85.99, -5.11, -87.84, -2.89, -87.47, 0.80999994);
		shape82.lineTo(-80.44, 4.51);
		shape82.curveTo(-80.44, 4.51, -78.590004, 17.83, -68.600006, 22.64);
		shape82.curveTo(-64.12701, 24.793999, -61.200005, 18.57, -59.350006, 13.0199995);
		shape82.curveTo(-59.350006, 13.0199995, -62.310005, -6.590001, -60.090008, -10.660001);
		shape82.curveTo(-60.090008, -10.660001, -50.100006, -19.91, -50.47001, -23.240002);
		shape82.curveTo(-50.47001, -23.240002, -50.840008, -39.89, -51.95001, -40.63);
		shape82.closePath();
		g.setPaint(new Color(248, 220, 200, 255));
		g.fill(shape82);
	}

	private void paintCompositeGraphicsNode_0_0_0_82(Graphics2D g) {
		// _0_0_0_82_0
		AffineTransform trans_0_0_0_82_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_82_0(g);
		g.setTransform(trans_0_0_0_82_0);
	}

	private void paintShapeNode_0_0_0_83_0(Graphics2D g) {
		GeneralPath shape83 = new GeneralPath();
		shape83.moveTo(-59.6, 12.46);
		shape83.curveTo(-59.6, 12.46, -62.48, -6.5199995, -60.32, -10.4800005);
		shape83.curveTo(-60.32, -10.4800005, -50.6, -19.48, -50.96, -22.720001);
		shape83.curveTo(-50.96, -22.720001, -51.32, -38.920002, -52.399998, -39.64);
		shape83.curveTo(-53.159996, -40.68, -60.32, -45.76, -65.72, -40.0);
		shape83.curveTo(-65.72, -40.0, -75.08, -23.8, -74.36, -18.04);
		shape83.lineTo(-74.36, -16.240002);
		shape83.curveTo(-74.36, -16.240002, -81.2, -16.600002, -82.64, -14.800001);
		shape83.curveTo(-82.64, -14.800001, -83.72, -10.120001, -84.8, -9.760001);
		shape83.curveTo(-84.8, -9.760001, -87.32, -7.6000013, -85.520004, -5.0800014);
		shape83.curveTo(-85.520004, -5.0800014, -87.32001, -2.9200013, -86.96001, 0.6799989);
		shape83.lineTo(-80.12001, 4.279999);
		shape83.curveTo(-80.12001, 4.279999, -78.32001, 17.239998, -68.600006, 21.919998);
		shape83.curveTo(-64.24801, 24.014997, -61.400005, 17.859999, -59.600006, 12.459998);
		shape83.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape83);
	}

	private void paintCompositeGraphicsNode_0_0_0_83(Graphics2D g) {
		// _0_0_0_83_0
		AffineTransform trans_0_0_0_83_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_83_0(g);
		g.setTransform(trans_0_0_0_83_0);
	}

	private void paintShapeNode_0_0_0_84_0(Graphics2D g) {
		GeneralPath shape84 = new GeneralPath();
		shape84.moveTo(-62.7, 6.2);
		shape84.curveTo(-62.7, 6.2, -84.3, -4.0, -85.2, -4.8);
		shape84.curveTo(-85.2, -4.8, -76.1, 3.3999996, -75.299995, 3.3999996);
		shape84.curveTo(-74.49999, 3.3999996, -62.699997, 6.2, -62.699997, 6.2);
		shape84.closePath();
		g.setPaint(new Color(204, 204, 204, 255));
		g.fill(shape84);
	}

	private void paintCompositeGraphicsNode_0_0_0_84(Graphics2D g) {
		// _0_0_0_84_0
		AffineTransform trans_0_0_0_84_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_84_0(g);
		g.setTransform(trans_0_0_0_84_0);
	}

	private void paintShapeNode_0_0_0_85_0(Graphics2D g) {
		GeneralPath shape85 = new GeneralPath();
		shape85.moveTo(-79.8, 0.0);
		shape85.curveTo(-79.8, 0.0, -61.4, 3.6, -61.4, 8.0);
		shape85.curveTo(-61.4, 10.912, -61.643, 24.331, -67.0, 22.8);
		shape85.curveTo(-75.4, 20.4, -71.8, 6.0, -79.8, 0.0);
		shape85.closePath();
		g.setPaint(new Color(0, 0, 0, 255));
		g.fill(shape85);
	}

	private void paintCompositeGraphicsNode_0_0_0_85(Graphics2D g) {
		// _0_0_0_85_0
		AffineTransform trans_0_0_0_85_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_85_0(g);
		g.setTransform(trans_0_0_0_85_0);
	}

	private void paintShapeNode_0_0_0_86_0(Graphics2D g) {
		GeneralPath shape86 = new GeneralPath();
		shape86.moveTo(-71.4, 3.8);
		shape86.curveTo(-71.4, 3.8, -62.422, 5.274, -61.4, 8.0);
		shape86.curveTo(-60.800003, 9.6, -60.137, 17.908, -65.6, 19.0);
		shape86.curveTo(-70.152, 19.911, -72.381996, 9.69, -71.4, 3.8000002);
		shape86.closePath();
		g.setPaint(new Color(153, 204, 50, 255));
		g.fill(shape86);
	}

	private void paintCompositeGraphicsNode_0_0_0_86(Graphics2D g) {
		// _0_0_0_86_0
		AffineTransform trans_0_0_0_86_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_86_0(g);
		g.setTransform(trans_0_0_0_86_0);
	}

	private void paintShapeNode_0_0_0_87_0(Graphics2D g) {
		GeneralPath shape87 = new GeneralPath();
		shape87.moveTo(14.595, 46.349);
		shape87.curveTo(14.098001, 44.607, 15.409, 44.738, 17.2, 44.2);
		shape87.curveTo(19.2, 43.600002, 31.400002, 39.8, 32.2, 37.2);
		shape87.curveTo(33.0, 34.600002, 46.2, 39.0, 46.2, 39.0);
		shape87.curveTo(48.0, 39.8, 52.4, 42.4, 52.4, 42.4);
		shape87.curveTo(57.2, 43.600002, 63.800003, 44.0, 63.800003, 44.0);
		shape87.curveTo(66.200005, 45.0, 69.600006, 47.8, 69.600006, 47.8);
		shape87.curveTo(84.200005, 58.0, 96.601006, 50.8, 96.601006, 50.8);
		shape87.curveTo(116.600006, 44.2, 110.600006, 27.0, 110.600006, 27.0);
		shape87.curveTo(107.600006, 18.0, 110.8, 14.6, 110.8, 14.6);
		shape87.curveTo(111.0, 10.8, 118.200005, 17.2, 118.200005, 17.2);
		shape87.curveTo(120.8, 21.400002, 121.600006, 26.400002, 121.600006, 26.400002);
		shape87.curveTo(129.6, 37.600002, 126.200005, 19.800001, 126.200005, 19.800001);
		shape87.curveTo(126.4, 18.800001, 123.600006, 15.200001, 123.600006, 14.000001);
		shape87.curveTo(123.600006, 12.800001, 121.8, 9.400002, 121.8, 9.400002);
		shape87.curveTo(118.8, 6.0000014, 121.200005, -0.9999981, 121.200005, -0.9999981);
		shape87.curveTo(123.00001, -14.799998, 120.8, -12.999998, 120.8, -12.999998);
		shape87.curveTo(119.600006, -14.799998, 110.4, -4.7999983, 110.4, -4.7999983);
		shape87.curveTo(108.200005, -1.3999982, 102.200005, 0.20000172, 102.200005, 0.20000172);
		shape87.curveTo(99.401, 2.0000017, 96.00101, 0.6000017, 96.00101, 0.6000017);
		shape87.curveTo(93.40101, 0.20000169, 87.80101, 7.2000017, 87.80101, 7.2000017);
		shape87.curveTo(90.60101, 7.000002, 93.00101, 11.400002, 95.40101, 11.600002);
		shape87.curveTo(97.80101, 11.800003, 99.601006, 9.200003, 101.20001, 8.600002);
		shape87.curveTo(102.80001, 8.000002, 105.60001, 13.800002, 105.60001, 13.800002);
		shape87.curveTo(106.000015, 16.400002, 100.40002, 21.200003, 100.40002, 21.200003);
		shape87.curveTo(100.000015, 25.800003, 98.40102, 24.200003, 98.40102, 24.200003);
		shape87.curveTo(95.40102, 23.600002, 94.20102, 27.400003, 93.20102, 32.000004);
		shape87.curveTo(92.20102, 36.600006, 88.00102, 37.000004, 88.00102, 37.000004);
		shape87.curveTo(86.401024, 44.400005, 85.20002, 41.400005, 85.20002, 41.400005);
		shape87.curveTo(85.00002, 35.800007, 79.00002, 41.600006, 79.00002, 41.600006);
		shape87.curveTo(77.800026, 43.600006, 73.20002, 41.400005, 73.20002, 41.400005);
		shape87.curveTo(66.40002, 39.400005, 68.80002, 37.400005, 68.80002, 37.400005);
		shape87.curveTo(70.60002, 35.200005, 81.80002, 37.400005, 81.80002, 37.400005);
		shape87.curveTo(84.000015, 35.800007, 76.000015, 31.800005, 76.000015, 31.800005);
		shape87.curveTo(75.40002, 30.000006, 76.40002, 25.600006, 76.40002, 25.600006);
		shape87.curveTo(77.60001, 22.400005, 84.40002, 16.800007, 84.40002, 16.800007);
		shape87.curveTo(93.80102, 15.600007, 91.001015, 14.000007, 91.001015, 14.000007);
		shape87.curveTo(84.80102, 8.800007, 79.000015, 16.400007, 79.000015, 16.400007);
		shape87.curveTo(76.80002, 22.600006, 59.400017, 37.600006, 59.400017, 37.600006);
		shape87.curveTo(54.600018, 41.000008, 57.200016, 34.200005, 53.200016, 37.600006);
		shape87.curveTo(49.200016, 41.000008, 28.600016, 32.000008, 28.600016, 32.000008);
		shape87.curveTo(17.038015, 30.807007, 14.306016, 46.549007, 10.777016, 43.42901);
		shape87.curveTo(10.777016, 43.42901, 16.195015, 51.94901, 14.595016, 46.349007);
		shape87.closePath();
		g.setPaint(new Color(0, 0, 0, 255));
		g.fill(shape87);
	}

	private void paintCompositeGraphicsNode_0_0_0_87(Graphics2D g) {
		// _0_0_0_87_0
		AffineTransform trans_0_0_0_87_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_87_0(g);
		g.setTransform(trans_0_0_0_87_0);
	}

	private void paintShapeNode_0_0_0_88_0(Graphics2D g) {
		GeneralPath shape88 = new GeneralPath();
		shape88.moveTo(209.4, -120.0);
		shape88.curveTo(209.4, -120.0, 183.79999, -112.0, 181.0, -93.2);
		shape88.curveTo(181.0, -93.2, 178.6, -70.399994, 199.0, -52.799995);
		shape88.curveTo(199.0, -52.799995, 199.4, -46.399994, 201.4, -43.199997);
		shape88.curveTo(201.4, -43.199997, 199.79999, -38.399998, 218.59999, -45.999996);
		shape88.lineTo(245.79999, -54.399994);
		shape88.curveTo(245.79999, -54.399994, 252.19998, -56.799995, 257.4, -65.59999);
		shape88.curveTo(262.6, -74.39999, 277.8, -93.19999, 274.19998, -118.399994);
		shape88.curveTo(274.19998, -118.399994, 275.4, -129.59999, 269.4, -130.0);
		shape88.curveTo(269.4, -130.0, 261.0, -131.6, 253.79999, -124.0);
		shape88.curveTo(253.79999, -124.0, 246.99998, -120.8, 244.59999, -121.2);
		shape88.lineTo(209.4, -120.0);
		shape88.closePath();
		g.fill(shape88);
	}

	private void paintCompositeGraphicsNode_0_0_0_88(Graphics2D g) {
		// _0_0_0_88_0
		AffineTransform trans_0_0_0_88_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_88_0(g);
		g.setTransform(trans_0_0_0_88_0);
	}

	private void paintShapeNode_0_0_0_89_0(Graphics2D g) {
		GeneralPath shape89 = new GeneralPath();
		shape89.moveTo(264.02, -120.99);
		shape89.curveTo(264.02, -120.99, 266.12, -129.92, 261.28, -125.08);
		shape89.curveTo(261.28, -125.08, 254.24, -119.36, 246.76, -119.36);
		shape89.curveTo(246.76, -119.36, 232.23999, -117.16, 227.84, -103.96);
		shape89.curveTo(227.84, -103.96, 223.87999, -77.119995, 231.8, -71.399994);
		shape89.curveTo(231.8, -71.399994, 236.64, -63.919994, 243.68001, -70.52);
		shape89.curveTo(250.72002, -77.119995, 266.22, -107.35, 264.02002, -120.99);
		shape89.closePath();
		g.fill(shape89);
	}

	private void paintCompositeGraphicsNode_0_0_0_89(Graphics2D g) {
		// _0_0_0_89_0
		AffineTransform trans_0_0_0_89_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_89_0(g);
		g.setTransform(trans_0_0_0_89_0);
	}

	private void paintShapeNode_0_0_0_90_0(Graphics2D g) {
		GeneralPath shape90 = new GeneralPath();
		shape90.moveTo(263.65, -120.63);
		shape90.curveTo(263.65, -120.63, 265.74, -129.38, 260.99, -124.619995);
		shape90.curveTo(260.99, -124.619995, 254.06999, -119.009995, 246.73, -119.009995);
		shape90.curveTo(246.73, -119.009995, 232.47, -116.84999, 228.15, -103.88999);
		shape90.curveTo(228.15, -103.88999, 224.26, -77.535995, 232.04, -71.91999);
		shape90.curveTo(232.04, -71.91999, 236.79, -64.57599, 243.7, -71.05599);
		shape90.curveTo(250.62, -77.535995, 265.81, -107.23999, 263.65, -120.62999);
		shape90.closePath();
		g.setPaint(new Color(50, 50, 50, 255));
		g.fill(shape90);
	}

	private void paintCompositeGraphicsNode_0_0_0_90(Graphics2D g) {
		// _0_0_0_90_0
		AffineTransform trans_0_0_0_90_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_90_0(g);
		g.setTransform(trans_0_0_0_90_0);
	}

	private void paintShapeNode_0_0_0_91_0(Graphics2D g) {
		GeneralPath shape91 = new GeneralPath();
		shape91.moveTo(263.27, -120.27);
		shape91.curveTo(263.27, -120.27, 265.34998, -128.83, 260.69, -124.17);
		shape91.curveTo(260.69, -124.17, 253.91, -118.659996, 246.7, -118.659996);
		shape91.curveTo(246.7, -118.659996, 232.7, -116.53999, 228.45999, -103.81999);
		shape91.curveTo(228.45999, -103.81999, 224.65, -77.951996, 232.28, -72.439995);
		shape91.curveTo(232.28, -72.439995, 236.94, -65.231995, 243.73, -71.591995);
		shape91.curveTo(250.51, -77.951996, 265.38998, -107.12999, 263.27, -120.27);
		shape91.closePath();
		g.setPaint(new Color(102, 102, 102, 255));
		g.fill(shape91);
	}

	private void paintCompositeGraphicsNode_0_0_0_91(Graphics2D g) {
		// _0_0_0_91_0
		AffineTransform trans_0_0_0_91_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_91_0(g);
		g.setTransform(trans_0_0_0_91_0);
	}

	private void paintShapeNode_0_0_0_92_0(Graphics2D g) {
		GeneralPath shape92 = new GeneralPath();
		shape92.moveTo(262.9, -119.92);
		shape92.curveTo(262.9, -119.92, 264.97, -128.29, 260.38998, -123.71);
		shape92.curveTo(260.38998, -123.71, 253.73999, -118.3, 246.65999, -118.3);
		shape92.curveTo(246.65999, -118.3, 232.93999, -116.22, 228.77998, -103.740005);
		shape92.curveTo(228.77998, -103.740005, 225.02998, -78.368004, 232.51999, -72.96001);
		shape92.curveTo(232.51999, -72.96001, 237.09999, -65.88801, 243.74998, -72.128006);
		shape92.curveTo(250.40999, -78.368004, 264.97998, -107.020004, 262.9, -119.920006);
		shape92.closePath();
		g.setPaint(new Color(153, 153, 153, 255));
		g.fill(shape92);
	}

	private void paintCompositeGraphicsNode_0_0_0_92(Graphics2D g) {
		// _0_0_0_92_0
		AffineTransform trans_0_0_0_92_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_92_0(g);
		g.setTransform(trans_0_0_0_92_0);
	}

	private void paintShapeNode_0_0_0_93_0(Graphics2D g) {
		GeneralPath shape93 = new GeneralPath();
		shape93.moveTo(262.53, -119.56);
		shape93.curveTo(262.53, -119.56, 264.59, -127.74, 260.1, -123.259995);
		shape93.curveTo(260.1, -123.259995, 253.57, -117.95, 246.63, -117.95);
		shape93.curveTo(246.63, -117.95, 233.17, -115.909996, 229.09, -103.67);
		shape93.curveTo(229.09, -103.67, 225.42, -78.784, 232.76, -73.479996);
		shape93.curveTo(232.76, -73.479996, 237.25, -66.544, 243.78, -72.663994);
		shape93.curveTo(250.3, -78.784, 264.57, -106.90999, 262.53, -119.56);
		shape93.closePath();
		g.setPaint(new Color(204, 204, 204, 255));
		g.fill(shape93);
	}

	private void paintCompositeGraphicsNode_0_0_0_93(Graphics2D g) {
		// _0_0_0_93_0
		AffineTransform trans_0_0_0_93_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_93_0(g);
		g.setTransform(trans_0_0_0_93_0);
	}

	private void paintShapeNode_0_0_0_94_0(Graphics2D g) {
		GeneralPath shape94 = new GeneralPath();
		shape94.moveTo(262.15, -119.2);
		shape94.curveTo(262.15, -119.2, 264.19998, -127.2, 259.8, -122.799995);
		shape94.curveTo(259.8, -122.799995, 253.4, -117.6, 246.59999, -117.6);
		shape94.curveTo(246.59999, -117.6, 233.4, -115.6, 229.4, -103.6);
		shape94.curveTo(229.4, -103.6, 225.79999, -79.2, 233.0, -74.0);
		shape94.curveTo(233.0, -74.0, 237.4, -67.2, 243.8, -73.2);
		shape94.curveTo(250.20001, -79.2, 264.15, -106.799995, 262.15, -119.2);
		shape94.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape94);
	}

	private void paintCompositeGraphicsNode_0_0_0_94(Graphics2D g) {
		// _0_0_0_94_0
		AffineTransform trans_0_0_0_94_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_94_0(g);
		g.setTransform(trans_0_0_0_94_0);
	}

	private void paintShapeNode_0_0_0_95_0(Graphics2D g) {
		GeneralPath shape95 = new GeneralPath();
		shape95.moveTo(50.6, 84.0);
		shape95.curveTo(50.6, 84.0, 30.199999, 64.8, 22.199999, 64.0);
		shape95.curveTo(22.199999, 64.0, -12.200003, 60.0, -27.000002, 78.0);
		shape95.curveTo(-27.000002, 78.0, -9.400002, 57.6, 18.199999, 63.2);
		shape95.curveTo(18.199999, 63.2, -3.4000015, 58.8, -15.800001, 62.0);
		shape95.lineTo(-42.2, 76.0);
		shape95.lineTo(-45.0, 80.8);
		shape95.curveTo(-45.0, 80.8, -41.0, 66.0, -22.6, 60.000004);
		shape95.curveTo(-22.6, 60.000004, 0.19999886, 55.200005, 10.999998, 60.000004);
		shape95.curveTo(10.999998, 60.000004, -10.600002, 53.200005, -20.600002, 55.200005);
		shape95.curveTo(-20.600002, 55.200005, -51.0, 52.800003, -63.800003, 79.200005);
		shape95.curveTo(-63.800003, 79.200005, -59.800003, 64.8, -45.000004, 57.600006);
		shape95.curveTo(-45.000004, 57.600006, -31.400003, 48.800007, -11.000004, 51.600006);
		shape95.curveTo(-11.000004, 51.600006, 3.3999958, 54.800007, 8.599997, 57.200005);
		shape95.curveTo(13.799997, 59.600002, 12.599997, 56.800003, 4.1999965, 52.000004);
		shape95.curveTo(4.1999965, 52.000004, -1.4000034, 42.000004, -15.400003, 42.4);
		shape95.curveTo(-15.400003, 42.4, -58.200005, 46.0, -68.600006, 58.0);
		shape95.curveTo(-68.600006, 58.0, -55.000008, 46.8, -44.600006, 44.0);
		shape95.curveTo(-44.600006, 44.0, -22.200006, 36.0, -13.800007, 36.8);
		shape95.curveTo(-13.800007, 36.8, 10.999992, 37.8, 18.599995, 33.8);
		shape95.curveTo(18.599995, 33.8, 7.399995, 38.8, 10.599995, 42.0);
		shape95.curveTo(13.799994, 45.2, 20.599995, 52.8, 20.599995, 54.0);
		shape95.curveTo(20.599995, 55.2, 44.799995, 77.3, 48.399994, 81.7);
		shape95.lineTo(50.599995, 84.0);
		shape95.closePath();
		g.setPaint(new Color(153, 38, 0, 255));
		g.fill(shape95);
	}

	private void paintCompositeGraphicsNode_0_0_0_95(Graphics2D g) {
		// _0_0_0_95_0
		AffineTransform trans_0_0_0_95_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_95_0(g);
		g.setTransform(trans_0_0_0_95_0);
	}

	private void paintShapeNode_0_0_0_96_0(Graphics2D g) {
		GeneralPath shape96 = new GeneralPath();
		shape96.moveTo(189.0, 278.0);
		shape96.curveTo(189.0, 278.0, 173.5, 241.5, 161.0, 232.0);
		shape96.curveTo(161.0, 232.0, 187.0, 248.0, 190.5, 266.0);
		shape96.curveTo(190.5, 266.0, 190.5, 276.0, 189.0, 278.0);
		shape96.closePath();
		g.setPaint(new Color(204, 204, 204, 255));
		g.fill(shape96);
	}

	private void paintCompositeGraphicsNode_0_0_0_96(Graphics2D g) {
		// _0_0_0_96_0
		AffineTransform trans_0_0_0_96_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_96_0(g);
		g.setTransform(trans_0_0_0_96_0);
	}

	private void paintShapeNode_0_0_0_97_0(Graphics2D g) {
		GeneralPath shape97 = new GeneralPath();
		shape97.moveTo(236.0, 285.5);
		shape97.curveTo(236.0, 285.5, 209.5, 230.5, 191.0, 206.5);
		shape97.curveTo(191.0, 206.5, 234.5, 244.0, 239.5, 270.5);
		shape97.lineTo(240.0, 276.0);
		shape97.lineTo(237.0, 273.5);
		shape97.curveTo(237.0, 273.5, 236.5, 282.5, 236.0, 285.5);
		shape97.closePath();
		g.fill(shape97);
	}

	private void paintCompositeGraphicsNode_0_0_0_97(Graphics2D g) {
		// _0_0_0_97_0
		AffineTransform trans_0_0_0_97_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_97_0(g);
		g.setTransform(trans_0_0_0_97_0);
	}

	private void paintShapeNode_0_0_0_98_0(Graphics2D g) {
		GeneralPath shape98 = new GeneralPath();
		shape98.moveTo(292.5, 237.0);
		shape98.curveTo(292.5, 237.0, 230.0, 177.5, 228.5, 175.0);
		shape98.curveTo(228.5, 175.0, 289.0, 241.0, 292.0, 248.5);
		shape98.curveTo(292.0, 248.5, 290.0, 239.5, 292.5, 237.0);
		shape98.closePath();
		g.fill(shape98);
	}

	private void paintCompositeGraphicsNode_0_0_0_98(Graphics2D g) {
		// _0_0_0_98_0
		AffineTransform trans_0_0_0_98_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_98_0(g);
		g.setTransform(trans_0_0_0_98_0);
	}

	private void paintShapeNode_0_0_0_99_0(Graphics2D g) {
		GeneralPath shape99 = new GeneralPath();
		shape99.moveTo(104.0, 280.5);
		shape99.curveTo(104.0, 280.5, 123.5, 228.5, 142.5, 251.0);
		shape99.curveTo(142.5, 251.0, 157.5, 261.0, 157.0, 264.0);
		shape99.curveTo(157.0, 264.0, 153.0, 257.5, 135.0, 258.0);
		shape99.curveTo(135.0, 258.0, 116.0, 255.0, 104.0, 280.5);
		shape99.closePath();
		g.fill(shape99);
	}

	private void paintCompositeGraphicsNode_0_0_0_99(Graphics2D g) {
		// _0_0_0_99_0
		AffineTransform trans_0_0_0_99_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_99_0(g);
		g.setTransform(trans_0_0_0_99_0);
	}

	private void paintShapeNode_0_0_0_100_0(Graphics2D g) {
		GeneralPath shape100 = new GeneralPath();
		shape100.moveTo(294.5, 153.0);
		shape100.curveTo(294.5, 153.0, 249.5, 124.5, 242.0, 123.0);
		shape100.curveTo(230.19, 120.64, 291.5, 152.0, 296.5, 162.5);
		shape100.curveTo(296.5, 162.5, 298.5, 160.0, 294.5, 153.0);
		shape100.closePath();
		g.fill(shape100);
	}

	private void paintCompositeGraphicsNode_0_0_0_100(Graphics2D g) {
		// _0_0_0_100_0
		AffineTransform trans_0_0_0_100_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_100_0(g);
		g.setTransform(trans_0_0_0_100_0);
	}

	private void paintShapeNode_0_0_0_101_0(Graphics2D g) {
		GeneralPath shape101 = new GeneralPath();
		shape101.moveTo(143.8, 259.6);
		shape101.curveTo(143.8, 259.6, 164.2, 257.6, 171.0, 250.8);
		shape101.lineTo(175.4, 254.40001);
		shape101.lineTo(193.0, 216.0);
		shape101.lineTo(196.6, 221.2);
		shape101.curveTo(196.6, 221.2, 211.0, 206.4, 210.20001, 198.4);
		shape101.curveTo(209.40002, 190.4, 223.00002, 204.4, 223.00002, 204.4);
		shape101.curveTo(223.00002, 204.4, 222.20001, 192.79999, 229.40001, 199.59999);
		shape101.curveTo(229.40001, 199.59999, 227.00002, 183.99998, 235.40001, 191.99998);
		shape101.curveTo(235.40001, 191.99998, 224.86002, 161.83998, 247.40001, 187.59999);
		shape101.curveTo(253.00002, 193.99998, 248.6, 187.2, 248.6, 187.2);
		shape101.curveTo(248.6, 187.2, 222.6, 139.2, 244.20001, 153.6);
		shape101.curveTo(244.20001, 153.6, 246.20001, 130.8, 245.00002, 126.40001);
		shape101.curveTo(243.80002, 122.000015, 241.80002, 99.600006, 237.00002, 94.40001);
		shape101.curveTo(232.20001, 89.20001, 237.40001, 87.600006, 243.00002, 92.80001);
		shape101.curveTo(243.00002, 92.80001, 231.80002, 68.80001, 245.00002, 80.80001);
		shape101.curveTo(245.00002, 80.80001, 241.40001, 65.60001, 237.00002, 62.80001);
		shape101.curveTo(237.00002, 62.80001, 231.40001, 45.60001, 246.60002, 56.40001);
		shape101.curveTo(246.60002, 56.40001, 242.20003, 44.000008, 239.00002, 40.80001);
		shape101.curveTo(239.00002, 40.80001, 227.40001, 13.20001, 234.60002, 18.000011);
		shape101.lineTo(239.00002, 21.600012);
		shape101.curveTo(239.00002, 21.600012, 232.20001, 7.600012, 238.60002, 12.000011);
		shape101.curveTo(245.00003, 16.400011, 245.00002, 16.000011, 245.00002, 16.000011);
		shape101.curveTo(245.00002, 16.000011, 223.80002, -17.19999, 244.20001, 0.40001106);
		shape101.curveTo(244.20001, 0.40001106, 236.04001, -13.517989, 232.6, -20.399988);
		shape101.curveTo(232.6, -20.399988, 213.8, -40.799988, 228.20001, -34.399986);
		shape101.lineTo(233.00002, -32.799988);
		shape101.curveTo(233.00002, -32.799988, 224.20001, -42.799988, 216.20001, -44.399986);
		shape101.curveTo(208.20001, -45.999985, 218.6, -52.399986, 225.00002, -50.399986);
		shape101.curveTo(231.40002, -48.399986, 247.00002, -40.799988, 247.00002, -40.799988);
		shape101.curveTo(247.00002, -40.799988, 259.80002, -21.999989, 263.80002, -21.599987);
		shape101.curveTo(263.80002, -21.599987, 243.80002, -29.199987, 249.80002, -21.199987);
		shape101.curveTo(249.80002, -21.199987, 264.2, -7.1999874, 257.00003, -7.599987);
		shape101.curveTo(257.00003, -7.599987, 251.00003, -0.39998722, 255.80003, 8.400013);
		shape101.curveTo(255.80003, 8.400013, 237.34003, -9.990988, 252.20003, 15.600013);
		shape101.lineTo(259.00003, 32.00001);
		shape101.curveTo(259.00003, 32.00001, 234.60004, 7.200012, 245.80003, 29.200012);
		shape101.curveTo(245.80003, 29.200012, 263.00003, 52.80001, 265.00003, 53.200012);
		shape101.curveTo(267.00003, 53.600014, 271.40002, 62.400013, 271.40002, 62.400013);
		shape101.lineTo(267.00003, 60.400013);
		shape101.lineTo(272.20004, 69.20001);
		shape101.curveTo(272.20004, 69.20001, 261.00003, 57.200012, 267.00003, 70.40001);
		shape101.lineTo(272.60004, 84.80001);
		shape101.curveTo(272.60004, 84.80001, 252.20004, 62.80001, 265.80005, 92.40001);
		shape101.curveTo(265.80005, 92.40001, 249.40005, 87.20001, 258.20004, 104.40001);
		shape101.curveTo(258.20004, 104.40001, 256.60004, 120.40001, 257.00003, 125.600006);
		shape101.curveTo(257.40002, 130.8, 258.60004, 159.20001, 254.20003, 167.20001);
		shape101.curveTo(249.80002, 175.20001, 260.2, 194.40001, 262.2, 198.40001);
		shape101.curveTo(264.2, 202.40001, 267.80002, 213.20001, 259.0, 204.00002);
		shape101.curveTo(250.19998, 194.80002, 254.6, 200.40001, 256.6, 209.20001);
		shape101.curveTo(258.6, 218.00002, 264.6, 233.6, 263.80002, 239.20001);
		shape101.curveTo(263.80002, 239.20001, 262.6, 240.40001, 259.40002, 236.80002);
		shape101.curveTo(259.40002, 236.80002, 244.60002, 214.00002, 246.20003, 228.40002);
		shape101.curveTo(246.20003, 228.40002, 245.00003, 236.40002, 241.80003, 245.20003);
		shape101.curveTo(241.80003, 245.20003, 238.60004, 256.00003, 238.60004, 247.20003);
		shape101.curveTo(238.60004, 247.20003, 235.40004, 230.40002, 232.60004, 238.00003);
		shape101.curveTo(229.80003, 245.60004, 226.20004, 251.60004, 223.40004, 254.00003);
		shape101.curveTo(220.60004, 256.40002, 215.40004, 233.60004, 214.20004, 244.00003);
		shape101.curveTo(214.20004, 244.00003, 202.20004, 231.60004, 197.40004, 248.00003);
		shape101.lineTo(185.80003, 264.40002);
		shape101.curveTo(185.80003, 264.40002, 185.40004, 252.00003, 184.20003, 258.00003);
		shape101.curveTo(184.20003, 258.00003, 154.20003, 264.00003, 143.80002, 259.60004);
		shape101.closePath();
		g.setPaint(new Color(0, 0, 0, 255));
		g.fill(shape101);
	}

	private void paintCompositeGraphicsNode_0_0_0_101(Graphics2D g) {
		// _0_0_0_101_0
		AffineTransform trans_0_0_0_101_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_101_0(g);
		g.setTransform(trans_0_0_0_101_0);
	}

	private void paintShapeNode_0_0_0_102_0(Graphics2D g) {
		GeneralPath shape102 = new GeneralPath();
		shape102.moveTo(109.4, -97.2);
		shape102.curveTo(109.4, -97.2, 97.801, -105.2, 93.801, -104.799995);
		shape102.curveTo(89.801, -104.399994, 121.4, -113.6, 162.6, -86.0);
		shape102.curveTo(162.6, -86.0, 167.40001, -83.2, 171.0, -83.6);
		shape102.curveTo(171.0, -83.6, 174.2, -81.2, 171.4, -77.6);
		shape102.curveTo(171.4, -77.6, 162.59999, -68.0, 173.79999, -56.8);
		shape102.curveTo(173.79999, -56.8, 192.19998, -50.0, 186.59999, -58.8);
		shape102.curveTo(186.59999, -58.8, 197.4, -54.8, 199.79999, -50.8);
		shape102.curveTo(202.19998, -46.8, 200.99998, -50.8, 200.99998, -50.8);
		shape102.lineTo(188.59999, -63.199997);
		shape102.curveTo(188.59999, -63.199997, 183.4, -65.2, 180.59999, -73.6);
		shape102.curveTo(177.79999, -82.0, 175.4, -92.0, 179.79999, -95.2);
		shape102.curveTo(179.79999, -95.2, 175.79999, -90.799995, 176.59999, -94.799995);
		shape102.curveTo(177.4, -98.799995, 180.99998, -102.399994, 182.59999, -102.799995);
		shape102.curveTo(184.2, -103.2, 200.59999, -119.0, 207.4, -119.399994);
		shape102.curveTo(207.4, -119.399994, 198.2, -117.99999, 195.2, -118.99999);
		shape102.curveTo(192.2, -119.99999, 165.59999, -131.4, 159.6, -132.59999);
		shape102.curveTo(159.6, -132.59999, 142.8, -139.2, 154.8, -137.2);
		shape102.curveTo(154.8, -137.2, 190.6, -133.4, 208.8, -120.2);
		shape102.curveTo(208.8, -120.2, 201.6, -128.59999, 183.2, -135.59999);
		shape102.curveTo(183.2, -135.59999, 161.0, -148.2, 125.799995, -143.2);
		shape102.curveTo(125.799995, -143.2, 108.0, -140.0, 100.2, -138.2);
		shape102.curveTo(100.2, -138.2, 97.601, -138.8, 97.001, -139.2);
		shape102.curveTo(96.401, -139.59999, 84.6, -148.59999, 57.0, -141.59999);
		shape102.curveTo(57.0, -141.59999, 40.0, -136.99998, 31.4, -132.2);
		shape102.curveTo(31.4, -132.2, 16.2, -131.0, 12.6, -127.799995);
		shape102.curveTo(12.6, -127.799995, -6.0, -113.2, -8.0, -112.399994);
		shape102.curveTo(-10.0, -111.59999, -21.4, -103.99999, -22.2, -103.59999);
		shape102.curveTo(-22.2, -103.59999, 2.3999996, -110.19999, 4.799999, -112.59999);
		shape102.curveTo(7.199999, -114.99999, 24.599998, -117.59999, 27.0, -116.19999);
		shape102.curveTo(29.400002, -114.79999, 37.8, -115.39999, 28.2, -114.79999);
		shape102.curveTo(28.2, -114.79999, 103.8, -99.999985, 104.600006, -97.999985);
		shape102.curveTo(105.40001, -95.999985, 109.40001, -97.19998, 109.40001, -97.19998);
		shape102.closePath();
		g.fill(shape102);
	}

	private void paintCompositeGraphicsNode_0_0_0_102(Graphics2D g) {
		// _0_0_0_102_0
		AffineTransform trans_0_0_0_102_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_102_0(g);
		g.setTransform(trans_0_0_0_102_0);
	}

	private void paintShapeNode_0_0_0_103_0(Graphics2D g) {
		GeneralPath shape103 = new GeneralPath();
		shape103.moveTo(180.8, -106.4);
		shape103.curveTo(180.8, -106.4, 170.6, -113.8, 168.6, -113.8);
		shape103.curveTo(166.6, -113.8, 154.20001, -124.0, 150.0, -123.600006);
		shape103.curveTo(145.79999, -123.20001, 133.6, -133.20001, 106.2, -125.00001);
		shape103.curveTo(106.2, -125.00001, 105.6, -127.00001, 109.2, -127.80001);
		shape103.curveTo(109.2, -127.80001, 115.6, -130.00002, 116.0, -130.6);
		shape103.curveTo(116.0, -130.6, 136.2, -134.8, 143.4, -131.20001);
		shape103.curveTo(143.4, -131.20001, 152.59999, -128.6, 158.79999, -122.40001);
		shape103.curveTo(158.79999, -122.40001, 169.99998, -119.20001, 173.19998, -120.20001);
		shape103.curveTo(173.19998, -120.20001, 181.99998, -118.000015, 182.39998, -116.20001);
		shape103.curveTo(182.39998, -116.20001, 188.19998, -113.20001, 186.39998, -110.60001);
		shape103.curveTo(186.39998, -110.60001, 186.79997, -109.000015, 180.79997, -106.40002);
		shape103.closePath();
		g.setPaint(new Color(204, 114, 38, 255));
		g.fill(shape103);
	}

	private void paintCompositeGraphicsNode_0_0_0_103(Graphics2D g) {
		// _0_0_0_103_0
		AffineTransform trans_0_0_0_103_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_103_0(g);
		g.setTransform(trans_0_0_0_103_0);
	}

	private void paintShapeNode_0_0_0_104_0(Graphics2D g) {
		GeneralPath shape104 = new GeneralPath();
		shape104.moveTo(168.33, -108.51);
		shape104.curveTo(169.14, -107.880005, 170.16, -107.78, 170.76, -106.97);
		shape104.curveTo(171.0, -106.66, 170.70999, -106.33, 170.39, -106.23);
		shape104.curveTo(169.35, -105.920006, 168.29, -106.490005, 167.15, -105.9);
		shape104.curveTo(166.75, -105.69, 166.11, -105.87, 165.54999, -106.020004);
		shape104.curveTo(163.91998, -106.46001, 162.08998, -106.490005, 160.4, -105.8);
		shape104.curveTo(158.42, -106.93, 156.06, -106.340004, 153.98, -107.350006);
		shape104.curveTo(153.92, -107.37, 153.7, -107.03001, 153.62, -107.05);
		shape104.curveTo(150.58, -108.200005, 146.83, -107.920006, 144.4, -110.200005);
		shape104.curveTo(141.97, -110.61001, 139.62, -111.07001, 137.18999, -111.75001);
		shape104.curveTo(135.36998, -112.26001, 133.95999, -113.25001, 132.33998, -114.08001);
		shape104.curveTo(130.95998, -114.79001, 129.50998, -115.31001, 127.96998, -115.69001);
		shape104.curveTo(126.10998, -116.14001, 124.279976, -116.03001, 122.38998, -116.55001);
		shape104.curveTo(122.28998, -116.57001, 122.099976, -116.23001, 122.01997, -116.25001);
		shape104.curveTo(121.699974, -116.36001, 121.39997, -116.94001, 121.22997, -116.89001);
		shape104.curveTo(119.54997, -116.37001, 118.059975, -117.340004, 116.39997, -117.00001);
		shape104.curveTo(115.21997, -118.22001, 113.49997, -117.98001, 111.949974, -118.420006);
		shape104.curveTo(108.97997, -119.270004, 105.82997, -118.00001, 102.79997, -119.00001);
		shape104.curveTo(106.90997, -120.840004, 111.599976, -119.61001, 115.65997, -121.68001);
		shape104.curveTo(117.989975, -122.86001, 120.64997, -121.76001, 123.21997, -122.520004);
		shape104.curveTo(123.70997, -122.670006, 124.39997, -122.87, 124.79997, -122.200005);
		shape104.curveTo(124.93997, -122.340004, 125.11997, -122.57001, 125.17997, -122.55);
		shape104.curveTo(127.61997, -121.39, 129.93997, -120.12, 132.41997, -119.05);
		shape104.curveTo(132.75996, -118.9, 133.29997, -119.14, 133.54997, -118.93);
		shape104.curveTo(135.06998, -117.72, 137.00998, -117.82, 138.39998, -116.6);
		shape104.curveTo(140.09998, -117.1, 141.88998, -116.72, 143.61998, -117.35);
		shape104.curveTo(143.69998, -117.369995, 143.92998, -117.03, 143.95998, -117.049995);
		shape104.curveTo(145.09998, -117.799995, 146.24997, -117.53, 147.13997, -117.229996);
		shape104.curveTo(147.47997, -117.10999, 148.13997, -116.85999, 148.44997, -116.78999);
		shape104.curveTo(149.56996, -116.52, 150.42996, -116.03999, 151.60997, -115.84999);
		shape104.curveTo(151.71997, -115.829994, 151.90997, -116.16999, 151.97997, -116.149994);
		shape104.curveTo(153.09996, -115.70999, 154.13997, -115.759995, 154.79997, -114.59999);
		shape104.curveTo(154.93997, -114.73999, 155.09998, -114.96999, 155.17998, -114.94999);
		shape104.curveTo(156.20998, -114.60999, 156.85997, -113.84999, 157.95998, -113.60999);
		shape104.curveTo(158.43997, -113.509995, 159.05998, -112.87999, 159.62997, -112.69999);
		shape104.curveTo(162.01997, -111.969986, 163.86998, -110.43999, 166.05997, -109.54999);
		shape104.curveTo(166.81996, -109.23999, 167.69997, -108.999985, 168.32997, -108.50999);
		shape104.closePath();
		g.fill(shape104);
	}

	private void paintCompositeGraphicsNode_0_0_0_104(Graphics2D g) {
		// _0_0_0_104_0
		AffineTransform trans_0_0_0_104_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_104_0(g);
		g.setTransform(trans_0_0_0_104_0);
	}

	private void paintShapeNode_0_0_0_105_0(Graphics2D g) {
		GeneralPath shape105 = new GeneralPath();
		shape105.moveTo(91.696, -122.74);
		shape105.curveTo(89.178, -124.46, 86.81, -125.57, 84.368, -127.36);
		shape105.curveTo(84.187, -127.49, 83.826996, -127.32, 83.625, -127.44);
		shape105.curveTo(82.618, -128.05, 81.73, -128.63, 80.748, -129.33);
		shape105.curveTo(80.209, -129.71, 79.388, -129.7, 78.880005, -129.96);
		shape105.curveTo(76.336006, -131.25, 73.70701, -131.81001, 71.200005, -133.0);
		shape105.curveTo(71.882, -133.64, 73.004005, -133.39, 73.600006, -134.2);
		shape105.curveTo(73.795006, -133.92, 74.033005, -133.64, 74.38601, -133.83);
		shape105.curveTo(76.06401, -134.73, 77.91401, -134.88, 79.59001, -134.79001);
		shape105.curveTo(81.294014, -134.70001, 83.014015, -134.40001, 84.78901, -134.12001);
		shape105.curveTo(85.09601, -134.08002, 85.295006, -133.56001, 85.61801, -133.46);
		shape105.curveTo(87.84601, -132.8, 90.23501, -133.32, 92.35401, -132.48001);
		shape105.curveTo(93.945015, -131.85, 95.515015, -131.03001, 96.75401, -129.76001);
		shape105.curveTo(97.00601, -129.50002, 96.681015, -129.19, 96.40102, -129.00002);
		shape105.curveTo(96.78902, -129.11002, 97.06202, -128.90001, 97.17302, -128.59001);
		shape105.curveTo(97.25702, -128.35, 97.25702, -128.05002, 97.17302, -127.81001);
		shape105.curveTo(97.06102, -127.500015, 96.78202, -127.40001, 96.40802, -127.35001);
		shape105.curveTo(95.00102, -127.16001, 96.77302, -128.54001, 96.07302, -128.09001);
		shape105.curveTo(94.80002, -127.27001, 95.54602, -125.87001, 94.80102, -124.60001);
		shape105.curveTo(94.52102, -124.790016, 94.291016, -125.01002, 94.40102, -125.40002);
		shape105.curveTo(94.63502, -124.88002, 94.03302, -124.59002, 93.86501, -124.27002);
		shape105.curveTo(93.48001, -123.55002, 92.58102, -122.13002, 91.696014, -122.74002);
		shape105.closePath();
		g.fill(shape105);
	}

	private void paintCompositeGraphicsNode_0_0_0_105(Graphics2D g) {
		// _0_0_0_105_0
		AffineTransform trans_0_0_0_105_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_105_0(g);
		g.setTransform(trans_0_0_0_105_0);
	}

	private void paintShapeNode_0_0_0_106_0(Graphics2D g) {
		GeneralPath shape106 = new GeneralPath();
		shape106.moveTo(59.198, -115.39);
		shape106.curveTo(56.044003, -116.18, 52.994003, -116.07, 49.978, -117.35);
		shape106.curveTo(49.911, -117.369995, 49.688, -117.03, 49.624, -117.049995);
		shape106.curveTo(48.258, -117.649994, 47.34, -118.60999, 46.264, -119.659996);
		shape106.curveTo(45.351, -120.549995, 43.693, -120.159996, 42.419, -120.649994);
		shape106.curveTo(42.094997, -120.77, 41.892, -121.27999, 41.591, -121.31999);
		shape106.curveTo(40.371998, -121.479996, 39.445, -122.42999, 38.4, -122.99999);
		shape106.curveTo(40.736, -123.799995, 43.147003, -123.759995, 45.609, -124.149994);
		shape106.curveTo(45.722, -124.16999, 45.867, -123.84, 46.0, -123.84);
		shape106.curveTo(46.136, -123.84, 46.266, -124.07, 46.4, -124.2);
		shape106.curveTo(46.595, -123.92, 46.897003, -123.59, 47.154003, -123.85);
		shape106.curveTo(47.702003, -124.39, 48.258003, -124.2, 48.798004, -124.159996);
		shape106.curveTo(48.942005, -124.149994, 49.067005, -123.84, 49.200005, -123.84);
		shape106.curveTo(49.336006, -123.84, 49.467003, -124.159996, 49.600006, -124.159996);
		shape106.curveTo(49.736008, -124.159996, 49.867004, -123.84, 50.000008, -123.84);
		shape106.curveTo(50.13601, -123.84, 50.266006, -124.07, 50.40001, -124.2);
		shape106.curveTo(51.09201, -123.42, 51.97701, -123.96999, 52.799007, -123.78999);
		shape106.curveTo(53.837006, -123.56999, 54.104008, -122.41999, 55.17801, -122.119995);
		shape106.curveTo(59.89301, -120.81999, 64.03001, -118.67, 68.393005, -116.579994);
		shape106.curveTo(68.700005, -116.439995, 68.91, -116.189995, 68.8, -115.799995);
		shape106.curveTo(69.067, -115.799995, 69.380005, -115.88999, 69.57, -115.759995);
		shape106.curveTo(70.628, -115.02, 71.669, -114.479996, 72.366, -113.38);
		shape106.curveTo(72.582, -113.04, 72.253, -112.63, 72.02, -112.68);
		shape106.curveTo(67.590996, -113.68, 63.584995, -114.29, 59.197998, -115.39);
		shape106.closePath();
		g.fill(shape106);
	}

	private void paintCompositeGraphicsNode_0_0_0_106(Graphics2D g) {
		// _0_0_0_106_0
		AffineTransform trans_0_0_0_106_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_106_0(g);
		g.setTransform(trans_0_0_0_106_0);
	}

	private void paintShapeNode_0_0_0_107_0(Graphics2D g) {
		GeneralPath shape107 = new GeneralPath();
		shape107.moveTo(45.338, -71.179);
		shape107.curveTo(43.746002, -72.398, 43.162003, -74.429, 42.034, -76.221);
		shape107.curveTo(41.82, -76.561, 42.094, -76.875, 42.411, -76.964);
		shape107.curveTo(42.971, -77.12299, 43.514, -76.645, 43.923, -76.44299);
		shape107.curveTo(45.668, -75.58099, 47.203, -74.33899, 49.2, -74.2);
		shape107.curveTo(51.190002, -71.965996, 55.45, -71.58099, 55.457, -68.2);
		shape107.curveTo(55.458, -67.340996, 54.03, -68.258995, 53.600002, -67.399994);
		shape107.curveTo(51.149002, -68.40299, 48.760002, -68.299995, 46.38, -69.76699);
		shape107.curveTo(45.763, -70.14799, 46.093002, -70.60099, 45.338, -71.17899);
		shape107.closePath();
		g.fill(shape107);
	}

	private void paintCompositeGraphicsNode_0_0_0_107(Graphics2D g) {
		// _0_0_0_107_0
		AffineTransform trans_0_0_0_107_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_107_0(g);
		g.setTransform(trans_0_0_0_107_0);
	}

	private void paintShapeNode_0_0_0_108_0(Graphics2D g) {
		GeneralPath shape108 = new GeneralPath();
		shape108.moveTo(17.8, -123.76);
		shape108.curveTo(17.935, -123.76, 24.966, -123.520004, 24.949, -123.41);
		shape108.curveTo(24.904, -123.100006, 17.174, -122.05, 16.81, -122.22);
		shape108.curveTo(16.646, -122.3, 9.133999, -119.87, 9.0, -120.0);
		shape108.curveTo(9.268, -120.14, 17.534, -123.76, 17.8, -123.76);
		shape108.closePath();
		g.fill(shape108);
	}

	private void paintCompositeGraphicsNode_0_0_0_108(Graphics2D g) {
		// _0_0_0_108_0
		AffineTransform trans_0_0_0_108_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_108_0(g);
		g.setTransform(trans_0_0_0_108_0);
	}

	private void paintShapeNode_0_0_0_109_0(Graphics2D g) {
		GeneralPath shape109 = new GeneralPath();
		shape109.moveTo(33.2, -114.0);
		shape109.curveTo(33.2, -114.0, 18.400002, -112.2, 14.0, -111.0);
		shape109.curveTo(9.599998, -109.8, -9.0, -102.2, -12.0, -100.2);
		shape109.curveTo(-12.0, -100.2, -25.4, -94.799995, -42.4, -74.799995);
		shape109.curveTo(-42.4, -74.799995, -34.800003, -78.2, -32.600002, -80.99999);
		shape109.curveTo(-32.600002, -80.99999, -19.000002, -93.59999, -19.200003, -90.99999);
		shape109.curveTo(-19.200003, -90.99999, -7.000003, -99.59999, -7.6000023, -97.399994);
		shape109.curveTo(-7.6000023, -97.399994, 16.799997, -108.59999, 14.799997, -105.399994);
		shape109.curveTo(14.799997, -105.399994, 36.399998, -109.99999, 35.399998, -107.99999);
		shape109.curveTo(35.399998, -107.99999, 54.199997, -103.59999, 51.399998, -103.399994);
		shape109.curveTo(51.399998, -103.399994, 45.6, -102.2, 51.999996, -98.59999);
		shape109.curveTo(51.999996, -98.59999, 48.599995, -94.19999, 43.199997, -98.19999);
		shape109.curveTo(37.8, -102.19999, 40.799995, -99.99999, 35.799995, -98.99999);
		shape109.curveTo(35.799995, -98.99999, 33.199997, -98.19999, 28.599995, -102.19999);
		shape109.curveTo(28.599995, -102.19999, 22.999994, -106.79999, 14.199995, -103.19999);
		shape109.curveTo(14.199995, -103.19999, -16.400005, -90.59999, -18.400003, -89.99999);
		shape109.curveTo(-18.400003, -89.99999, -22.000004, -87.19999, -24.400003, -83.59999);
		shape109.curveTo(-24.400003, -83.59999, -30.200005, -79.19999, -33.200005, -77.79999);
		shape109.curveTo(-33.200005, -77.79999, -46.000004, -66.19999, -47.200005, -64.79999);
		shape109.curveTo(-47.200005, -64.79999, -50.600006, -59.599987, -51.400005, -59.19999);
		shape109.curveTo(-51.400005, -59.19999, -45.000004, -62.99999, -43.000008, -64.99999);
		shape109.curveTo(-43.000008, -64.99999, -29.000008, -74.99999, -23.600008, -75.799995);
		shape109.curveTo(-23.600008, -75.799995, -19.200008, -78.799995, -18.40001, -80.2);
		shape109.curveTo(-18.40001, -80.2, -4.0000095, -89.399994, 0.19999123, -89.399994);
		shape109.curveTo(0.19999123, -89.399994, 9.399991, -84.2, 11.799992, -91.2);
		shape109.curveTo(11.799992, -91.2, 17.59999, -93.0, 23.199991, -91.799995);
		shape109.curveTo(23.199991, -91.799995, 26.399992, -94.399994, 25.59999, -96.6);
		shape109.curveTo(25.59999, -96.6, 27.199991, -98.4, 28.199991, -94.6);
		shape109.curveTo(28.199991, -94.6, 31.59999, -91.0, 36.39999, -93.0);
		shape109.curveTo(36.39999, -93.0, 40.39999, -93.2, 38.39999, -90.8);
		shape109.curveTo(38.39999, -90.8, 33.99999, -87.0, 22.19999, -86.8);
		shape109.curveTo(22.19999, -86.8, 9.79999, -86.200005, -6.60001, -78.600006);
		shape109.curveTo(-6.60001, -78.600006, -36.40001, -68.200005, -45.60001, -57.800007);
		shape109.curveTo(-45.60001, -57.800007, -52.00001, -49.000008, -57.40001, -47.800007);
		shape109.curveTo(-57.40001, -47.800007, -63.20001, -47.000008, -69.20001, -39.600006);
		shape109.curveTo(-69.20001, -39.600006, -59.400013, -45.400005, -50.400013, -45.400005);
		shape109.curveTo(-50.400013, -45.400005, -46.400013, -47.800007, -50.200012, -44.200005);
		shape109.curveTo(-50.200012, -44.200005, -53.80001, -36.600006, -52.200012, -31.200005);
		shape109.curveTo(-52.200012, -31.200005, -52.80001, -26.000004, -53.600014, -24.400005);
		shape109.curveTo(-53.600014, -24.400005, -61.400013, -11.600005, -61.400013, -9.200006);
		shape109.curveTo(-61.400013, -6.800006, -60.200012, 2.9999943, -59.800014, 3.5999947);
		shape109.curveTo(-59.400017, 4.199995, -60.800014, 1.9999946, -57.000015, 4.399995);
		shape109.curveTo(-53.200016, 6.799995, -50.400017, 8.399995, -49.600014, 11.199995);
		shape109.curveTo(-48.80001, 13.999995, -51.600014, 5.799995, -51.800014, 3.9999952);
		shape109.curveTo(-52.000015, 2.1999955, -56.200016, -5.000005, -55.400013, -7.4000044);
		shape109.curveTo(-55.400013, -7.4000044, -54.400013, -6.4000044, -53.600014, -5.0000043);
		shape109.curveTo(-53.600014, -5.0000043, -54.200012, -5.600004, -53.600014, -9.200005);
		shape109.curveTo(-53.600014, -9.200005, -52.800014, -14.400004, -51.400013, -17.600004);
		shape109.curveTo(-50.00001, -20.800003, -48.00001, -24.600004, -47.600014, -25.400005);
		shape109.curveTo(-47.200016, -26.200006, -47.200012, -32.000004, -45.800014, -29.400005);
		shape109.lineTo(-42.400013, -26.800005);
		shape109.curveTo(-42.400013, -26.800005, -45.200012, -29.400005, -43.00001, -31.600006);
		shape109.curveTo(-43.00001, -31.600006, -44.00001, -37.200005, -42.200012, -39.800007);
		shape109.curveTo(-42.200012, -39.800007, -35.200012, -48.200005, -33.600014, -49.200005);
		shape109.curveTo(-32.000015, -50.200005, -33.400013, -49.800003, -33.400013, -49.800003);
		shape109.curveTo(-33.400013, -49.800003, -27.400013, -54.000004, -33.200012, -52.4);
		shape109.curveTo(-33.200012, -52.4, -37.200012, -50.800003, -40.200012, -50.800003);
		shape109.curveTo(-40.200012, -50.800003, -47.80001, -48.800003, -43.80001, -53.000004);
		shape109.curveTo(-39.80001, -57.200005, -29.80001, -62.600006, -26.000011, -62.4);
		shape109.lineTo(-25.200012, -60.800003);
		shape109.lineTo(-14.000012, -63.200005);
		shape109.lineTo(-15.200012, -62.400005);
		shape109.curveTo(-15.200012, -62.400005, -15.400012, -62.600006, -11.200012, -63.000004);
		shape109.curveTo(-7.0000124, -63.4, -1.2000122, -62.000004, 0.19998741, -63.800003);
		shape109.curveTo(1.599987, -65.600006, 4.9999876, -66.600006, 4.5999875, -65.200005);
		shape109.curveTo(4.1999874, -63.800003, 3.9999876, -61.800003, 3.9999876, -61.800003);
		shape109.curveTo(3.9999876, -61.800003, 8.999988, -67.600006, 8.399988, -65.4);
		shape109.curveTo(7.7999887, -63.199997, -0.40001202, -58.0, -1.8000116, -51.800003);
		shape109.lineTo(8.599988, -60.000004);
		shape109.lineTo(12.199987, -63.000004);
		shape109.curveTo(12.199987, -63.000004, 15.799988, -60.800003, 15.999988, -62.400005);
		shape109.curveTo(16.199987, -64.00001, 20.799988, -69.8, 21.999989, -69.600006);
		shape109.curveTo(23.19999, -69.40001, 25.19999, -72.200005, 24.999989, -69.600006);
		shape109.curveTo(24.799988, -67.00001, 32.39999, -61.600006, 32.39999, -61.600006);
		shape109.curveTo(32.39999, -61.600006, 35.59999, -63.400005, 36.99999, -62.000008);
		shape109.curveTo(38.399986, -60.60001, 42.599987, -81.8, 42.599987, -81.8);
		shape109.lineTo(67.59999, -92.4);
		shape109.lineTo(111.19999, -95.8);
		shape109.lineTo(94.20099, -102.600006);
		shape109.lineTo(33.19999, -114.00001);
		shape109.closePath();
		g.setPaint(new Color(0, 0, 0, 255));
		g.fill(shape109);
	}

	private void paintCompositeGraphicsNode_0_0_0_109(Graphics2D g) {
		// _0_0_0_109_0
		AffineTransform trans_0_0_0_109_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_109_0(g);
		g.setTransform(trans_0_0_0_109_0);
	}

	private void paintShapeNode_0_0_0_110_0(Graphics2D g) {
		GeneralPath shape110 = new GeneralPath();
		shape110.moveTo(51.4, 85.0);
		shape110.curveTo(51.4, 85.0, 36.4, 68.2, 28.000002, 65.6);
		shape110.curveTo(28.000002, 65.6, 14.600002, 58.8, -9.999998, 66.6);
		g.setPaint(new Color(76, 0, 0, 255));
		g.setStroke(new BasicStroke(2.0f,0,0,4.0f,null,0.0f));
		g.draw(shape110);
	}

	private void paintCompositeGraphicsNode_0_0_0_110(Graphics2D g) {
		// _0_0_0_110_0
		AffineTransform trans_0_0_0_110_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_110_0(g);
		g.setTransform(trans_0_0_0_110_0);
	}

	private void paintShapeNode_0_0_0_111_0(Graphics2D g) {
		GeneralPath shape111 = new GeneralPath();
		shape111.moveTo(24.8, 64.2);
		shape111.curveTo(24.8, 64.2, -0.40000153, 56.199997, -15.799999, 60.399998);
		shape111.curveTo(-15.799999, 60.399998, -34.199997, 62.399998, -42.6, 76.2);
		g.draw(shape111);
	}

	private void paintCompositeGraphicsNode_0_0_0_111(Graphics2D g) {
		// _0_0_0_111_0
		AffineTransform trans_0_0_0_111_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_111_0(g);
		g.setTransform(trans_0_0_0_111_0);
	}

	private void paintShapeNode_0_0_0_112_0(Graphics2D g) {
		GeneralPath shape112 = new GeneralPath();
		shape112.moveTo(21.2, 63.0);
		shape112.curveTo(21.2, 63.0, 4.200001, 55.8, -10.599998, 53.6);
		shape112.curveTo(-10.599998, 53.6, -27.199999, 51.0, -43.8, 58.199997);
		shape112.curveTo(-43.8, 58.199997, -56.0, 64.2, -61.4, 74.399994);
		g.draw(shape112);
	}

	private void paintCompositeGraphicsNode_0_0_0_112(Graphics2D g) {
		// _0_0_0_112_0
		AffineTransform trans_0_0_0_112_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_112_0(g);
		g.setTransform(trans_0_0_0_112_0);
	}

	private void paintShapeNode_0_0_0_113_0(Graphics2D g) {
		GeneralPath shape113 = new GeneralPath();
		shape113.moveTo(22.2, 63.4);
		shape113.curveTo(22.2, 63.4, 6.800001, 52.4, 5.800001, 51.0);
		shape113.curveTo(5.800001, 51.0, -1.1999989, 40.0, -14.199999, 39.6);
		shape113.curveTo(-14.199999, 39.6, -35.6, 40.399998, -52.799995, 48.399998);
		g.draw(shape113);
	}

	private void paintCompositeGraphicsNode_0_0_0_113(Graphics2D g) {
		// _0_0_0_113_0
		AffineTransform trans_0_0_0_113_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_113_0(g);
		g.setTransform(trans_0_0_0_113_0);
	}

	private void paintShapeNode_0_0_0_114_0(Graphics2D g) {
		GeneralPath shape114 = new GeneralPath();
		shape114.moveTo(20.895, 54.407);
		shape114.curveTo(22.437, 55.870003, 49.4, 84.8, 49.4, 84.8);
		shape114.curveTo(84.600006, 121.4, 56.600002, 87.200005, 56.600002, 87.200005);
		shape114.curveTo(49.000004, 82.4, 39.800003, 63.600006, 39.800003, 63.600006);
		shape114.curveTo(38.600002, 60.800007, 53.800003, 70.8, 53.800003, 70.8);
		shape114.curveTo(57.800003, 71.600006, 71.4, 90.8, 71.4, 90.8);
		shape114.curveTo(64.6, 88.4, 69.4, 95.600006, 69.4, 95.600006);
		shape114.curveTo(72.200005, 97.600006, 92.601, 113.200005, 92.601, 113.200005);
		shape114.curveTo(96.201, 117.200005, 100.2, 118.8, 100.2, 118.8);
		shape114.curveTo(114.2, 113.600006, 107.799995, 126.8, 107.799995, 126.8);
		shape114.curveTo(110.2, 133.6, 115.799995, 122.0, 115.799995, 122.0);
		shape114.curveTo(126.99999, 105.2, 110.6, 107.6, 110.6, 107.6);
		shape114.curveTo(80.6, 110.4, 73.8, 94.4, 73.8, 94.4);
		shape114.curveTo(71.4, 92.0, 80.200005, 94.4, 80.200005, 94.4);
		shape114.curveTo(88.601006, 96.4, 73.00001, 82.0, 73.00001, 82.0);
		shape114.curveTo(75.40001, 82.0, 84.600006, 88.8, 84.600006, 88.8);
		shape114.curveTo(95.00101, 98.0, 97.00101, 96.0, 97.00101, 96.0);
		shape114.curveTo(115.00001, 87.2, 125.40001, 94.8, 125.40001, 94.8);
		shape114.curveTo(127.40001, 96.4, 121.80001, 103.200005, 123.40001, 108.4);
		shape114.curveTo(125.00001, 113.6, 129.8, 126.0, 129.8, 126.0);
		shape114.curveTo(127.4, 127.6, 127.8, 138.4, 127.8, 138.4);
		shape114.curveTo(144.6, 161.59999, 135.0, 159.59999, 135.0, 159.59999);
		shape114.curveTo(119.4, 159.2, 134.2, 166.79999, 134.2, 166.79999);
		shape114.curveTo(137.4, 168.79999, 146.2, 175.99998, 146.2, 175.99998);
		shape114.curveTo(143.4, 174.79999, 141.8, 179.99998, 141.8, 179.99998);
		shape114.curveTo(146.6, 183.99998, 143.8, 188.79999, 143.8, 188.79999);
		shape114.curveTo(137.8, 189.99998, 136.6, 193.99998, 136.6, 193.99998);
		shape114.curveTo(143.40001, 201.99998, 133.40001, 202.39998, 133.40001, 202.39998);
		shape114.curveTo(137.00002, 206.79997, 132.20001, 218.79997, 132.20001, 218.79997);
		shape114.curveTo(127.40001, 218.79997, 121.000015, 224.39998, 121.000015, 224.39998);
		shape114.curveTo(123.40002, 229.19998, 113.000015, 234.79997, 113.000015, 234.79997);
		shape114.curveTo(104.60001, 236.39998, 107.40002, 243.19997, 107.40002, 243.19997);
		shape114.curveTo(99.40102, 249.19997, 97.001015, 265.19995, 97.001015, 265.19995);
		shape114.curveTo(96.20101, 275.59995, 93.80102, 278.79996, 99.001015, 276.79996);
		shape114.curveTo(104.20001, 274.79996, 103.40002, 262.39996, 103.40002, 262.39996);
		shape114.curveTo(98.60101, 246.79996, 141.40002, 230.79996, 141.40002, 230.79996);
		shape114.curveTo(145.40002, 229.19995, 146.20003, 223.99995, 146.20003, 223.99995);
		shape114.curveTo(148.20003, 224.39995, 157.00003, 231.99995, 157.00003, 231.99995);
		shape114.curveTo(164.60004, 243.19995, 165.00003, 233.99995, 165.00003, 233.99995);
		shape114.curveTo(166.20003, 230.39995, 164.60004, 224.39995, 164.60004, 224.39995);
		shape114.curveTo(170.60004, 202.79994, 156.60004, 196.39995, 156.60004, 196.39995);
		shape114.curveTo(146.60004, 162.79996, 160.60004, 171.19995, 160.60004, 171.19995);
		shape114.curveTo(163.40004, 176.79996, 174.20004, 181.99995, 174.20004, 181.99995);
		shape114.lineTo(177.80005, 179.59996);
		shape114.curveTo(176.20004, 174.79996, 184.60005, 168.79996, 184.60005, 168.79996);
		shape114.curveTo(187.40005, 175.19995, 193.40005, 167.19995, 193.40005, 167.19995);
		shape114.curveTo(197.00006, 142.79996, 209.40005, 157.19995, 209.40005, 157.19995);
		shape114.curveTo(213.40005, 158.39995, 214.60005, 151.59995, 214.60005, 151.59995);
		shape114.curveTo(218.20006, 141.19995, 214.60005, 127.599945, 214.60005, 127.599945);
		shape114.curveTo(218.20006, 127.19994, 227.80005, 133.19995, 227.80005, 133.19995);
		shape114.curveTo(230.60005, 129.59995, 221.40005, 112.79995, 225.40005, 115.19995);
		shape114.curveTo(229.40005, 117.59995, 233.80005, 119.19995, 233.80005, 119.19995);
		shape114.curveTo(234.60005, 117.19995, 224.60005, 104.79995, 224.60005, 104.79995);
		shape114.curveTo(220.20006, 101.99995, 215.00005, 81.599945, 215.00005, 81.599945);
		shape114.curveTo(222.20004, 85.19994, 212.20004, 69.99995, 212.20004, 69.99995);
		shape114.curveTo(212.20004, 66.79995, 218.20004, 55.599945, 218.20004, 55.599945);
		shape114.curveTo(217.40004, 48.799946, 218.20004, 49.199944, 218.20004, 49.199944);
		shape114.curveTo(221.00005, 50.399944, 229.00005, 51.999943, 222.20004, 45.599945);
		shape114.curveTo(215.40004, 39.199947, 223.00005, 34.399944, 223.00005, 34.399944);
		shape114.curveTo(227.40004, 31.599945, 213.80005, 31.999945, 213.80005, 31.999945);
		shape114.curveTo(208.60005, 27.599945, 209.00005, 23.599945, 209.00005, 23.599945);
		shape114.curveTo(217.00005, 25.599945, 202.60005, 11.199945, 200.20004, 7.599945);
		shape114.curveTo(197.80003, 3.9999447, 207.40004, -1.2000551, 207.40004, -1.2000551);
		shape114.curveTo(220.60004, -4.800055, 209.00005, -8.000055, 209.00005, -8.000055);
		shape114.curveTo(189.40004, -7.600055, 200.20004, -18.400055, 200.20004, -18.400055);
		shape114.curveTo(206.20004, -18.000055, 204.60004, -20.400055, 204.60004, -20.400055);
		shape114.curveTo(199.40004, -21.600056, 189.80003, -28.000055, 189.80003, -28.000055);
		shape114.curveTo(185.80003, -31.600056, 189.40004, -30.800055, 189.40004, -30.800055);
		shape114.curveTo(206.20004, -29.600054, 177.40004, -40.800056, 177.40004, -40.800056);
		shape114.curveTo(185.40004, -40.800056, 167.40004, -51.200058, 167.40004, -51.200058);
		shape114.curveTo(165.40004, -52.800056, 162.20004, -60.40006, 162.20004, -60.40006);
		shape114.curveTo(156.20004, -65.60006, 151.40004, -72.400055, 151.40004, -72.400055);
		shape114.curveTo(151.00005, -76.80006, 146.20004, -81.60005, 146.20004, -81.60005);
		shape114.curveTo(134.60004, -95.20005, 129.00005, -94.80005, 129.00005, -94.80005);
		shape114.curveTo(114.20004, -98.40005, 109.000046, -97.60005, 109.000046, -97.60005);
		shape114.lineTo(56.200047, -93.20005);
		shape114.curveTo(29.800047, -80.40005, 37.600044, -59.40005, 37.600044, -59.40005);
		shape114.curveTo(44.000046, -51.000053, 53.200043, -54.800053, 53.200043, -54.800053);
		shape114.curveTo(57.80004, -61.000053, 69.40004, -58.800053, 69.40004, -58.800053);
		shape114.curveTo(89.80104, -55.60005, 87.20104, -59.200054, 87.20104, -59.200054);
		shape114.curveTo(84.80104, -63.800053, 68.600044, -70.00005, 68.40004, -70.60005);
		shape114.curveTo(68.200035, -71.20005, 59.40004, -74.60005, 59.40004, -74.60005);
		shape114.curveTo(56.40004, -75.80005, 52.00004, -85.00005, 52.00004, -85.00005);
		shape114.curveTo(48.800037, -88.400055, 64.60004, -82.60005, 64.60004, -82.60005);
		shape114.curveTo(63.400036, -81.60005, 70.80003, -77.60005, 70.80003, -77.60005);
		shape114.curveTo(88.201035, -78.60005, 98.80103, -67.80005, 98.80103, -67.80005);
		shape114.curveTo(109.60004, -51.20005, 109.80003, -59.400047, 109.80003, -59.400047);
		shape114.curveTo(112.60004, -68.80005, 100.80003, -90.000046, 100.80003, -90.000046);
		shape114.curveTo(101.200035, -92.000046, 109.40003, -85.40005, 109.40003, -85.40005);
		shape114.curveTo(110.80003, -87.40005, 111.60003, -81.600044, 111.60003, -81.600044);
		shape114.curveTo(111.800026, -79.20004, 115.60003, -71.20004, 115.60003, -71.20004);
		shape114.curveTo(118.40003, -58.200043, 122.00003, -65.600044, 122.00003, -65.600044);
		shape114.lineTo(126.60003, -56.200043);
		shape114.curveTo(128.00003, -53.600044, 122.00003, -46.000042, 122.00003, -46.000042);
		shape114.curveTo(121.80003, -43.200043, 122.60003, -43.400043, 117.00003, -35.80004);
		shape114.curveTo(111.40003, -28.200039, 114.80003, -23.800041, 114.80003, -23.800041);
		shape114.curveTo(113.40003, -17.20004, 122.200035, -17.60004, 122.200035, -17.60004);
		shape114.curveTo(124.80003, -15.400041, 128.20004, -15.400041, 128.20004, -15.400041);
		shape114.curveTo(130.00005, -13.400041, 132.40004, -14.000041, 132.40004, -14.000041);
		shape114.curveTo(134.00005, -17.800041, 140.20004, -15.800041, 140.20004, -15.800041);
		shape114.curveTo(141.60004, -18.20004, 149.80005, -18.60004, 149.80005, -18.60004);
		shape114.curveTo(150.80005, -21.20004, 151.20004, -22.800041, 154.60005, -23.40004);
		shape114.curveTo(158.00006, -24.000038, 133.40005, -67.00004, 133.40005, -67.00004);
		shape114.curveTo(139.80005, -67.80004, 131.60005, -80.200035, 131.60005, -80.200035);
		shape114.curveTo(129.40005, -86.80003, 140.80005, -72.200035, 143.00005, -70.80003);
		shape114.curveTo(145.20004, -69.40003, 146.20004, -67.200035, 144.60005, -67.40003);
		shape114.curveTo(143.00006, -67.60003, 141.20006, -65.40003, 142.60005, -65.200035);
		shape114.curveTo(144.00005, -65.00004, 157.00005, -50.000034, 160.40005, -39.800034);
		shape114.curveTo(163.80006, -29.600033, 169.80005, -25.600033, 176.00006, -19.600033);
		shape114.curveTo(182.20007, -13.600033, 181.40005, 10.599968, 181.40005, 10.599968);
		shape114.curveTo(181.00006, 19.399967, 187.00006, 29.999968, 187.00006, 29.999968);
		shape114.curveTo(189.00006, 33.79997, 184.80006, 51.99997, 184.80006, 51.99997);
		shape114.curveTo(182.80006, 54.19997, 184.20006, 54.99997, 184.20006, 54.99997);
		shape114.curveTo(185.20006, 56.19997, 192.00006, 69.39997, 192.00006, 69.39997);
		shape114.curveTo(190.20006, 69.199974, 193.80006, 72.79997, 193.80006, 72.79997);
		shape114.curveTo(199.00006, 78.79997, 192.60007, 75.79997, 192.60007, 75.79997);
		shape114.curveTo(186.60007, 74.199974, 193.60007, 83.99997, 193.60007, 83.99997);
		shape114.curveTo(194.80006, 85.79997, 185.80006, 81.19997, 185.80006, 81.19997);
		shape114.curveTo(176.60007, 80.59997, 188.20006, 87.799965, 188.20006, 87.799965);
		shape114.curveTo(196.80006, 94.99996, 185.40005, 90.59997, 185.40005, 90.59997);
		shape114.curveTo(180.80005, 88.799965, 184.00006, 95.59997, 184.00006, 95.59997);
		shape114.curveTo(187.20006, 97.19997, 204.40005, 104.19997, 204.40005, 104.19997);
		shape114.curveTo(204.80005, 107.99997, 201.80005, 112.99997, 201.80005, 112.99997);
		shape114.curveTo(202.20004, 116.99997, 200.00005, 120.39997, 200.00005, 120.39997);
		shape114.curveTo(198.80005, 128.59998, 198.20004, 129.39996, 198.20004, 129.39996);
		shape114.curveTo(194.00005, 129.59996, 186.60004, 143.39996, 186.60004, 143.39996);
		shape114.curveTo(184.80003, 145.99997, 174.60004, 157.99997, 174.60004, 157.99997);
		shape114.curveTo(172.60004, 164.99997, 154.60004, 157.79997, 154.60004, 157.79997);
		shape114.curveTo(148.00003, 161.19997, 150.00003, 157.79997, 150.00003, 157.79997);
		shape114.curveTo(149.60004, 155.59998, 154.40002, 149.59998, 154.40002, 149.59998);
		shape114.curveTo(161.40002, 146.99997, 158.80002, 136.19998, 158.80002, 136.19998);
		shape114.curveTo(162.80002, 134.79999, 151.60002, 131.99998, 151.80002, 130.79999);
		shape114.curveTo(152.00002, 129.59999, 157.80002, 128.19998, 157.80002, 128.19998);
		shape114.curveTo(165.80002, 126.19998, 161.40002, 123.79998, 161.40002, 123.79998);
		shape114.curveTo(160.80002, 119.79998, 163.80002, 114.19998, 163.80002, 114.19998);
		shape114.curveTo(175.40002, 113.39998, 163.80002, 97.19998, 163.80002, 97.19998);
		shape114.curveTo(153.00002, 89.59998, 152.00002, 83.79998, 152.00002, 83.79998);
		shape114.curveTo(164.60002, 75.59998, 156.40001, 63.19998, 156.60002, 59.59998);
		shape114.curveTo(156.80003, 55.999977, 158.00002, 34.39998, 158.00002, 34.39998);
		shape114.curveTo(156.00002, 28.199978, 153.00002, 14.599979, 153.00002, 14.599979);
		shape114.curveTo(155.20001, 9.39998, 162.60002, -3.2000198, 162.60002, -3.2000198);
		shape114.curveTo(165.40002, -7.4000196, 174.20003, -12.20002, 172.00002, -15.20002);
		shape114.curveTo(169.8, -18.20002, 162.00002, -16.40002, 162.00002, -16.40002);
		shape114.curveTo(154.20001, -17.80002, 154.80002, -12.60002, 154.80002, -12.60002);
		shape114.curveTo(153.20001, -11.60002, 152.40002, -6.6000204, 152.40002, -6.6000204);
		shape114.curveTo(151.68002, 1.3329797, 142.80002, 7.5999794, 142.80002, 7.5999794);
		shape114.curveTo(131.60002, 13.799979, 140.80002, 17.79998, 140.80002, 17.79998);
		shape114.curveTo(146.80002, 24.39998, 137.00002, 24.59998, 137.00002, 24.59998);
		shape114.curveTo(126.000015, 22.79998, 134.20001, 32.999977, 134.20001, 32.999977);
		shape114.curveTo(145.00002, 45.799976, 142.00002, 48.599976, 142.00002, 48.599976);
		shape114.curveTo(131.80002, 49.599976, 144.40001, 58.799976, 144.40001, 58.799976);
		shape114.curveTo(144.40001, 58.799976, 143.6, 56.799976, 143.8, 58.599976);
		shape114.curveTo(144.0, 60.399975, 147.0, 64.599976, 147.8, 66.599976);
		shape114.curveTo(148.6, 68.599976, 144.6, 68.79997, 144.6, 68.79997);
		shape114.curveTo(145.20001, 78.39997, 129.8, 74.199974, 129.8, 74.199974);
		shape114.lineTo(128.2, 74.39997);
		shape114.curveTo(126.6, 74.59997, 115.399994, 73.79997, 109.6, 71.59997);
		shape114.curveTo(103.8, 69.39996, 97.001, 69.39997, 97.001, 69.39997);
		shape114.curveTo(97.001, 69.39997, 93.001, 71.199974, 85.4, 70.99997);
		shape114.curveTo(77.8, 70.79997, 69.8, 73.59997, 69.8, 73.59997);
		shape114.curveTo(65.4, 73.19997, 74.0, 68.799965, 74.200005, 68.99997);
		shape114.curveTo(74.40001, 69.199974, 80.00001, 63.599968, 72.00001, 64.19997);
		shape114.curveTo(50.203007, 65.83497, 39.40001, 55.599968, 39.40001, 55.599968);
		shape114.curveTo(37.40001, 54.199966, 34.80001, 51.399967, 34.80001, 51.399967);
		shape114.curveTo(24.80001, 49.399967, 36.200012, 63.799965, 36.200012, 63.799965);
		shape114.curveTo(37.400013, 65.19997, 36.00001, 66.19997, 36.00001, 66.19997);
		shape114.curveTo(35.200012, 64.59997, 27.400011, 59.199966, 27.400011, 59.199966);
		shape114.curveTo(24.58901, 58.226967, 23.226011, 56.892967, 20.895012, 54.406967);
		shape114.closePath();
		g.setPaint(new Color(0, 0, 0, 255));
		g.fill(shape114);
	}

	private void paintCompositeGraphicsNode_0_0_0_114(Graphics2D g) {
		// _0_0_0_114_0
		AffineTransform trans_0_0_0_114_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_114_0(g);
		g.setTransform(trans_0_0_0_114_0);
	}

	private void paintShapeNode_0_0_0_115_0(Graphics2D g) {
		GeneralPath shape115 = new GeneralPath();
		shape115.moveTo(-3.0, 42.8);
		shape115.curveTo(-3.0, 42.8, 8.6, 48.399998, 11.2, 51.199997);
		shape115.curveTo(13.799999, 53.999996, 27.8, 65.399994, 27.8, 65.399994);
		shape115.curveTo(27.8, 65.399994, 22.4, 63.399994, 19.8, 61.599995);
		shape115.curveTo(17.199999, 59.799995, 6.3999996, 51.599995, 6.3999996, 51.599995);
		shape115.curveTo(6.3999996, 51.599995, 2.5999997, 45.599995, -3.0, 42.799995);
		shape115.closePath();
		g.setPaint(new Color(76, 0, 0, 255));
		g.fill(shape115);
	}

	private void paintCompositeGraphicsNode_0_0_0_115(Graphics2D g) {
		// _0_0_0_115_0
		AffineTransform trans_0_0_0_115_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_115_0(g);
		g.setTransform(trans_0_0_0_115_0);
	}

	private void paintShapeNode_0_0_0_116_0(Graphics2D g) {
		GeneralPath shape116 = new GeneralPath();
		shape116.moveTo(-61.009, 11.603);
		shape116.curveTo(-60.671997, 11.455, -61.196, 8.743, -61.399998, 8.2);
		shape116.curveTo(-62.421997, 5.474, -71.399994, 4.0, -71.399994, 4.0);
		shape116.curveTo(-71.62699, 5.365, -71.68199, 6.961, -71.576, 8.599);
		shape116.curveTo(-71.576, 8.599, -66.70799, 14.118, -61.008995, 11.603);
		shape116.closePath();
		g.setPaint(new Color(153, 204, 50, 255));
		g.fill(shape116);
	}

	private void paintCompositeGraphicsNode_0_0_0_116(Graphics2D g) {
		// _0_0_0_116_0
		AffineTransform trans_0_0_0_116_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_116_0(g);
		g.setTransform(trans_0_0_0_116_0);
	}

	private void paintShapeNode_0_0_0_117_0(Graphics2D g) {
		GeneralPath shape117 = new GeneralPath();
		shape117.moveTo(-61.009, 11.403);
		shape117.curveTo(-61.458, 11.561, -61.024, 8.669, -61.2, 8.2);
		shape117.curveTo(-62.222, 5.474, -71.4, 3.8999996, -71.4, 3.8999996);
		shape117.curveTo(-71.627, 5.2649994, -71.682, 6.8609996, -71.576004, 8.499);
		shape117.curveTo(-71.576004, 8.499, -67.30801, 13.618, -61.009003, 11.403);
		shape117.closePath();
		g.setPaint(new Color(101, 153, 0, 255));
		g.fill(shape117);
	}

	private void paintCompositeGraphicsNode_0_0_0_117(Graphics2D g) {
		// _0_0_0_117_0
		AffineTransform trans_0_0_0_117_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_117_0(g);
		g.setTransform(trans_0_0_0_117_0);
	}

	private void paintShapeNode_0_0_0_118_0(Graphics2D g) {
		GeneralPath shape118 = new GeneralPath();
		shape118.moveTo(-65.4, 11.546);
		shape118.curveTo(-66.025, 11.546, -66.531, 10.405999, -66.531, 9.0);
		shape118.curveTo(-66.531, 7.5950003, -66.025, 6.455, -65.4, 6.455);
		shape118.curveTo(-64.775, 6.455, -64.268005, 7.595, -64.268005, 9.0);
		shape118.curveTo(-64.268005, 10.406, -64.77501, 11.546, -65.40001, 11.546);
		shape118.closePath();
		g.setPaint(new Color(0, 0, 0, 255));
		g.fill(shape118);
	}

	private void paintCompositeGraphicsNode_0_0_0_118(Graphics2D g) {
		// _0_0_0_118_0
		AffineTransform trans_0_0_0_118_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_118_0(g);
		g.setTransform(trans_0_0_0_118_0);
	}

	private void paintShapeNode_0_0_0_119_0(Graphics2D g) {
		GeneralPath shape119 = new GeneralPath();
		g.fill(shape119);
	}

	private void paintCompositeGraphicsNode_0_0_0_119(Graphics2D g) {
		// _0_0_0_119_0
		AffineTransform trans_0_0_0_119_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_119_0(g);
		g.setTransform(trans_0_0_0_119_0);
	}

	private void paintShapeNode_0_0_0_120_0(Graphics2D g) {
		GeneralPath shape120 = new GeneralPath();
		shape120.moveTo(-111.0, 109.6);
		shape120.curveTo(-111.0, 109.6, -116.6, 119.6, -91.8, 113.6);
		shape120.curveTo(-91.8, 113.6, -77.8, 112.4, -75.4, 110.0);
		shape120.curveTo(-74.200005, 110.8, -65.834, 113.73, -63.0, 114.4);
		shape120.curveTo(-56.2, 116.0, -47.8, 106.0, -47.8, 106.0);
		shape120.curveTo(-47.8, 106.0, -43.2, 95.5, -40.399998, 95.5);
		shape120.curveTo(-37.599995, 95.5, -40.8, 97.1, -40.8, 97.1);
		shape120.curveTo(-40.8, 97.1, -47.399998, 107.2, -47.0, 108.799995);
		shape120.curveTo(-47.0, 108.799995, -52.2, 128.79999, -68.2, 129.59999);
		shape120.curveTo(-68.2, 129.59999, -84.35, 130.54999, -83.0, 136.4);
		shape120.curveTo(-83.0, 136.4, -74.2, 134.0, -71.8, 136.4);
		shape120.curveTo(-71.8, 136.4, -61.000004, 136.0, -69.0, 142.4);
		shape120.lineTo(-75.8, 154.0);
		shape120.curveTo(-75.8, 154.0, -75.66, 157.92, -85.8, 154.4);
		shape120.curveTo(-95.600006, 151.0, -105.9, 138.09999, -105.9, 138.09999);
		shape120.curveTo(-105.9, 138.09999, -121.85, 123.54999, -111.0, 109.59999);
		shape120.closePath();
		g.fill(shape120);
	}

	private void paintCompositeGraphicsNode_0_0_0_120(Graphics2D g) {
		// _0_0_0_120_0
		AffineTransform trans_0_0_0_120_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_120_0(g);
		g.setTransform(trans_0_0_0_120_0);
	}

	private void paintShapeNode_0_0_0_121_0(Graphics2D g) {
		GeneralPath shape121 = new GeneralPath();
		shape121.moveTo(-112.2, 113.6);
		shape121.curveTo(-112.2, 113.6, -114.2, 123.2, -77.399994, 112.799995);
		shape121.lineTo(-70.59999, 113.6);
		shape121.curveTo(-68.19999, 114.4, -56.19999, 117.2, -54.19999, 116.0);
		shape121.curveTo(-54.19999, 116.0, -61.39999, 129.6, -72.999985, 128.0);
		shape121.curveTo(-72.999985, 128.0, -86.19998, 129.6, -85.79999, 134.4);
		shape121.curveTo(-85.79999, 134.4, -81.79999, 141.59999, -76.999985, 144.0);
		shape121.curveTo(-76.999985, 144.0, -74.19998, 146.4, -74.59998, 149.6);
		shape121.curveTo(-74.999985, 152.80002, -77.79998, 154.40001, -79.79998, 155.20001);
		shape121.curveTo(-81.79998, 156.00002, -84.99998, 152.80002, -86.59998, 152.80002);
		shape121.curveTo(-88.19999, 152.80002, -96.59998, 146.40002, -100.999985, 141.60002);
		shape121.curveTo(-105.39999, 136.80002, -113.79999, 124.80002, -113.39999, 122.00002);
		shape121.curveTo(-112.999985, 119.20003, -112.19999, 113.60002, -112.19999, 113.60002);
		shape121.closePath();
		g.setPaint(new Color(229, 153, 153, 255));
		g.fill(shape121);
	}

	private void paintCompositeGraphicsNode_0_0_0_121(Graphics2D g) {
		// _0_0_0_121_0
		AffineTransform trans_0_0_0_121_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_121_0(g);
		g.setTransform(trans_0_0_0_121_0);
	}

	private void paintShapeNode_0_0_0_122_0(Graphics2D g) {
		GeneralPath shape122 = new GeneralPath();
		shape122.moveTo(-109.0, 131.05);
		shape122.curveTo(-106.4, 135.0, -103.2, 139.2, -101.0, 141.6);
		shape122.curveTo(-96.6, 146.40001, -88.2, 152.8, -86.6, 152.8);
		shape122.curveTo(-85.0, 152.8, -81.799995, 156.0, -79.799995, 155.2);
		shape122.curveTo(-77.799995, 154.4, -74.99999, 152.8, -74.6, 149.59999);
		shape122.curveTo(-74.200005, 146.39998, -77.0, 143.99998, -77.0, 143.99998);
		shape122.curveTo(-80.066, 142.46999, -82.806, 138.97998, -84.385, 136.64998);
		shape122.curveTo(-84.385, 136.64998, -84.200005, 139.19998, -89.4, 138.39998);
		shape122.curveTo(-94.6, 137.59998, -99.8, 134.79997, -101.4, 131.59998);
		shape122.curveTo(-103.0, 128.39998, -105.4, 125.99998, -103.8, 129.59998);
		shape122.curveTo(-102.200005, 133.19998, -99.8, 136.79997, -98.200005, 137.19998);
		shape122.curveTo(-96.600006, 137.59999, -97.00001, 138.79999, -99.4, 138.39998);
		shape122.curveTo(-101.799995, 137.99997, -104.6, 137.59998, -109.0, 132.39998);
		shape122.closePath();
		g.setPaint(new Color(178, 101, 101, 255));
		g.fill(shape122);
	}

	private void paintCompositeGraphicsNode_0_0_0_122(Graphics2D g) {
		// _0_0_0_122_0
		AffineTransform trans_0_0_0_122_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_122_0(g);
		g.setTransform(trans_0_0_0_122_0);
	}

	private void paintShapeNode_0_0_0_123_0(Graphics2D g) {
		GeneralPath shape123 = new GeneralPath();
		shape123.moveTo(-111.6, 110.0);
		shape123.curveTo(-111.6, 110.0, -109.799995, 96.4, -108.6, 92.4);
		shape123.curveTo(-108.6, 92.4, -109.4, 85.6, -107.0, 81.4);
		shape123.curveTo(-104.6, 77.200005, -102.6, 71.0, -99.6, 65.6);
		shape123.curveTo(-96.6, 60.199997, -96.4, 56.199997, -92.4, 54.6);
		shape123.curveTo(-88.4, 53.0, -82.4, 44.399998, -79.6, 43.399998);
		shape123.curveTo(-76.799995, 42.399998, -77.0, 43.199997, -77.0, 43.199997);
		shape123.curveTo(-77.0, 43.199997, -70.2, 28.399998, -56.6, 32.399998);
		shape123.curveTo(-56.6, 32.399998, -72.8, 29.599998, -57.0, 20.199997);
		shape123.curveTo(-57.0, 20.199997, -61.8, 21.299997, -58.5, 14.299997);
		shape123.curveTo(-56.299, 9.631997, -56.8, 16.399998, -67.8, 28.199997);
		shape123.curveTo(-67.8, 28.199997, -72.8, 36.799995, -78.0, 39.799995);
		shape123.curveTo(-83.2, 42.799995, -95.2, 49.799995, -96.4, 53.599995);
		shape123.curveTo(-97.600006, 57.399994, -100.8, 63.199997, -102.8, 64.799995);
		shape123.curveTo(-104.8, 66.399994, -107.600006, 70.6, -108.0, 73.99999);
		shape123.curveTo(-108.0, 73.99999, -109.2, 77.99999, -110.6, 79.19999);
		shape123.curveTo(-112.0, 80.39999, -112.2, 83.59999, -112.2, 85.59999);
		shape123.curveTo(-112.2, 87.59999, -114.2, 90.399994, -114.0, 92.79999);
		shape123.curveTo(-114.0, 92.79999, -113.2, 111.79999, -113.6, 113.79999);
		shape123.lineTo(-111.6, 109.999985);
		shape123.closePath();
		g.setPaint(new Color(153, 38, 0, 255));
		g.fill(shape123);
	}

	private void paintCompositeGraphicsNode_0_0_0_123(Graphics2D g) {
		// _0_0_0_123_0
		AffineTransform trans_0_0_0_123_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_123_0(g);
		g.setTransform(trans_0_0_0_123_0);
	}

	private void paintShapeNode_0_0_0_124_0(Graphics2D g) {
		GeneralPath shape124 = new GeneralPath();
		shape124.moveTo(-120.2, 114.6);
		shape124.curveTo(-120.2, 114.6, -122.2, 113.2, -126.6, 119.2);
		shape124.curveTo(-126.6, 119.2, -119.299995, 152.2, -119.299995, 153.6);
		shape124.curveTo(-119.299995, 153.6, -118.2, 151.5, -119.49999, 144.3);
		shape124.curveTo(-120.79999, 137.1, -121.69999, 124.4, -121.69999, 124.4);
		shape124.lineTo(-120.19999, 114.6);
		shape124.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape124);
	}

	private void paintCompositeGraphicsNode_0_0_0_124(Graphics2D g) {
		// _0_0_0_124_0
		AffineTransform trans_0_0_0_124_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_124_0(g);
		g.setTransform(trans_0_0_0_124_0);
	}

	private void paintShapeNode_0_0_0_125_0(Graphics2D g) {
		GeneralPath shape125 = new GeneralPath();
		shape125.moveTo(-98.6, 54.0);
		shape125.curveTo(-98.6, 54.0, -116.2, 57.2, -115.8, 86.4);
		shape125.lineTo(-116.600006, 111.2);
		shape125.curveTo(-116.600006, 111.2, -117.8, 85.6, -119.00001, 84.0);
		shape125.curveTo(-120.20001, 82.4, -116.200005, 71.2, -119.40001, 77.2);
		shape125.curveTo(-119.40001, 77.2, -133.40001, 91.2, -125.40001, 112.399994);
		shape125.curveTo(-125.40001, 112.399994, -123.90001, 115.7, -126.90001, 111.09999);
		shape125.curveTo(-126.90001, 111.09999, -131.50002, 98.49999, -130.40001, 92.09999);
		shape125.curveTo(-130.40001, 92.09999, -130.20001, 89.899994, -128.3, 87.09999);
		shape125.curveTo(-128.3, 87.09999, -119.700005, 75.399994, -117.0, 73.09999);
		shape125.curveTo(-117.0, 73.09999, -115.2, 58.69999, -99.8, 53.499992);
		shape125.curveTo(-99.8, 53.499992, -94.100006, 51.199993, -98.600006, 53.999992);
		shape125.closePath();
		g.setPaint(new Color(153, 38, 0, 255));
		g.fill(shape125);
	}

	private void paintCompositeGraphicsNode_0_0_0_125(Graphics2D g) {
		// _0_0_0_125_0
		AffineTransform trans_0_0_0_125_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_125_0(g);
		g.setTransform(trans_0_0_0_125_0);
	}

	private void paintShapeNode_0_0_0_126_0(Graphics2D g) {
		GeneralPath shape126 = new GeneralPath();
		shape126.moveTo(40.8, -12.2);
		shape126.curveTo(41.46, -12.554, 41.451, -13.524, 42.031, -13.697);
		shape126.curveTo(43.179996, -14.040999, 43.343998, -15.108, 43.862, -15.891999);
		shape126.curveTo(44.735, -17.210999, 44.928, -18.744, 45.51, -20.234999);
		shape126.curveTo(45.781998, -20.935, 45.809, -21.89, 45.496, -22.55);
		shape126.curveTo(44.322, -25.030998, 43.62, -27.48, 42.177998, -29.905998);
		shape126.curveTo(41.909996, -30.355999, 41.648, -31.149998, 41.447, -31.747997);
		shape126.curveTo(40.983997, -33.131996, 39.726997, -34.122997, 38.866997, -35.442997);
		shape126.curveTo(38.579, -35.884, 39.103996, -36.809, 38.387997, -36.892998);
		shape126.curveTo(37.490997, -36.997997, 36.041996, -37.578, 35.809, -36.552);
		shape126.curveTo(35.220997, -33.964996, 36.232, -31.441998, 37.199997, -28.999998);
		shape126.curveTo(36.417995, -28.307999, 36.751995, -27.386997, 36.903996, -26.619999);
		shape126.curveTo(37.613995, -23.014, 36.415997, -19.661999, 35.654995, -16.188);
		shape126.curveTo(35.631996, -16.084, 35.973995, -15.886, 35.945995, -15.823999);
		shape126.curveTo(34.723995, -13.138, 33.271996, -10.692999, 31.452995, -8.311999);
		shape126.curveTo(30.694996, -7.319999, 29.822996, -6.4039993, 29.325994, -5.3409996);
		shape126.curveTo(28.957994, -4.5539994, 28.549995, -3.5879996, 28.799995, -2.5999997);
		shape126.curveTo(25.364996, 0.1800003, 23.114996, 4.0250006, 20.503996, 7.8710003);
		shape126.curveTo(20.041996, 8.551001, 20.332996, 9.76, 20.883995, 10.029);
		shape126.curveTo(21.696995, 10.427, 22.652996, 9.403, 23.122995, 8.557);
		shape126.curveTo(23.511995, 7.859, 23.864996, 7.209, 24.355995, 6.566);
		shape126.curveTo(24.488995, 6.391, 24.309996, 5.972, 24.444996, 5.851);
		shape126.curveTo(27.077995, 3.504, 28.746996, 0.56799984, 31.199997, -1.8000002);
		shape126.curveTo(33.149998, -2.1290002, 34.686996, -3.1270003, 36.434998, -4.1400003);
		shape126.curveTo(36.742996, -4.3190002, 37.267, -4.07, 37.557, -4.2650003);
		shape126.curveTo(39.309998, -5.4420004, 39.308, -7.4780006, 39.413998, -9.3880005);
		shape126.curveTo(39.463997, -10.272, 39.659996, -11.589001, 40.8, -12.200001);
		shape126.closePath();
		g.setPaint(new Color(0, 0, 0, 255));
		g.fill(shape126);
	}

	private void paintCompositeGraphicsNode_0_0_0_126(Graphics2D g) {
		// _0_0_0_126_0
		AffineTransform trans_0_0_0_126_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_126_0(g);
		g.setTransform(trans_0_0_0_126_0);
	}

	private void paintShapeNode_0_0_0_127_0(Graphics2D g) {
		GeneralPath shape127 = new GeneralPath();
		shape127.moveTo(31.959, -16.666);
		shape127.curveTo(32.083, -16.743, 31.928, -17.166, 32.037, -17.382);
		shape127.curveTo(32.198997, -17.706, 32.601997, -17.894, 32.764, -18.218);
		shape127.curveTo(32.873, -18.434, 32.71, -18.814001, 32.846, -18.956001);
		shape127.curveTo(35.179, -21.403002, 35.436, -24.427002, 34.4, -27.400002);
		shape127.curveTo(35.424, -28.020002, 35.485, -29.282001, 35.06, -30.129002);
		shape127.curveTo(34.207, -31.829002, 34.014, -33.755, 33.039, -35.298);
		shape127.curveTo(32.237003, -36.567, 30.659, -37.811, 29.288002, -36.508);
		shape127.curveTo(28.867002, -36.107998, 28.546001, -35.321, 28.824001, -34.609);
		shape127.curveTo(28.888, -34.446003, 29.173002, -34.300003, 29.146002, -34.218002);
		shape127.curveTo(29.039001, -33.894, 28.493002, -33.670002, 28.487001, -33.398003);
		shape127.curveTo(28.457, -31.902002, 27.503002, -30.391003, 28.133001, -29.062002);
		shape127.curveTo(28.905, -27.433002, 29.724, -25.576002, 30.400002, -23.800003);
		shape127.curveTo(29.166002, -21.684004, 30.199001, -19.235003, 28.446001, -17.358004);
		shape127.curveTo(28.310001, -17.212004, 28.319, -16.826004, 28.441002, -16.624004);
		shape127.curveTo(28.733002, -16.138004, 29.139002, -15.732004, 29.625002, -15.440004);
		shape127.curveTo(29.827002, -15.319004, 30.175001, -15.317004, 30.375002, -15.441005);
		shape127.curveTo(30.953001, -15.803005, 31.351002, -16.290005, 31.959002, -16.666004);
		shape127.closePath();
		g.fill(shape127);
	}

	private void paintCompositeGraphicsNode_0_0_0_127(Graphics2D g) {
		// _0_0_0_127_0
		AffineTransform trans_0_0_0_127_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_127_0(g);
		g.setTransform(trans_0_0_0_127_0);
	}

	private void paintShapeNode_0_0_0_128_0(Graphics2D g) {
		GeneralPath shape128 = new GeneralPath();
		shape128.moveTo(94.771, -26.977);
		shape128.curveTo(96.16, -25.185, 96.450005, -22.39, 94.401, -21.0);
		shape128.curveTo(94.951004, -17.691, 98.302, -19.67, 100.4, -20.2);
		shape128.curveTo(100.29, -20.588001, 100.520004, -20.932001, 100.8, -20.937);
		shape128.curveTo(101.86, -20.952, 102.54, -21.984001, 103.600006, -21.800001);
		shape128.curveTo(104.04001, -23.357, 105.670006, -24.059002, 106.32001, -25.439001);
		shape128.curveTo(108.04001, -29.134, 107.450005, -33.407, 104.87001, -36.653);
		shape128.curveTo(104.67001, -36.907, 104.88001, -37.424, 104.76001, -37.786);
		shape128.curveTo(104.00001, -39.996998, 101.94001, -40.312, 100.00001, -41.0);
		shape128.curveTo(98.824005, -44.875, 98.16301, -48.906, 96.40101, -52.6);
		shape128.curveTo(94.78701, -52.85, 94.08901, -54.588997, 92.75201, -55.309);
		shape128.curveTo(91.41901, -56.028, 90.851006, -54.448997, 90.892006, -53.403);
		shape128.curveTo(90.89901, -53.197998, 91.351006, -52.974, 91.18101, -52.609);
		shape128.curveTo(91.10501, -52.445, 90.84501, -52.334, 90.84501, -52.2);
		shape128.curveTo(90.84601, -52.065002, 91.06701, -51.934002, 91.20101, -51.8);
		shape128.curveTo(90.28301, -50.98, 88.86001, -50.503, 88.56501, -49.357998);
		shape128.curveTo(87.61101, -45.648, 90.18401, -42.523, 91.85201, -39.322);
		shape128.curveTo(92.443016, -38.187, 91.707016, -36.916, 90.947014, -35.708);
		shape128.curveTo(90.50901, -35.013, 90.61701, -33.886, 90.89301, -33.03);
		shape128.curveTo(91.64501, -30.699, 93.236015, -28.96, 94.77101, -26.977);
		shape128.closePath();
		g.fill(shape128);
	}

	private void paintCompositeGraphicsNode_0_0_0_128(Graphics2D g) {
		// _0_0_0_128_0
		AffineTransform trans_0_0_0_128_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_128_0(g);
		g.setTransform(trans_0_0_0_128_0);
	}

	private void paintShapeNode_0_0_0_129_0(Graphics2D g) {
		GeneralPath shape129 = new GeneralPath();
		shape129.moveTo(57.611, -8.591);
		shape129.curveTo(56.124, -6.74, 52.711998, -4.1709995, 55.629, -2.2429996);
		shape129.curveTo(55.823, -2.1139996, 56.193, -2.1099997, 56.366, -2.2439995);
		shape129.curveTo(58.387, -3.8089995, 60.39, -4.7119994, 62.826, -5.2939997);
		shape129.curveTo(62.95, -5.3229995, 63.224, -4.8559995, 63.593, -5.0169997);
		shape129.curveTo(65.206, -5.72, 67.215996, -5.6619997, 68.4, -7.0);
		shape129.curveTo(72.167, -6.776, 75.732, -7.892, 79.123, -9.2);
		shape129.curveTo(80.284004, -9.648, 81.554, -10.207, 82.755005, -10.709);
		shape129.curveTo(84.131004, -11.285, 85.33501, -12.212999, 86.44701, -13.354);
		shape129.curveTo(86.58001, -13.49, 86.934006, -13.4, 87.201004, -13.4);
		shape129.curveTo(87.161, -14.263, 88.123, -14.389999, 88.37, -15.011999);
		shape129.curveTo(88.462006, -15.2439995, 88.312004, -15.639999, 88.445, -15.741999);
		shape129.curveTo(90.583, -17.371998, 91.503, -19.39, 90.334, -21.766998);
		shape129.curveTo(90.048996, -22.344997, 89.8, -22.962997, 89.234, -23.439);
		shape129.curveTo(88.149, -24.349998, 87.047005, -23.495998, 86.0, -23.8);
		shape129.curveTo(85.841, -23.171999, 85.112, -23.344, 84.726, -23.146);
		shape129.curveTo(83.867, -22.707, 82.534, -23.292, 81.674995, -22.854);
		shape129.curveTo(80.312996, -22.159, 79.072, -21.99, 77.649994, -21.613);
		shape129.curveTo(77.338, -21.531, 76.56, -21.627, 76.399994, -21.0);
		shape129.curveTo(76.26599, -21.134, 76.118, -21.368, 76.01199, -21.346);
		shape129.curveTo(74.104, -20.95, 72.843994, -20.736, 71.54299, -19.044);
		shape129.curveTo(71.439995, -18.911001, 70.99799, -19.09, 70.83899, -18.955);
		shape129.curveTo(69.88199, -18.147, 69.47699, -16.913, 68.37599, -16.241);
		shape129.curveTo(68.174995, -16.118, 67.82299, -16.286, 67.62899, -16.157);
		shape129.curveTo(66.98299, -15.726, 66.61599, -15.084999, 65.97399, -14.638);
		shape129.curveTo(65.64499, -14.408999, 65.244995, -14.733999, 65.27699, -14.99);
		shape129.curveTo(65.521996, -16.937, 66.174995, -18.723999, 65.59999, -20.6);
		shape129.curveTo(67.676994, -23.12, 70.19399, -25.069, 71.99999, -27.8);
		shape129.curveTo(72.01499, -29.966, 72.70699, -32.112, 72.593994, -34.189);
		shape129.curveTo(72.58399, -34.382, 72.296, -35.114998, 72.16999, -35.461998);
		shape129.curveTo(71.857994, -36.315998, 72.76399, -37.381996, 71.91999, -38.106);
		shape129.curveTo(70.51599, -39.309, 69.22399, -38.433, 68.399994, -37.0);
		shape129.curveTo(66.562, -36.61, 64.495995, -35.917, 62.917995, -37.151);
		shape129.curveTo(61.910995, -37.938, 61.332996, -38.844, 60.533997, -39.9);
		shape129.curveTo(59.548996, -41.202003, 59.883995, -42.638, 59.953995, -44.202003);
		shape129.curveTo(59.959995, -44.33, 59.644997, -44.466003, 59.644997, -44.600002);
		shape129.curveTo(59.645996, -44.735, 59.865997, -44.866, 59.999996, -45.000004);
		shape129.curveTo(59.293995, -45.626003, 59.018997, -46.684006, 57.999996, -47.000004);
		shape129.curveTo(58.304996, -48.092003, 57.628998, -48.976006, 56.757996, -49.278004);
		shape129.curveTo(54.762997, -49.969, 53.085995, -48.057003, 51.193996, -47.984005);
		shape129.curveTo(50.679996, -47.965004, 50.212997, -49.003006, 49.563995, -49.328007);
		shape129.curveTo(49.131996, -49.544006, 48.427994, -49.577007, 48.065994, -49.31101);
		shape129.curveTo(47.377995, -48.807007, 46.788994, -48.69301, 46.030994, -48.488007);
		shape129.curveTo(44.413994, -48.052006, 43.135994, -46.958008, 41.655994, -46.10301);
		shape129.curveTo(40.170994, -45.24601, 39.215996, -43.80901, 38.135994, -42.48901);
		shape129.curveTo(37.194992, -41.33701, 37.058994, -38.92301, 38.478992, -38.42301);
		shape129.curveTo(40.32199, -37.77301, 41.62599, -40.476013, 43.59199, -40.150013);
		shape129.curveTo(43.90399, -40.099014, 44.109993, -39.788013, 43.999992, -39.400013);
		shape129.curveTo(44.388992, -39.29101, 44.60699, -39.52001, 44.79999, -39.800014);
		shape129.curveTo(45.657993, -38.781013, 46.82199, -38.444016, 47.75999, -37.571014);
		shape129.curveTo(48.729992, -36.667015, 50.47599, -37.085014, 51.49099, -36.088013);
		shape129.curveTo(53.01999, -34.586014, 52.46099, -31.905012, 54.39999, -30.600014);
		shape129.curveTo(53.81399, -29.287014, 53.20699, -28.010014, 52.87199, -26.583014);
		shape129.curveTo(52.58999, -25.377014, 53.583992, -24.180014, 54.79499, -24.271013);
		shape129.curveTo(56.05299, -24.365013, 56.31499, -25.124014, 56.79999, -26.200014);
		shape129.curveTo(57.06699, -25.933014, 57.53599, -25.636015, 57.49499, -25.420013);
		shape129.curveTo(57.03799, -23.033012, 56.01099, -21.040012, 55.55299, -18.609013);
		shape129.curveTo(55.49399, -18.292013, 55.18899, -18.090014, 54.79999, -18.200012);
		shape129.curveTo(54.331993, -14.051012, 50.27999, -11.657012, 47.734993, -8.492012);
		shape129.curveTo(47.331993, -7.990012, 47.32799, -6.741012, 47.73699, -6.3380117);
		shape129.curveTo(49.13999, -4.9510117, 51.09999, -6.4970117, 52.79999, -7.000012);
		shape129.curveTo(53.012993, -8.206012, 53.87199, -9.148012, 55.20399, -9.092012);
		shape129.curveTo(55.45999, -9.082012, 55.694992, -9.624012, 56.01899, -9.754012);
		shape129.curveTo(56.36699, -9.892012, 56.868988, -9.668012, 57.15499, -9.866013);
		shape129.curveTo(58.88399, -11.061012, 60.291992, -12.167013, 62.02999, -13.356012);
		shape129.curveTo(62.221992, -13.487012, 62.56599, -13.328012, 62.78199, -13.436012);
		shape129.curveTo(63.10699, -13.598012, 63.29399, -13.985012, 63.61699, -14.170012);
		shape129.curveTo(63.96499, -14.370012, 64.206985, -14.080012, 64.39999, -13.800013);
		shape129.curveTo(63.753986, -13.451013, 63.749985, -12.494013, 63.167988, -12.292012);
		shape129.curveTo(62.392986, -12.024013, 61.83199, -11.511012, 61.15799, -11.064013);
		shape129.curveTo(60.86599, -10.871013, 60.20699, -11.119013, 60.10299, -10.940013);
		shape129.curveTo(59.50499, -9.912013, 58.320988, -9.474013, 57.61099, -8.591013);
		shape129.closePath();
		g.fill(shape129);
	}

	private void paintCompositeGraphicsNode_0_0_0_129(Graphics2D g) {
		// _0_0_0_129_0
		AffineTransform trans_0_0_0_129_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_129_0(g);
		g.setTransform(trans_0_0_0_129_0);
	}

	private void paintShapeNode_0_0_0_130_0(Graphics2D g) {
		GeneralPath shape130 = new GeneralPath();
		shape130.moveTo(2.2, -58.0);
		shape130.curveTo(2.2, -58.0, -7.038, -60.872, -18.199999, -35.2);
		shape130.curveTo(-18.199999, -35.2, -20.599998, -30.0, -23.0, -28.0);
		shape130.curveTo(-25.400002, -26.0, -36.6, -22.4, -38.6, -18.4);
		shape130.lineTo(-49.0, -2.3999996);
		shape130.curveTo(-49.0, -2.3999996, -34.2, -18.4, -31.0, -20.8);
		shape130.curveTo(-31.0, -20.8, -23.0, -29.199999, -26.2, -22.4);
		shape130.curveTo(-26.2, -22.4, -40.2, -11.599999, -39.0, -2.3999996);
		shape130.curveTo(-39.0, -2.3999996, -44.6, 12.0, -45.4, 14.0);
		shape130.curveTo(-45.4, 14.0, -29.400002, -18.0, -27.000002, -19.2);
		shape130.curveTo(-24.600002, -20.400002, -23.400002, -20.400002, -24.600002, -16.800001);
		shape130.curveTo(-25.800003, -13.200001, -26.200003, 3.1999989, -29.000002, 5.199999);
		shape130.curveTo(-29.000002, 5.199999, -21.000002, -15.200001, -21.800003, -18.400002);
		shape130.curveTo(-21.800003, -18.400002, -18.600002, -22.000002, -16.200003, -16.800001);
		shape130.lineTo(-17.400003, -0.80000114);
		shape130.lineTo(-13.000004, 11.199999);
		shape130.curveTo(-13.000004, 11.199999, -15.400003, -9.536743E-7, -13.800004, -15.6);
		shape130.curveTo(-13.800004, -15.6, -15.800004, -26.0, -11.800004, -20.400002);
		shape130.curveTo(-7.800004, -14.800003, 1.7999964, -8.800001, 1.7999964, -4.000002);
		shape130.curveTo(1.7999964, -4.000002, -3.4000034, -21.600002, -12.600003, -26.400002);
		shape130.lineTo(-16.600002, -20.400002);
		shape130.lineTo(-17.800003, -22.400002);
		shape130.curveTo(-17.800003, -22.400002, -21.400003, -23.2, -17.000004, -30.000002);
		shape130.curveTo(-12.600004, -36.800003, -13.000004, -37.600002, -13.000004, -37.600002);
		shape130.curveTo(-13.000004, -37.600002, -6.6000037, -30.400002, -5.000004, -30.400002);
		shape130.curveTo(-5.000004, -30.400002, 8.199996, -38.0, 9.399996, -13.600002);
		shape130.curveTo(9.399996, -13.600002, 16.199997, -28.000002, 6.9999957, -34.800003);
		shape130.curveTo(6.9999957, -34.800003, -7.8000045, -36.800003, -6.6000047, -42.000004);
		shape130.lineTo(0.59999514, -54.4);
		shape130.curveTo(4.199995, -59.600002, 2.5999951, -56.800003, 2.5999951, -56.800003);
		shape130.closePath();
		g.fill(shape130);
	}

	private void paintCompositeGraphicsNode_0_0_0_130(Graphics2D g) {
		// _0_0_0_130_0
		AffineTransform trans_0_0_0_130_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_130_0(g);
		g.setTransform(trans_0_0_0_130_0);
	}

	private void paintShapeNode_0_0_0_131_0(Graphics2D g) {
		GeneralPath shape131 = new GeneralPath();
		shape131.moveTo(-17.8, -41.6);
		shape131.lineTo(-33.8, -36.399998);
		shape131.lineTo(-41.0, -26.799997);
		shape131.curveTo(-41.0, -26.799997, -23.8, -36.799995, -19.8, -37.999996);
		shape131.curveTo(-15.799999, -39.199997, -17.8, -41.599995, -17.8, -41.599995);
		shape131.closePath();
		g.fill(shape131);
	}

	private void paintCompositeGraphicsNode_0_0_0_131(Graphics2D g) {
		// _0_0_0_131_0
		AffineTransform trans_0_0_0_131_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_131_0(g);
		g.setTransform(trans_0_0_0_131_0);
	}

	private void paintShapeNode_0_0_0_132_0(Graphics2D g) {
		GeneralPath shape132 = new GeneralPath();
		shape132.moveTo(-57.8, -35.2);
		shape132.curveTo(-57.8, -35.2, -59.8, -34.0, -60.2, -31.2);
		shape132.curveTo(-60.600002, -28.400002, -63.0, -28.0, -62.2, -25.2);
		shape132.curveTo(-61.4, -22.400002, -59.4, -20.0, -59.4, -24.0);
		shape132.curveTo(-59.4, -28.0, -57.800003, -30.0, -57.0, -31.2);
		shape132.curveTo(-56.199997, -32.4, -54.6, -36.8, -57.8, -35.2);
		shape132.closePath();
		g.fill(shape132);
	}

	private void paintCompositeGraphicsNode_0_0_0_132(Graphics2D g) {
		// _0_0_0_132_0
		AffineTransform trans_0_0_0_132_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_132_0(g);
		g.setTransform(trans_0_0_0_132_0);
	}

	private void paintShapeNode_0_0_0_133_0(Graphics2D g) {
		GeneralPath shape133 = new GeneralPath();
		shape133.moveTo(-66.6, 26.0);
		shape133.curveTo(-66.6, 26.0, -75.0, 22.0, -78.2, 18.4);
		shape133.curveTo(-81.399994, 14.799999, -80.948, 19.966, -85.799995, 19.6);
		shape133.curveTo(-91.646996, 19.159, -90.6, 3.2000008, -90.6, 3.2000008);
		shape133.lineTo(-94.6, 10.800001);
		shape133.curveTo(-94.6, 10.800001, -95.799995, 25.2, -87.799995, 22.800001);
		shape133.curveTo(-83.893, 21.628, -82.6, 23.2, -84.2, 24.000002);
		shape133.curveTo(-85.799995, 24.800003, -78.6, 25.200003, -81.399994, 26.800001);
		shape133.curveTo(-84.19999, 28.4, -69.799995, 23.2, -72.2, 33.600002);
		shape133.lineTo(-66.6, 26.000002);
		shape133.closePath();
		g.fill(shape133);
	}

	private void paintCompositeGraphicsNode_0_0_0_133(Graphics2D g) {
		// _0_0_0_133_0
		AffineTransform trans_0_0_0_133_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_133_0(g);
		g.setTransform(trans_0_0_0_133_0);
	}

	private void paintShapeNode_0_0_0_134_0(Graphics2D g) {
		GeneralPath shape134 = new GeneralPath();
		shape134.moveTo(-79.2, 40.4);
		shape134.curveTo(-79.2, 40.4, -94.6, 44.800003, -98.2, 35.2);
		shape134.curveTo(-98.2, 35.2, -103.0, 37.600002, -100.799995, 40.600002);
		shape134.curveTo(-98.59999, 43.600002, -97.399994, 44.000004, -97.399994, 44.000004);
		shape134.curveTo(-97.399994, 44.000004, -91.99999, 45.200005, -92.59999, 46.000004);
		shape134.curveTo(-93.19999, 46.800003, -95.59999, 50.200005, -95.59999, 50.200005);
		shape134.curveTo(-95.59999, 50.200005, -85.399994, 44.200005, -79.19999, 40.400005);
		shape134.closePath();
		g.fill(shape134);
	}

	private void paintCompositeGraphicsNode_0_0_0_134(Graphics2D g) {
		// _0_0_0_134_0
		AffineTransform trans_0_0_0_134_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_134_0(g);
		g.setTransform(trans_0_0_0_134_0);
	}

	private void paintShapeNode_0_0_0_135_0(Graphics2D g) {
		GeneralPath shape135 = new GeneralPath();
		shape135.moveTo(149.2, 118.6);
		shape135.curveTo(148.77, 120.74, 147.09999, 121.54, 145.2, 122.2);
		shape135.curveTo(143.28, 121.24, 140.69, 118.14, 138.8, 120.2);
		shape135.curveTo(138.33, 119.71999, 137.55, 119.659996, 137.2, 119.0);
		shape135.curveTo(136.73999, 118.1, 137.01, 117.06, 136.67, 116.26);
		shape135.curveTo(136.12, 114.98, 135.42, 113.62, 135.59999, 112.200005);
		shape135.curveTo(137.40999, 111.490005, 137.99998, 109.58, 137.52998, 107.82001);
		shape135.curveTo(137.45998, 107.560005, 137.02998, 107.37001, 137.22998, 107.020004);
		shape135.curveTo(137.41998, 106.69, 137.72998, 106.47, 137.99998, 106.200005);
		shape135.curveTo(137.86998, 106.340004, 137.71999, 106.57001, 137.60999, 106.55);
		shape135.curveTo(136.99998, 106.44, 137.11998, 105.8, 137.24998, 105.420006);
		shape135.curveTo(137.83998, 103.670006, 139.84999, 103.41, 141.19998, 104.600006);
		shape135.curveTo(141.45998, 104.04001, 141.96999, 104.23, 142.39998, 104.200005);
		shape135.curveTo(142.34998, 103.62, 142.75998, 103.090004, 142.95998, 102.670006);
		shape135.curveTo(143.47998, 101.58001, 145.09998, 102.68001, 145.89998, 102.07001);
		shape135.curveTo(146.97998, 101.240005, 148.03998, 100.55001, 149.11998, 101.15001);
		shape135.curveTo(150.92998, 102.16001, 152.63998, 103.37001, 153.83998, 105.12001);
		shape135.curveTo(154.40999, 105.95001, 154.64998, 107.23001, 154.58998, 108.19001);
		shape135.curveTo(154.54999, 108.84001, 153.16998, 108.48001, 152.82999, 109.41001);
		shape135.curveTo(152.18, 111.16001, 154.01999, 111.68001, 154.76999, 113.02001);
		shape135.curveTo(154.96999, 113.37001, 154.70999, 113.67001, 154.38998, 113.77001);
		shape135.curveTo(153.97998, 113.90001, 153.19998, 113.710014, 153.32999, 114.16001);
		shape135.curveTo(154.30998, 117.35001, 151.54999, 118.030014, 149.19998, 118.60001);
		shape135.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape135);
	}

	private void paintCompositeGraphicsNode_0_0_0_135(Graphics2D g) {
		// _0_0_0_135_0
		AffineTransform trans_0_0_0_135_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_135_0(g);
		g.setTransform(trans_0_0_0_135_0);
	}

	private void paintShapeNode_0_0_0_136_0(Graphics2D g) {
		GeneralPath shape136 = new GeneralPath();
		shape136.moveTo(139.6, 138.2);
		shape136.curveTo(139.59001, 136.45999, 137.99, 134.70999, 139.20001, 133.0);
		shape136.curveTo(139.34001, 133.14, 139.47002, 133.36, 139.6, 133.36);
		shape136.curveTo(139.74, 133.36, 139.87001, 133.14, 140.0, 133.0);
		shape136.curveTo(141.5, 135.22, 145.15, 136.14, 145.01, 138.99);
		shape136.curveTo(144.98, 139.44, 143.9, 140.36, 144.79999, 141.0);
		shape136.curveTo(142.98999, 142.35, 142.93, 144.72, 141.99998, 146.6);
		shape136.curveTo(140.75998, 146.32, 139.54999, 145.95001, 138.39998, 145.40001);
		shape136.curveTo(138.74998, 143.92001, 138.63998, 142.23001, 139.45998, 140.91);
		shape136.curveTo(139.88997, 140.21, 139.59998, 139.13, 139.59998, 138.2);
		shape136.closePath();
		g.fill(shape136);
	}

	private void paintCompositeGraphicsNode_0_0_0_136(Graphics2D g) {
		// _0_0_0_136_0
		AffineTransform trans_0_0_0_136_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_136_0(g);
		g.setTransform(trans_0_0_0_136_0);
	}

	private void paintShapeNode_0_0_0_137_0(Graphics2D g) {
		GeneralPath shape137 = new GeneralPath();
		shape137.moveTo(-26.6, 129.2);
		shape137.curveTo(-26.6, 129.2, -43.458, 139.34, -29.4, 124.0);
		shape137.curveTo(-20.599998, 114.4, -10.6, 108.8, -10.6, 108.8);
		shape137.curveTo(-10.6, 108.8, -0.20000076, 104.4, 3.3999996, 103.200005);
		shape137.curveTo(7.0, 102.00001, 22.199999, 96.8, 25.4, 96.4);
		shape137.curveTo(28.6, 96.0, 38.2, 92.0, 45.0, 96.0);
		shape137.curveTo(51.8, 100.0, 59.8, 104.4, 59.8, 104.4);
		shape137.curveTo(59.8, 104.4, 43.4, 96.0, 39.8, 98.4);
		shape137.curveTo(36.199997, 100.8, 29.0, 100.4, 23.0, 103.6);
		shape137.curveTo(23.0, 103.6, 8.2, 108.0, 5.0, 110.0);
		shape137.curveTo(1.8000002, 112.0, -8.6, 123.6, -10.2, 122.8);
		shape137.curveTo(-11.799999, 122.00001, -9.8, 121.600006, -8.599999, 118.8);
		shape137.curveTo(-7.3999987, 116.0, -9.4, 114.4, -17.4, 120.8);
		shape137.curveTo(-25.4, 127.200005, -26.599998, 129.2, -26.599998, 129.2);
		shape137.closePath();
		g.setPaint(new Color(204, 204, 204, 255));
		g.fill(shape137);
	}

	private void paintCompositeGraphicsNode_0_0_0_137(Graphics2D g) {
		// _0_0_0_137_0
		AffineTransform trans_0_0_0_137_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_137_0(g);
		g.setTransform(trans_0_0_0_137_0);
	}

	private void paintShapeNode_0_0_0_138_0(Graphics2D g) {
		GeneralPath shape138 = new GeneralPath();
		shape138.moveTo(-19.195, 123.23);
		shape138.curveTo(-19.195, 123.23, -17.785, 110.19, -9.307, 111.86);
		shape138.curveTo(-9.307, 111.86, -1.0810003, 107.69, 1.6409998, 105.72);
		shape138.curveTo(1.6409998, 105.72, 9.78, 104.020004, 11.09, 103.4);
		shape138.curveTo(29.569, 94.702, 44.288002, 99.221, 44.835, 98.101);
		shape138.curveTo(45.381, 96.981995, 65.006, 104.1, 68.615, 108.18);
		shape138.curveTo(69.006, 108.63, 58.384, 102.59, 48.685997, 100.7);
		shape138.curveTo(40.413, 99.083, 18.810997, 100.939995, 7.904999, 106.479996);
		shape138.curveTo(4.9319987, 107.99, -4.0130014, 113.77, -6.5440016, 113.659996);
		shape138.curveTo(-9.075002, 113.549995, -19.195002, 123.229996, -19.195002, 123.229996);
		shape138.closePath();
		g.setPaint(new Color(0, 0, 0, 255));
		g.fill(shape138);
	}

	private void paintCompositeGraphicsNode_0_0_0_138(Graphics2D g) {
		// _0_0_0_138_0
		AffineTransform trans_0_0_0_138_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_138_0(g);
		g.setTransform(trans_0_0_0_138_0);
	}

	private void paintShapeNode_0_0_0_139_0(Graphics2D g) {
		GeneralPath shape139 = new GeneralPath();
		shape139.moveTo(-23.0, 148.8);
		shape139.curveTo(-23.0, 148.8, -38.2, 146.40001, -21.4, 144.8);
		shape139.curveTo(-21.4, 144.8, -3.3999996, 142.8, 0.6000004, 137.6);
		shape139.curveTo(0.6000004, 137.6, 14.200001, 128.40001, 17.0, 128.0);
		shape139.curveTo(19.8, 127.59999, 49.8, 120.4, 50.2, 118.0);
		shape139.curveTo(50.600002, 115.6, 56.2, 115.6, 57.8, 116.4);
		shape139.curveTo(59.399998, 117.200005, 58.6, 118.4, 55.8, 119.200005);
		shape139.curveTo(53.0, 120.00001, 21.8, 136.40001, 15.399998, 137.6);
		shape139.curveTo(8.999996, 138.8, -2.6000023, 146.40001, -7.4000015, 147.6);
		shape139.curveTo(-12.200001, 148.8, -23.000002, 148.8, -23.000002, 148.8);
		shape139.closePath();
		g.setPaint(new Color(204, 204, 204, 255));
		g.fill(shape139);
	}

	private void paintCompositeGraphicsNode_0_0_0_139(Graphics2D g) {
		// _0_0_0_139_0
		AffineTransform trans_0_0_0_139_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_139_0(g);
		g.setTransform(trans_0_0_0_139_0);
	}

	private void paintShapeNode_0_0_0_140_0(Graphics2D g) {
		GeneralPath shape140 = new GeneralPath();
		shape140.moveTo(-3.48, 141.4);
		shape140.curveTo(-3.48, 141.4, -12.062, 140.56999, -3.461, 139.76);
		shape140.curveTo(-3.461, 139.76, 5.355, 136.33, 7.4030004, 133.67);
		shape140.curveTo(7.4030004, 133.67, 14.367001, 128.95999, 15.800001, 128.75);
		shape140.curveTo(17.234001, 128.55, 31.194, 124.86, 31.399002, 123.63);
		shape140.curveTo(31.604004, 122.399994, 65.67, 109.82, 70.090004, 113.009995);
		shape140.curveTo(73.00101, 115.10999, 63.100006, 113.439995, 53.466003, 117.84999);
		shape140.curveTo(52.111004, 118.46999, 18.258003, 133.04999, 14.981003, 133.66998);
		shape140.curveTo(11.704002, 134.27998, 5.765003, 138.16998, 3.307003, 138.78998);
		shape140.curveTo(0.850003, 139.39998, -3.4799972, 141.39998, -3.4799972, 141.39998);
		shape140.closePath();
		g.setPaint(new Color(0, 0, 0, 255));
		g.fill(shape140);
	}

	private void paintCompositeGraphicsNode_0_0_0_140(Graphics2D g) {
		// _0_0_0_140_0
		AffineTransform trans_0_0_0_140_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_140_0(g);
		g.setTransform(trans_0_0_0_140_0);
	}

	private void paintShapeNode_0_0_0_141_0(Graphics2D g) {
		GeneralPath shape141 = new GeneralPath();
		shape141.moveTo(-11.4, 143.6);
		shape141.curveTo(-11.4, 143.6, -6.2, 143.20001, -7.3999996, 144.8);
		shape141.curveTo(-8.599999, 146.4, -11.0, 145.6, -11.0, 145.6);
		shape141.lineTo(-11.4, 143.6);
		shape141.closePath();
		g.fill(shape141);
	}

	private void paintCompositeGraphicsNode_0_0_0_141(Graphics2D g) {
		// _0_0_0_141_0
		AffineTransform trans_0_0_0_141_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_141_0(g);
		g.setTransform(trans_0_0_0_141_0);
	}

	private void paintShapeNode_0_0_0_142_0(Graphics2D g) {
		GeneralPath shape142 = new GeneralPath();
		shape142.moveTo(-18.6, 145.2);
		shape142.curveTo(-18.6, 145.2, -13.400001, 144.8, -14.6, 146.4);
		shape142.curveTo(-15.8, 147.99998, -18.2, 147.2, -18.2, 147.2);
		shape142.lineTo(-18.6, 145.2);
		shape142.closePath();
		g.fill(shape142);
	}

	private void paintCompositeGraphicsNode_0_0_0_142(Graphics2D g) {
		// _0_0_0_142_0
		AffineTransform trans_0_0_0_142_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_142_0(g);
		g.setTransform(trans_0_0_0_142_0);
	}

	private void paintShapeNode_0_0_0_143_0(Graphics2D g) {
		GeneralPath shape143 = new GeneralPath();
		shape143.moveTo(-29.0, 146.8);
		shape143.curveTo(-29.0, 146.8, -23.8, 146.40001, -25.0, 148.0);
		shape143.curveTo(-26.2, 149.59999, -28.6, 148.8, -28.6, 148.8);
		shape143.lineTo(-29.0, 146.8);
		shape143.closePath();
		g.fill(shape143);
	}

	private void paintCompositeGraphicsNode_0_0_0_143(Graphics2D g) {
		// _0_0_0_143_0
		AffineTransform trans_0_0_0_143_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_143_0(g);
		g.setTransform(trans_0_0_0_143_0);
	}

	private void paintShapeNode_0_0_0_144_0(Graphics2D g) {
		GeneralPath shape144 = new GeneralPath();
		shape144.moveTo(-36.6, 147.6);
		shape144.curveTo(-36.6, 147.6, -31.399998, 147.20001, -32.6, 148.8);
		shape144.curveTo(-33.8, 150.4, -36.199997, 149.6, -36.199997, 149.6);
		shape144.lineTo(-36.6, 147.6);
		shape144.closePath();
		g.fill(shape144);
	}

	private void paintCompositeGraphicsNode_0_0_0_144(Graphics2D g) {
		// _0_0_0_144_0
		AffineTransform trans_0_0_0_144_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_144_0(g);
		g.setTransform(trans_0_0_0_144_0);
	}

	private void paintShapeNode_0_0_0_145_0(Graphics2D g) {
		GeneralPath shape145 = new GeneralPath();
		shape145.moveTo(1.8, 108.0);
		shape145.lineTo(5.0, 109.6);
		shape145.curveTo(3.8, 111.2, 0.5999999, 110.799995, 0.5999999, 110.799995);
		shape145.lineTo(1.8, 107.99999);
		shape145.closePath();
		g.fill(shape145);
	}

	private void paintCompositeGraphicsNode_0_0_0_145(Graphics2D g) {
		// _0_0_0_145_0
		AffineTransform trans_0_0_0_145_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_145_0(g);
		g.setTransform(trans_0_0_0_145_0);
	}

	private void paintShapeNode_0_0_0_146_0(Graphics2D g) {
		GeneralPath shape146 = new GeneralPath();
		shape146.moveTo(-8.2, 113.6);
		shape146.curveTo(-8.2, 113.6, -1.6939998, 111.46, -4.2, 114.799995);
		shape146.curveTo(-5.3999996, 116.399994, -7.7999997, 115.6, -7.7999997, 115.6);
		shape146.lineTo(-8.2, 113.6);
		shape146.closePath();
		g.fill(shape146);
	}

	private void paintCompositeGraphicsNode_0_0_0_146(Graphics2D g) {
		// _0_0_0_146_0
		AffineTransform trans_0_0_0_146_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_146_0(g);
		g.setTransform(trans_0_0_0_146_0);
	}

	private void paintShapeNode_0_0_0_147_0(Graphics2D g) {
		GeneralPath shape147 = new GeneralPath();
		shape147.moveTo(-19.4, 118.4);
		shape147.curveTo(-19.4, 118.4, -14.2, 118.0, -15.4, 119.6);
		shape147.curveTo(-16.599998, 121.2, -19.0, 120.4, -19.0, 120.4);
		shape147.lineTo(-19.4, 118.4);
		shape147.closePath();
		g.fill(shape147);
	}

	private void paintCompositeGraphicsNode_0_0_0_147(Graphics2D g) {
		// _0_0_0_147_0
		AffineTransform trans_0_0_0_147_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_147_0(g);
		g.setTransform(trans_0_0_0_147_0);
	}

	private void paintShapeNode_0_0_0_148_0(Graphics2D g) {
		GeneralPath shape148 = new GeneralPath();
		shape148.moveTo(-27.0, 124.4);
		shape148.curveTo(-27.0, 124.4, -21.8, 124.0, -23.0, 125.6);
		shape148.curveTo(-24.2, 127.2, -26.6, 126.4, -26.6, 126.4);
		shape148.lineTo(-27.0, 124.4);
		shape148.closePath();
		g.fill(shape148);
	}

	private void paintCompositeGraphicsNode_0_0_0_148(Graphics2D g) {
		// _0_0_0_148_0
		AffineTransform trans_0_0_0_148_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_148_0(g);
		g.setTransform(trans_0_0_0_148_0);
	}

	private void paintShapeNode_0_0_0_149_0(Graphics2D g) {
		GeneralPath shape149 = new GeneralPath();
		shape149.moveTo(-33.8, 129.2);
		shape149.curveTo(-33.8, 129.2, -28.599998, 128.8, -29.8, 130.4);
		shape149.curveTo(-31.0, 131.99998, -33.399998, 131.2, -33.399998, 131.2);
		shape149.lineTo(-33.8, 129.2);
		shape149.closePath();
		g.fill(shape149);
	}

	private void paintCompositeGraphicsNode_0_0_0_149(Graphics2D g) {
		// _0_0_0_149_0
		AffineTransform trans_0_0_0_149_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_149_0(g);
		g.setTransform(trans_0_0_0_149_0);
	}

	private void paintShapeNode_0_0_0_150_0(Graphics2D g) {
		GeneralPath shape150 = new GeneralPath();
		shape150.moveTo(5.282, 135.6);
		shape150.curveTo(5.282, 135.6, 12.203, 135.07, 10.606, 137.20001);
		shape150.curveTo(9.009, 139.32, 5.814, 138.26001, 5.814, 138.26001);
		shape150.lineTo(5.282, 135.6);
		shape150.closePath();
		g.fill(shape150);
	}

	private void paintCompositeGraphicsNode_0_0_0_150(Graphics2D g) {
		// _0_0_0_150_0
		AffineTransform trans_0_0_0_150_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_150_0(g);
		g.setTransform(trans_0_0_0_150_0);
	}

	private void paintShapeNode_0_0_0_151_0(Graphics2D g) {
		GeneralPath shape151 = new GeneralPath();
		shape151.moveTo(15.682, 130.8);
		shape151.curveTo(15.682, 130.8, 22.603, 130.27, 21.006, 132.40001);
		shape151.curveTo(19.409, 134.52, 16.214, 133.46, 16.214, 133.46);
		shape151.lineTo(15.682001, 130.8);
		shape151.closePath();
		g.fill(shape151);
	}

	private void paintCompositeGraphicsNode_0_0_0_151(Graphics2D g) {
		// _0_0_0_151_0
		AffineTransform trans_0_0_0_151_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_151_0(g);
		g.setTransform(trans_0_0_0_151_0);
	}

	private void paintShapeNode_0_0_0_152_0(Graphics2D g) {
		GeneralPath shape152 = new GeneralPath();
		shape152.moveTo(26.482, 126.4);
		shape152.curveTo(26.482, 126.4, 33.403, 125.87, 31.806, 128.0);
		shape152.curveTo(30.209, 130.12, 27.014, 129.06, 27.014, 129.06);
		shape152.lineTo(26.482, 126.399994);
		shape152.closePath();
		g.fill(shape152);
	}

	private void paintCompositeGraphicsNode_0_0_0_152(Graphics2D g) {
		// _0_0_0_152_0
		AffineTransform trans_0_0_0_152_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_152_0(g);
		g.setTransform(trans_0_0_0_152_0);
	}

	private void paintShapeNode_0_0_0_153_0(Graphics2D g) {
		GeneralPath shape153 = new GeneralPath();
		shape153.moveTo(36.882, 121.6);
		shape153.curveTo(36.882, 121.6, 43.803, 121.07, 42.206, 123.2);
		shape153.curveTo(40.609, 125.32, 37.414, 124.259995, 37.414, 124.259995);
		shape153.lineTo(36.882, 121.59999);
		shape153.closePath();
		g.fill(shape153);
	}

	private void paintCompositeGraphicsNode_0_0_0_153(Graphics2D g) {
		// _0_0_0_153_0
		AffineTransform trans_0_0_0_153_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_153_0(g);
		g.setTransform(trans_0_0_0_153_0);
	}

	private void paintShapeNode_0_0_0_154_0(Graphics2D g) {
		GeneralPath shape154 = new GeneralPath();
		shape154.moveTo(9.282, 103.6);
		shape154.curveTo(9.282, 103.6, 16.203, 103.07, 14.605999, 105.2);
		shape154.curveTo(13.008999, 107.32, 9.013999, 107.06, 9.013999, 107.06);
		shape154.lineTo(9.281999, 103.6);
		shape154.closePath();
		g.fill(shape154);
	}

	private void paintCompositeGraphicsNode_0_0_0_154(Graphics2D g) {
		// _0_0_0_154_0
		AffineTransform trans_0_0_0_154_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_154_0(g);
		g.setTransform(trans_0_0_0_154_0);
	}

	private void paintShapeNode_0_0_0_155_0(Graphics2D g) {
		GeneralPath shape155 = new GeneralPath();
		shape155.moveTo(19.282, 100.4);
		shape155.curveTo(19.282, 100.4, 26.203, 99.866005, 24.605999, 102.0);
		shape155.curveTo(23.008999, 104.12, 18.613998, 103.86, 18.613998, 103.86);
		shape155.lineTo(19.281998, 100.4);
		shape155.closePath();
		g.fill(shape155);
	}

	private void paintCompositeGraphicsNode_0_0_0_155(Graphics2D g) {
		// _0_0_0_155_0
		AffineTransform trans_0_0_0_155_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_155_0(g);
		g.setTransform(trans_0_0_0_155_0);
	}

	private void paintShapeNode_0_0_0_156_0(Graphics2D g) {
		GeneralPath shape156 = new GeneralPath();
		shape156.moveTo(-3.4, 140.4);
		shape156.curveTo(-3.4, 140.4, 1.7999997, 140.0, 0.5999999, 141.59999);
		shape156.curveTo(-0.5999999, 143.19998, -3.0, 142.4, -3.0, 142.4);
		shape156.lineTo(-3.4, 140.4);
		shape156.closePath();
		g.fill(shape156);
	}

	private void paintCompositeGraphicsNode_0_0_0_156(Graphics2D g) {
		// _0_0_0_156_0
		AffineTransform trans_0_0_0_156_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_156_0(g);
		g.setTransform(trans_0_0_0_156_0);
	}

	private void paintShapeNode_0_0_0_157_0(Graphics2D g) {
		GeneralPath shape157 = new GeneralPath();
		shape157.moveTo(-76.6, 41.2);
		shape157.curveTo(-76.6, 41.2, -81.0, 50.0, -81.4, 53.2);
		shape157.curveTo(-81.4, 53.2, -80.6, 44.4, -79.4, 42.4);
		shape157.curveTo(-78.200005, 40.4, -76.6, 41.2, -76.6, 41.2);
		shape157.closePath();
		g.setPaint(new Color(153, 38, 0, 255));
		g.fill(shape157);
	}

	private void paintCompositeGraphicsNode_0_0_0_157(Graphics2D g) {
		// _0_0_0_157_0
		AffineTransform trans_0_0_0_157_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_157_0(g);
		g.setTransform(trans_0_0_0_157_0);
	}

	private void paintShapeNode_0_0_0_158_0(Graphics2D g) {
		GeneralPath shape158 = new GeneralPath();
		shape158.moveTo(-95.0, 55.2);
		shape158.curveTo(-95.0, 55.2, -98.2, 69.6, -97.8, 72.4);
		shape158.curveTo(-97.8, 72.4, -99.0, 60.800003, -98.600006, 59.600002);
		shape158.curveTo(-98.20001, 58.4, -95.00001, 55.2, -95.00001, 55.2);
		shape158.closePath();
		g.fill(shape158);
	}

	private void paintCompositeGraphicsNode_0_0_0_158(Graphics2D g) {
		// _0_0_0_158_0
		AffineTransform trans_0_0_0_158_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_158_0(g);
		g.setTransform(trans_0_0_0_158_0);
	}

	private void paintShapeNode_0_0_0_159_0(Graphics2D g) {
		GeneralPath shape159 = new GeneralPath();
		shape159.moveTo(-74.2, -19.4);
		shape159.lineTo(-74.399994, -16.199999);
		shape159.lineTo(-76.59999, -15.999999);
		shape159.curveTo(-76.59999, -15.999999, -62.39999, -3.3999987, -61.79999, 4.2000017);
		shape159.curveTo(-61.79999, 4.2000017, -60.999992, -3.999998, -74.19999, -19.399998);
		shape159.closePath();
		g.setPaint(new Color(204, 204, 204, 255));
		g.fill(shape159);
	}

	private void paintCompositeGraphicsNode_0_0_0_159(Graphics2D g) {
		// _0_0_0_159_0
		AffineTransform trans_0_0_0_159_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_159_0(g);
		g.setTransform(trans_0_0_0_159_0);
	}

	private void paintShapeNode_0_0_0_160_0(Graphics2D g) {
		GeneralPath shape160 = new GeneralPath();
		shape160.moveTo(-70.216, -18.135);
		shape160.curveTo(-70.647, -18.551, -70.428, -19.296, -70.836006, -19.556);
		shape160.curveTo(-71.645004, -20.072, -69.53801, -20.129, -69.76601, -20.845);
		shape160.curveTo(-70.14901, -22.050999, -69.962006, -22.071999, -70.08401, -23.348);
		shape160.curveTo(-70.14101, -23.946, -69.55301, -25.486, -69.16801, -25.925999);
		shape160.curveTo(-67.72201, -27.578, -69.046005, -30.509998, -67.406006, -32.060997);
		shape160.curveTo(-67.102005, -32.35, -66.726006, -32.901997, -66.44101, -33.319996);
		shape160.curveTo(-65.78201, -34.282997, -64.59801, -34.770996, -63.64801, -35.598995);
		shape160.curveTo(-63.33001, -35.874996, -63.53101, -36.701996, -62.96201, -36.609997);
		shape160.curveTo(-62.24801, -36.494995, -61.007008, -36.624996, -61.05201, -35.783997);
		shape160.curveTo(-61.16501, -33.663998, -62.49401, -31.943996, -63.77401, -30.275997);
		shape160.curveTo(-63.32301, -29.571997, -63.78101, -28.936996, -64.06501, -28.379997);
		shape160.curveTo(-65.40001, -25.759998, -65.21101, -22.918997, -65.38501, -20.078999);
		shape160.curveTo(-65.39001, -19.994, -65.69701, -19.915998, -65.68901, -19.862999);
		shape160.curveTo(-65.33601, -17.528, -64.752014, -15.328999, -63.87301, -13.099998);
		shape160.curveTo(-63.507008, -12.169998, -63.036007, -11.274999, -62.88601, -10.347999);
		shape160.curveTo(-62.77501, -9.661999, -62.67201, -8.828999, -63.08001, -8.123999);
		shape160.curveTo(-61.04501, -5.2339983, -62.354008, -2.5829988, -61.18501, 0.9480009);
		shape160.curveTo(-60.97801, 1.5730009, -59.28601, 3.487001, -59.74901, 3.326001);
		shape160.curveTo(-62.26201, 2.4550009, -62.37401, 2.0570009, -62.55101, 1.3040009);
		shape160.curveTo(-62.69701, 0.6810008, -63.02701, -0.69599915, -63.26401, -1.2979991);
		shape160.curveTo(-63.32801, -1.4619992, -63.499012, -3.3459992, -63.57701, -3.4679992);
		shape160.curveTo(-65.09001, -5.8499994, -63.73201, -5.6739993, -65.10201, -8.032);
		shape160.curveTo(-66.530014, -8.712, -67.49601, -9.816, -68.61901, -10.978);
		shape160.curveTo(-68.81701, -11.181999, -67.67401, -11.906, -67.85501, -12.1189995);
		shape160.curveTo(-68.947014, -13.407999, -70.10001, -14.174999, -69.76401, -15.667999);
		shape160.curveTo(-69.60901, -16.358, -69.47201, -17.414999, -70.21601, -18.134998);
		shape160.closePath();
		g.setPaint(new Color(0, 0, 0, 255));
		g.fill(shape160);
	}

	private void paintCompositeGraphicsNode_0_0_0_160(Graphics2D g) {
		// _0_0_0_160_0
		AffineTransform trans_0_0_0_160_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_160_0(g);
		g.setTransform(trans_0_0_0_160_0);
	}

	private void paintShapeNode_0_0_0_161_0(Graphics2D g) {
		GeneralPath shape161 = new GeneralPath();
		shape161.moveTo(-73.8, -16.4);
		shape161.curveTo(-73.8, -16.4, -73.4, -9.599999, -71.0, -8.0);
		shape161.curveTo(-68.6, -6.4000006, -69.8, -7.2, -73.0, -8.4);
		shape161.curveTo(-76.2, -9.599999, -75.0, -10.4, -75.0, -10.4);
		shape161.curveTo(-75.0, -10.4, -77.8, -10.0, -75.4, -7.9999995);
		shape161.curveTo(-73.0, -5.999999, -69.4, -3.5999994, -71.0, -3.5999994);
		shape161.curveTo(-72.6, -3.5999994, -80.2, -7.5999994, -80.2, -10.4);
		shape161.curveTo(-80.2, -13.2, -81.2, -17.3, -81.2, -17.3);
		shape161.curveTo(-81.2, -17.3, -80.1, -18.099998, -75.299995, -18.0);
		shape161.curveTo(-75.299995, -18.0, -73.899994, -17.3, -73.799995, -16.4);
		shape161.closePath();
		g.fill(shape161);
	}

	private void paintCompositeGraphicsNode_0_0_0_161(Graphics2D g) {
		// _0_0_0_161_0
		AffineTransform trans_0_0_0_161_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_161_0(g);
		g.setTransform(trans_0_0_0_161_0);
	}

	private void paintShapeNode_0_0_0_162_0(Graphics2D g) {
		GeneralPath shape162 = new GeneralPath();
		shape162.moveTo(-74.6, 2.2);
		shape162.curveTo(-74.6, 2.2, -83.119995, -0.59099984, -101.6, 2.8000002);
		shape162.curveTo(-101.6, 2.8000002, -92.569, 0.7220001, -73.8, 3.0000002);
		shape162.curveTo(-63.500004, 4.25, -74.600006, 2.2000003, -74.600006, 2.2000003);
		shape162.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape162);
		g.setPaint(new Color(0, 0, 0, 255));
		g.setStroke(new BasicStroke(0.1f,0,0,4.0f,null,0.0f));
		g.draw(shape162);
	}

	private void paintCompositeGraphicsNode_0_0_0_162(Graphics2D g) {
		// _0_0_0_162_0
		AffineTransform trans_0_0_0_162_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_162_0(g);
		g.setTransform(trans_0_0_0_162_0);
	}

	private void paintShapeNode_0_0_0_163_0(Graphics2D g) {
		GeneralPath shape163 = new GeneralPath();
		shape163.moveTo(-72.502, 2.129);
		shape163.curveTo(-72.502, 2.129, -80.748, -1.3889999, -99.453, 0.39199996);
		shape163.curveTo(-99.453, 0.39199996, -90.275, -0.8970001, -71.774, 2.995);
		shape163.curveTo(-61.620003, 5.1309996, -72.502, 2.129, -72.502, 2.129);
		shape163.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape163);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape163);
	}

	private void paintCompositeGraphicsNode_0_0_0_163(Graphics2D g) {
		// _0_0_0_163_0
		AffineTransform trans_0_0_0_163_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_163_0(g);
		g.setTransform(trans_0_0_0_163_0);
	}

	private void paintShapeNode_0_0_0_164_0(Graphics2D g) {
		GeneralPath shape164 = new GeneralPath();
		shape164.moveTo(-70.714, 2.222);
		shape164.curveTo(-70.714, 2.222, -78.675995, -1.8989999, -97.461, -1.5140002);
		shape164.curveTo(-97.461, -1.5140002, -88.213, -2.118, -70.052, 3.1399996);
		shape164.curveTo(-60.086002, 6.0249996, -70.714005, 2.2219996, -70.714005, 2.2219996);
		shape164.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape164);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape164);
	}

	private void paintCompositeGraphicsNode_0_0_0_164(Graphics2D g) {
		// _0_0_0_164_0
		AffineTransform trans_0_0_0_164_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_164_0(g);
		g.setTransform(trans_0_0_0_164_0);
	}

	private void paintShapeNode_0_0_0_165_0(Graphics2D g) {
		GeneralPath shape165 = new GeneralPath();
		shape165.moveTo(-69.444, 2.445);
		shape165.curveTo(-69.444, 2.445, -76.268, -1.8620002, -93.142, -2.9600003);
		shape165.curveTo(-93.142, -2.9600003, -84.803, -2.7900002, -68.922, 3.3189995);
		shape165.curveTo(-60.205997, 6.6719995, -69.444, 2.4449995, -69.444, 2.4449995);
		shape165.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape165);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape165);
	}

	private void paintCompositeGraphicsNode_0_0_0_165(Graphics2D g) {
		// _0_0_0_165_0
		AffineTransform trans_0_0_0_165_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_165_0(g);
		g.setTransform(trans_0_0_0_165_0);
	}

	private void paintShapeNode_0_0_0_166_0(Graphics2D g) {
		GeneralPath shape166 = new GeneralPath();
		shape166.moveTo(45.84, 12.961);
		shape166.curveTo(45.84, 12.961, 44.91, 13.6050005, 45.124, 12.424001);
		shape166.curveTo(45.339, 11.243001, 73.547, -1.9269991, 77.160995, -1.6769991);
		shape166.curveTo(77.160995, -1.6769991, 46.912994, 11.529001, 45.839996, 12.961);
		shape166.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape166);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape166);
	}

	private void paintCompositeGraphicsNode_0_0_0_166(Graphics2D g) {
		// _0_0_0_166_0
		AffineTransform trans_0_0_0_166_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_166_0(g);
		g.setTransform(trans_0_0_0_166_0);
	}

	private void paintShapeNode_0_0_0_167_0(Graphics2D g) {
		GeneralPath shape167 = new GeneralPath();
		shape167.moveTo(42.446, 13.6);
		shape167.curveTo(42.446, 13.6, 41.57, 14.315001, 41.690998, 13.121);
		shape167.curveTo(41.811996, 11.927, 68.899, -3.4179993, 72.520996, -3.4519997);
		shape167.curveTo(72.520996, -3.4519997, 43.403996, 12.089001, 42.445995, 13.6);
		shape167.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape167);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape167);
	}

	private void paintCompositeGraphicsNode_0_0_0_167(Graphics2D g) {
		// _0_0_0_167_0
		AffineTransform trans_0_0_0_167_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_167_0(g);
		g.setTransform(trans_0_0_0_167_0);
	}

	private void paintShapeNode_0_0_0_168_0(Graphics2D g) {
		GeneralPath shape168 = new GeneralPath();
		shape168.moveTo(39.16, 14.975);
		shape168.curveTo(39.16, 14.975, 38.332, 15.747001, 38.374, 14.547);
		shape168.curveTo(38.416, 13.348, 58.233, -2.1489992, 68.045, -4.023);
		shape168.curveTo(68.045, -4.023, 50.015, 4.104, 39.159996, 14.974999);
		shape168.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape168);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape168);
	}

	private void paintCompositeGraphicsNode_0_0_0_168(Graphics2D g) {
		// _0_0_0_168_0
		AffineTransform trans_0_0_0_168_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_168_0(g);
		g.setTransform(trans_0_0_0_168_0);
	}

	private void paintShapeNode_0_0_0_169_0(Graphics2D g) {
		GeneralPath shape169 = new GeneralPath();
		shape169.moveTo(36.284, 16.838);
		shape169.curveTo(36.284, 16.838, 35.539, 17.532, 35.577, 16.453);
		shape169.curveTo(35.614998, 15.372999, 53.448997, 1.4259987, 62.28, -0.26000023);
		shape169.curveTo(62.28, -0.26000023, 46.054, 7.054, 36.283997, 16.838);
		shape169.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape169);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape169);
	}

	private void paintCompositeGraphicsNode_0_0_0_169(Graphics2D g) {
		// _0_0_0_169_0
		AffineTransform trans_0_0_0_169_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_169_0(g);
		g.setTransform(trans_0_0_0_169_0);
	}

	private void paintShapeNode_0_0_0_170_0(Graphics2D g) {
		GeneralPath shape170 = new GeneralPath();
		shape170.moveTo(4.6, 164.8);
		shape170.curveTo(4.6, 164.8, -10.6, 162.40001, 6.2, 160.8);
		shape170.curveTo(6.2, 160.8, 24.2, 158.8, 28.2, 153.6);
		shape170.curveTo(28.2, 153.6, 41.800003, 144.40001, 44.6, 144.0);
		shape170.curveTo(47.399994, 143.59999, 63.8, 140.0, 64.2, 137.6);
		shape170.curveTo(64.59999, 135.20001, 70.6, 132.8, 72.2, 133.6);
		shape170.curveTo(73.799995, 134.40001, 73.799995, 143.6, 71.0, 144.40001);
		shape170.curveTo(68.200005, 145.20001, 49.4, 152.40001, 43.0, 153.6);
		shape170.curveTo(36.6, 154.8, 25.0, 162.40001, 20.2, 163.6);
		shape170.curveTo(15.400002, 164.8, 4.6000004, 164.8, 4.6000004, 164.8);
		shape170.closePath();
		g.setPaint(new Color(204, 204, 204, 255));
		g.fill(shape170);
	}

	private void paintCompositeGraphicsNode_0_0_0_170(Graphics2D g) {
		// _0_0_0_170_0
		AffineTransform trans_0_0_0_170_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_170_0(g);
		g.setTransform(trans_0_0_0_170_0);
	}

	private void paintShapeNode_0_0_0_171_0(Graphics2D g) {
		GeneralPath shape171 = new GeneralPath();
		shape171.moveTo(77.6, 127.4);
		shape171.curveTo(77.6, 127.4, 74.6, 129.0, 73.4, 131.6);
		shape171.curveTo(73.4, 131.6, 67.0, 142.20001, 52.800003, 145.40001);
		shape171.curveTo(52.800003, 145.40001, 29.800003, 154.40001, 22.000004, 156.40001);
		shape171.curveTo(22.000004, 156.40001, 8.600004, 161.40001, 1.2000046, 160.6);
		shape171.curveTo(1.2000046, 160.6, -5.7999954, 160.8, 0.40000457, 162.40001);
		shape171.curveTo(0.40000457, 162.40001, 20.600006, 160.40001, 24.000006, 158.6);
		shape171.curveTo(24.000006, 158.6, 39.600006, 153.40001, 42.600006, 150.8);
		shape171.curveTo(45.600006, 148.2, 63.800007, 143.2, 66.00001, 141.2);
		shape171.curveTo(68.20001, 139.2, 78.00001, 130.8, 77.600006, 127.399994);
		shape171.closePath();
		g.setPaint(new Color(0, 0, 0, 255));
		g.fill(shape171);
	}

	private void paintCompositeGraphicsNode_0_0_0_171(Graphics2D g) {
		// _0_0_0_171_0
		AffineTransform trans_0_0_0_171_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_171_0(g);
		g.setTransform(trans_0_0_0_171_0);
	}

	private void paintShapeNode_0_0_0_172_0(Graphics2D g) {
		GeneralPath shape172 = new GeneralPath();
		shape172.moveTo(18.882, 158.91);
		shape172.curveTo(18.882, 158.91, 24.111, 158.68001, 22.958, 160.23001);
		shape172.curveTo(21.805, 161.78001, 19.357, 160.91, 19.357, 160.91);
		shape172.lineTo(18.882, 158.91);
		shape172.closePath();
		g.fill(shape172);
	}

	private void paintCompositeGraphicsNode_0_0_0_172(Graphics2D g) {
		// _0_0_0_172_0
		AffineTransform trans_0_0_0_172_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_172_0(g);
		g.setTransform(trans_0_0_0_172_0);
	}

	private void paintShapeNode_0_0_0_173_0(Graphics2D g) {
		GeneralPath shape173 = new GeneralPath();
		shape173.moveTo(11.68, 160.26);
		shape173.curveTo(11.68, 160.26, 16.908, 160.04, 15.7560005, 161.59);
		shape173.curveTo(14.603001, 163.14, 12.155001, 162.26, 12.155001, 162.26);
		shape173.lineTo(11.68, 160.26);
		shape173.closePath();
		g.fill(shape173);
	}

	private void paintCompositeGraphicsNode_0_0_0_173(Graphics2D g) {
		// _0_0_0_173_0
		AffineTransform trans_0_0_0_173_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_173_0(g);
		g.setTransform(trans_0_0_0_173_0);
	}

	private void paintShapeNode_0_0_0_174_0(Graphics2D g) {
		GeneralPath shape174 = new GeneralPath();
		shape174.moveTo(1.251, 161.51);
		shape174.curveTo(1.251, 161.51, 6.48, 161.28, 5.327, 162.83);
		shape174.curveTo(4.1740003, 164.38, 1.7260001, 163.51, 1.7260001, 163.51);
		shape174.lineTo(1.251, 161.51);
		shape174.closePath();
		g.fill(shape174);
	}

	private void paintCompositeGraphicsNode_0_0_0_174(Graphics2D g) {
		// _0_0_0_174_0
		AffineTransform trans_0_0_0_174_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_174_0(g);
		g.setTransform(trans_0_0_0_174_0);
	}

	private void paintShapeNode_0_0_0_175_0(Graphics2D g) {
		GeneralPath shape175 = new GeneralPath();
		shape175.moveTo(-6.383, 162.06);
		shape175.curveTo(-6.383, 162.06, -1.1539998, 161.83, -2.3069997, 163.38);
		shape175.curveTo(-3.4599996, 164.93001, -5.908, 164.05, -5.908, 164.05);
		shape175.lineTo(-6.383, 162.06);
		shape175.closePath();
		g.fill(shape175);
	}

	private void paintCompositeGraphicsNode_0_0_0_175(Graphics2D g) {
		// _0_0_0_175_0
		AffineTransform trans_0_0_0_175_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_175_0(g);
		g.setTransform(trans_0_0_0_175_0);
	}

	private void paintShapeNode_0_0_0_176_0(Graphics2D g) {
		GeneralPath shape176 = new GeneralPath();
		shape176.moveTo(35.415, 151.51);
		shape176.curveTo(35.415, 151.51, 42.375, 151.20999, 40.84, 153.26999);
		shape176.curveTo(39.306, 155.34, 36.047, 154.16998, 36.047, 154.16998);
		shape176.lineTo(35.415, 151.50998);
		shape176.closePath();
		g.fill(shape176);
	}

	private void paintCompositeGraphicsNode_0_0_0_176(Graphics2D g) {
		// _0_0_0_176_0
		AffineTransform trans_0_0_0_176_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_176_0(g);
		g.setTransform(trans_0_0_0_176_0);
	}

	private void paintShapeNode_0_0_0_177_0(Graphics2D g) {
		GeneralPath shape177 = new GeneralPath();
		shape177.moveTo(45.73, 147.09);
		shape177.curveTo(45.73, 147.09, 51.689, 143.79, 51.155, 148.84999);
		shape177.curveTo(50.885, 151.4, 46.362, 149.74998, 46.362, 149.74998);
		shape177.lineTo(45.73, 147.08998);
		shape177.closePath();
		g.fill(shape177);
	}

	private void paintCompositeGraphicsNode_0_0_0_177(Graphics2D g) {
		// _0_0_0_177_0
		AffineTransform trans_0_0_0_177_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_177_0(g);
		g.setTransform(trans_0_0_0_177_0);
	}

	private void paintShapeNode_0_0_0_178_0(Graphics2D g) {
		GeneralPath shape178 = new GeneralPath();
		shape178.moveTo(54.862, 144.27);
		shape178.curveTo(54.862, 144.27, 62.021, 140.57, 60.287, 146.04001);
		shape178.curveTo(59.509, 148.48001, 55.493, 146.94, 55.493, 146.94);
		shape178.lineTo(54.862, 144.27);
		shape178.closePath();
		g.fill(shape178);
	}

	private void paintCompositeGraphicsNode_0_0_0_178(Graphics2D g) {
		// _0_0_0_178_0
		AffineTransform trans_0_0_0_178_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_178_0(g);
		g.setTransform(trans_0_0_0_178_0);
	}

	private void paintShapeNode_0_0_0_179_0(Graphics2D g) {
		GeneralPath shape179 = new GeneralPath();
		shape179.moveTo(64.376, 139.45);
		shape179.curveTo(64.376, 139.45, 68.735, 134.55, 69.801, 141.20999);
		shape179.curveTo(70.207, 143.74998, 65.008, 142.10999, 65.008, 142.10999);
		shape179.lineTo(64.376, 139.44998);
		shape179.closePath();
		g.fill(shape179);
	}

	private void paintCompositeGraphicsNode_0_0_0_179(Graphics2D g) {
		// _0_0_0_179_0
		AffineTransform trans_0_0_0_179_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_179_0(g);
		g.setTransform(trans_0_0_0_179_0);
	}

	private void paintShapeNode_0_0_0_180_0(Graphics2D g) {
		GeneralPath shape180 = new GeneralPath();
		shape180.moveTo(26.834, 156.0);
		shape180.curveTo(26.834, 156.0, 32.062, 155.77, 30.91, 157.32);
		shape180.curveTo(29.757, 158.87001, 27.308, 158.0, 27.308, 158.0);
		shape180.lineTo(26.834, 156.0);
		shape180.closePath();
		g.fill(shape180);
	}

	private void paintCompositeGraphicsNode_0_0_0_180(Graphics2D g) {
		// _0_0_0_180_0
		AffineTransform trans_0_0_0_180_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_180_0(g);
		g.setTransform(trans_0_0_0_180_0);
	}

	private void paintShapeNode_0_0_0_181_0(Graphics2D g) {
		GeneralPath shape181 = new GeneralPath();
		shape181.moveTo(62.434, 34.603);
		shape181.curveTo(62.434, 34.603, 61.707996, 35.268, 61.706997, 34.197002);
		shape181.curveTo(61.706997, 33.127003, 79.190994, 19.863003, 88.034, 18.479002);
		shape181.curveTo(88.034, 18.479002, 71.935, 25.208002, 62.434, 34.603004);
		shape181.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape181);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape181);
	}

	private void paintCompositeGraphicsNode_0_0_0_181(Graphics2D g) {
		// _0_0_0_181_0
		AffineTransform trans_0_0_0_181_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_181_0(g);
		g.setTransform(trans_0_0_0_181_0);
	}

	private void paintShapeNode_0_0_0_182_0(Graphics2D g) {
		GeneralPath shape182 = new GeneralPath();
		shape182.moveTo(65.4, 98.4);
		shape182.curveTo(65.4, 98.4, 87.401, 120.8, 96.601, 124.4);
		shape182.curveTo(96.601, 124.4, 105.799995, 135.6, 101.799995, 161.6);
		shape182.curveTo(101.799995, 161.6, 98.601, 169.20001, 95.40099, 148.40001);
		shape182.curveTo(95.40099, 148.40001, 98.60099, 123.20001, 87.40099, 139.20001);
		shape182.curveTo(87.40099, 139.20001, 78.99999, 129.30002, 85.399994, 129.6);
		shape182.curveTo(85.399994, 129.6, 88.60099, 131.6, 89.00099, 130.0);
		shape182.curveTo(89.40099, 128.4, 81.399994, 114.8, 64.19999, 100.4);
		shape182.curveTo(46.999985, 86.0, 65.39999, 98.4, 65.39999, 98.4);
		shape182.closePath();
		g.fill(shape182);
	}

	private void paintCompositeGraphicsNode_0_0_0_182(Graphics2D g) {
		// _0_0_0_182_0
		AffineTransform trans_0_0_0_182_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_182_0(g);
		g.setTransform(trans_0_0_0_182_0);
	}

	private void paintShapeNode_0_0_0_183_0(Graphics2D g) {
		GeneralPath shape183 = new GeneralPath();
		shape183.moveTo(7.0, 137.2);
		shape183.curveTo(7.0, 137.2, 6.8, 135.4, 8.6, 136.2);
		shape183.curveTo(10.400001, 137.0, 104.6, 143.2, 136.2, 167.2);
		shape183.curveTo(136.2, 167.2, 91.00099, 144.0, 7.0, 137.2);
		shape183.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape183);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape183);
	}

	private void paintCompositeGraphicsNode_0_0_0_183(Graphics2D g) {
		// _0_0_0_183_0
		AffineTransform trans_0_0_0_183_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_183_0(g);
		g.setTransform(trans_0_0_0_183_0);
	}

	private void paintShapeNode_0_0_0_184_0(Graphics2D g) {
		GeneralPath shape184 = new GeneralPath();
		shape184.moveTo(17.4, 132.8);
		shape184.curveTo(17.4, 132.8, 17.199999, 131.0, 19.0, 131.8);
		shape184.curveTo(20.800001, 132.6, 157.4, 131.6, 181.0, 164.0);
		shape184.curveTo(181.0, 164.0, 159.0, 138.8, 17.399994, 132.8);
		shape184.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape184);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape184);
	}

	private void paintCompositeGraphicsNode_0_0_0_184(Graphics2D g) {
		// _0_0_0_184_0
		AffineTransform trans_0_0_0_184_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_184_0(g);
		g.setTransform(trans_0_0_0_184_0);
	}

	private void paintShapeNode_0_0_0_185_0(Graphics2D g) {
		GeneralPath shape185 = new GeneralPath();
		shape185.moveTo(29.0, 128.8);
		shape185.curveTo(29.0, 128.8, 28.8, 127.0, 30.6, 127.8);
		shape185.curveTo(32.4, 128.6, 205.8, 115.600006, 229.40001, 148.0);
		shape185.curveTo(229.40001, 148.0, 219.8, 122.4, 29.000015, 128.8);
		shape185.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape185);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape185);
	}

	private void paintCompositeGraphicsNode_0_0_0_185(Graphics2D g) {
		// _0_0_0_185_0
		AffineTransform trans_0_0_0_185_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_185_0(g);
		g.setTransform(trans_0_0_0_185_0);
	}

	private void paintShapeNode_0_0_0_186_0(Graphics2D g) {
		GeneralPath shape186 = new GeneralPath();
		shape186.moveTo(39.0, 124.0);
		shape186.curveTo(39.0, 124.0, 38.8, 122.2, 40.6, 123.0);
		shape186.curveTo(42.399998, 123.8, 164.6, 85.2, 188.20001, 117.6);
		shape186.curveTo(188.20001, 117.6, 174.80002, 93.0, 39.000015, 124.0);
		shape186.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape186);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape186);
	}

	private void paintCompositeGraphicsNode_0_0_0_186(Graphics2D g) {
		// _0_0_0_186_0
		AffineTransform trans_0_0_0_186_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_186_0(g);
		g.setTransform(trans_0_0_0_186_0);
	}

	private void paintShapeNode_0_0_0_187_0(Graphics2D g) {
		GeneralPath shape187 = new GeneralPath();
		shape187.moveTo(-19.0, 146.8);
		shape187.curveTo(-19.0, 146.8, -19.2, 145.0, -17.4, 145.8);
		shape187.curveTo(-15.599998, 146.6, 2.2000008, 148.8, 4.200001, 187.6);
		shape187.curveTo(4.200001, 187.6, -2.999999, 145.6, -19.0, 146.8);
		shape187.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape187);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape187);
	}

	private void paintCompositeGraphicsNode_0_0_0_187(Graphics2D g) {
		// _0_0_0_187_0
		AffineTransform trans_0_0_0_187_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_187_0(g);
		g.setTransform(trans_0_0_0_187_0);
	}

	private void paintShapeNode_0_0_0_188_0(Graphics2D g) {
		GeneralPath shape188 = new GeneralPath();
		shape188.moveTo(-27.8, 148.4);
		shape188.curveTo(-27.8, 148.4, -28.0, 146.59999, -26.199999, 147.4);
		shape188.curveTo(-24.399998, 148.2, -10.199999, 143.59999, -12.999999, 182.4);
		shape188.curveTo(-12.999999, 182.4, -11.799999, 147.2, -27.8, 148.4);
		shape188.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape188);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape188);
	}

	private void paintCompositeGraphicsNode_0_0_0_188(Graphics2D g) {
		// _0_0_0_188_0
		AffineTransform trans_0_0_0_188_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_188_0(g);
		g.setTransform(trans_0_0_0_188_0);
	}

	private void paintShapeNode_0_0_0_189_0(Graphics2D g) {
		GeneralPath shape189 = new GeneralPath();
		shape189.moveTo(-35.8, 148.8);
		shape189.curveTo(-35.8, 148.8, -36.0, 147.0, -34.2, 147.8);
		shape189.curveTo(-32.4, 148.6, -17.0, 149.2, -29.400002, 171.6);
		shape189.curveTo(-29.400002, 171.6, -19.800001, 147.6, -35.800003, 148.8);
		shape189.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape189);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape189);
	}

	private void paintCompositeGraphicsNode_0_0_0_189(Graphics2D g) {
		// _0_0_0_189_0
		AffineTransform trans_0_0_0_189_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_189_0(g);
		g.setTransform(trans_0_0_0_189_0);
	}

	private void paintShapeNode_0_0_0_190_0(Graphics2D g) {
		GeneralPath shape190 = new GeneralPath();
		shape190.moveTo(11.526, 104.46);
		shape190.curveTo(11.526, 104.46, 11.082, 106.46, 12.6310005, 105.25);
		shape190.curveTo(28.699001, 92.622, 61.141, 33.72, 116.83099, 28.085999);
		shape190.curveTo(116.83099, 28.085999, 78.519, 15.975999, 11.530991, 104.46);
		shape190.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape190);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape190);
	}

	private void paintCompositeGraphicsNode_0_0_0_190(Graphics2D g) {
		// _0_0_0_190_0
		AffineTransform trans_0_0_0_190_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_190_0(g);
		g.setTransform(trans_0_0_0_190_0);
	}

	private void paintShapeNode_0_0_0_191_0(Graphics2D g) {
		GeneralPath shape191 = new GeneralPath();
		shape191.moveTo(22.726, 102.66);
		shape191.curveTo(22.726, 102.66, 21.362999, 101.47, 23.230999, 100.850006);
		shape191.curveTo(25.098999, 100.22001, 137.541, 27.720009, 176.83101, 35.686005);
		shape191.curveTo(176.83101, 35.686005, 149.72101, 28.176004, 22.731003, 102.66);
		shape191.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape191);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape191);
	}

	private void paintCompositeGraphicsNode_0_0_0_191(Graphics2D g) {
		// _0_0_0_191_0
		AffineTransform trans_0_0_0_191_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_191_0(g);
		g.setTransform(trans_0_0_0_191_0);
	}

	private void paintShapeNode_0_0_0_192_0(Graphics2D g) {
		GeneralPath shape192 = new GeneralPath();
		shape192.moveTo(1.885, 108.77);
		shape192.curveTo(1.885, 108.77, 1.3759999, 110.369995, 3.087, 109.39);
		shape192.curveTo(12.062, 104.27, 15.677, 47.059, 59.253998, 45.804);
		shape192.curveTo(59.253998, 45.804, 26.842999, 31.09, 1.8849983, 108.770004);
		shape192.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape192);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape192);
	}

	private void paintCompositeGraphicsNode_0_0_0_192(Graphics2D g) {
		// _0_0_0_192_0
		AffineTransform trans_0_0_0_192_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_192_0(g);
		g.setTransform(trans_0_0_0_192_0);
	}

	private void paintShapeNode_0_0_0_193_0(Graphics2D g) {
		GeneralPath shape193 = new GeneralPath();
		shape193.moveTo(-18.038, 119.79);
		shape193.curveTo(-18.038, 119.79, -19.115, 121.08, -17.162, 120.82);
		shape193.curveTo(-6.9160004, 119.49, 14.488998, 78.222, 58.927994, 83.300995);
		shape193.curveTo(58.927994, 83.300995, 26.961994, 68.954994, -18.03801, 119.78999);
		shape193.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape193);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape193);
	}

	private void paintCompositeGraphicsNode_0_0_0_193(Graphics2D g) {
		// _0_0_0_193_0
		AffineTransform trans_0_0_0_193_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_193_0(g);
		g.setTransform(trans_0_0_0_193_0);
	}

	private void paintShapeNode_0_0_0_194_0(Graphics2D g) {
		GeneralPath shape194 = new GeneralPath();
		shape194.moveTo(-6.8, 113.67);
		shape194.curveTo(-6.8, 113.67, -7.611, 115.14, -5.742, 114.509995);
		shape194.curveTo(4.0569997, 111.24, 17.140999, 66.625, 61.729, 63.077995);
		shape194.curveTo(61.729, 63.077995, 27.603, 55.134995, -6.799999, 113.67);
		shape194.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape194);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape194);
	}

	private void paintCompositeGraphicsNode_0_0_0_194(Graphics2D g) {
		// _0_0_0_194_0
		AffineTransform trans_0_0_0_194_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_194_0(g);
		g.setTransform(trans_0_0_0_194_0);
	}

	private void paintShapeNode_0_0_0_195_0(Graphics2D g) {
		GeneralPath shape195 = new GeneralPath();
		shape195.moveTo(-25.078, 124.91);
		shape195.curveTo(-25.078, 124.91, -25.950998, 125.950005, -24.369, 125.75);
		shape195.curveTo(-16.07, 124.67, 1.2679996, 91.240005, 37.264, 95.354004);
		shape195.curveTo(37.264, 95.354004, 11.371, 83.734, -25.078, 124.91);
		shape195.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape195);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape195);
	}

	private void paintCompositeGraphicsNode_0_0_0_195(Graphics2D g) {
		// _0_0_0_195_0
		AffineTransform trans_0_0_0_195_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_195_0(g);
		g.setTransform(trans_0_0_0_195_0);
	}

	private void paintShapeNode_0_0_0_196_0(Graphics2D g) {
		GeneralPath shape196 = new GeneralPath();
		shape196.moveTo(-32.677, 130.82);
		shape196.curveTo(-32.677, 130.82, -33.682, 131.87001, -32.091, 131.75);
		shape196.curveTo(-27.923, 131.44, 2.7150002, 98.36, 21.182999, 113.86);
		shape196.curveTo(21.182999, 113.86, 9.167998, 95.139, -32.677002, 130.82);
		shape196.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape196);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape196);
	}

	private void paintCompositeGraphicsNode_0_0_0_196(Graphics2D g) {
		// _0_0_0_196_0
		AffineTransform trans_0_0_0_196_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_196_0(g);
		g.setTransform(trans_0_0_0_196_0);
	}

	private void paintShapeNode_0_0_0_197_0(Graphics2D g) {
		GeneralPath shape197 = new GeneralPath();
		shape197.moveTo(36.855, 98.898);
		shape197.curveTo(36.855, 98.898, 35.654, 97.543, 37.586, 97.158005);
		shape197.curveTo(39.517998, 96.774, 160.216, 39.061005, 198.176, 51.927006);
		shape197.curveTo(198.176, 51.927006, 172.236, 41.053005, 36.855988, 98.89801);
		shape197.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape197);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape197);
	}

	private void paintCompositeGraphicsNode_0_0_0_197(Graphics2D g) {
		// _0_0_0_197_0
		AffineTransform trans_0_0_0_197_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_197_0(g);
		g.setTransform(trans_0_0_0_197_0);
	}

	private void paintShapeNode_0_0_0_198_0(Graphics2D g) {
		GeneralPath shape198 = new GeneralPath();
		shape198.moveTo(3.4, 163.2);
		shape198.curveTo(3.4, 163.2, 3.2, 161.4, 5.0, 162.2);
		shape198.curveTo(6.8, 163.0, 22.2, 163.59999, 9.8, 186.0);
		shape198.curveTo(9.8, 186.0, 19.400002, 162.0, 3.4, 163.2);
		shape198.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape198);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape198);
	}

	private void paintCompositeGraphicsNode_0_0_0_198(Graphics2D g) {
		// _0_0_0_198_0
		AffineTransform trans_0_0_0_198_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_198_0(g);
		g.setTransform(trans_0_0_0_198_0);
	}

	private void paintShapeNode_0_0_0_199_0(Graphics2D g) {
		GeneralPath shape199 = new GeneralPath();
		shape199.moveTo(13.8, 161.6);
		shape199.curveTo(13.8, 161.6, 13.6, 159.8, 15.400001, 160.6);
		shape199.curveTo(17.2, 161.40001, 35.0, 163.6, 37.0, 202.40001);
		shape199.curveTo(37.0, 202.40001, 29.8, 160.40001, 13.799999, 161.6);
		shape199.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape199);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape199);
	}

	private void paintCompositeGraphicsNode_0_0_0_199(Graphics2D g) {
		// _0_0_0_199_0
		AffineTransform trans_0_0_0_199_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_199_0(g);
		g.setTransform(trans_0_0_0_199_0);
	}

	private void paintShapeNode_0_0_0_200_0(Graphics2D g) {
		GeneralPath shape200 = new GeneralPath();
		shape200.moveTo(20.6, 160.0);
		shape200.curveTo(20.6, 160.0, 20.4, 158.2, 22.2, 159.0);
		shape200.curveTo(24.000002, 159.8, 48.6, 163.2, 72.2, 195.6);
		shape200.curveTo(72.2, 195.6, 36.6, 158.8, 20.599998, 160.0);
		shape200.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape200);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape200);
	}

	private void paintCompositeGraphicsNode_0_0_0_200(Graphics2D g) {
		// _0_0_0_200_0
		AffineTransform trans_0_0_0_200_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_200_0(g);
		g.setTransform(trans_0_0_0_200_0);
	}

	private void paintShapeNode_0_0_0_201_0(Graphics2D g) {
		GeneralPath shape201 = new GeneralPath();
		shape201.moveTo(28.225, 157.97);
		shape201.curveTo(28.225, 157.97, 27.788, 156.21, 29.678, 156.77);
		shape201.curveTo(31.567999, 157.32, 52.002, 155.42, 90.099, 189.6);
		shape201.curveTo(90.099, 189.6, 43.924, 154.66, 28.224998, 157.97);
		shape201.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape201);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape201);
	}

	private void paintCompositeGraphicsNode_0_0_0_201(Graphics2D g) {
		// _0_0_0_201_0
		AffineTransform trans_0_0_0_201_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_201_0(g);
		g.setTransform(trans_0_0_0_201_0);
	}

	private void paintShapeNode_0_0_0_202_0(Graphics2D g) {
		GeneralPath shape202 = new GeneralPath();
		shape202.moveTo(38.625, 153.57);
		shape202.curveTo(38.625, 153.57, 38.188, 151.81001, 40.078, 152.37001);
		shape202.curveTo(41.968, 152.92001, 76.802, 157.42001, 128.5, 192.40001);
		shape202.curveTo(128.5, 192.40001, 54.323997, 150.26001, 38.625, 153.57);
		shape202.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape202);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape202);
	}

	private void paintCompositeGraphicsNode_0_0_0_202(Graphics2D g) {
		// _0_0_0_202_0
		AffineTransform trans_0_0_0_202_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_202_0(g);
		g.setTransform(trans_0_0_0_202_0);
	}

	private void paintShapeNode_0_0_0_203_0(Graphics2D g) {
		GeneralPath shape203 = new GeneralPath();
		shape203.moveTo(-1.8, 142.0);
		shape203.curveTo(-1.8, 142.0, -2.0, 140.2, -0.19999993, 141.0);
		shape203.curveTo(1.6000001, 141.8, 55.0, 144.4, 85.4, 171.2);
		shape203.curveTo(85.4, 171.2, 50.499, 146.43, -1.7999954, 142.0);
		shape203.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape203);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape203);
	}

	private void paintCompositeGraphicsNode_0_0_0_203(Graphics2D g) {
		// _0_0_0_203_0
		AffineTransform trans_0_0_0_203_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_203_0(g);
		g.setTransform(trans_0_0_0_203_0);
	}

	private void paintShapeNode_0_0_0_204_0(Graphics2D g) {
		GeneralPath shape204 = new GeneralPath();
		shape204.moveTo(-11.8, 146.0);
		shape204.curveTo(-11.8, 146.0, -12.0, 144.2, -10.2, 145.0);
		shape204.curveTo(-8.4, 145.8, 16.2, 149.2, 39.8, 181.6);
		shape204.curveTo(39.8, 181.6, 4.200001, 144.8, -11.799999, 146.0);
		shape204.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape204);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape204);
	}

	private void paintCompositeGraphicsNode_0_0_0_204(Graphics2D g) {
		// _0_0_0_204_0
		AffineTransform trans_0_0_0_204_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_204_0(g);
		g.setTransform(trans_0_0_0_204_0);
	}

	private void paintShapeNode_0_0_0_205_0(Graphics2D g) {
		GeneralPath shape205 = new GeneralPath();
		shape205.moveTo(49.503, 148.96);
		shape205.curveTo(49.503, 148.96, 48.938, 147.24, 50.864, 147.66);
		shape205.curveTo(52.789997, 148.07, 87.86, 150.0, 141.98, 181.1);
		shape205.curveTo(141.98, 181.1, 64.31699, 146.70001, 49.503, 148.96);
		shape205.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape205);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape205);
	}

	private void paintCompositeGraphicsNode_0_0_0_205(Graphics2D g) {
		// _0_0_0_205_0
		AffineTransform trans_0_0_0_205_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_205_0(g);
		g.setTransform(trans_0_0_0_205_0);
	}

	private void paintShapeNode_0_0_0_206_0(Graphics2D g) {
		GeneralPath shape206 = new GeneralPath();
		shape206.moveTo(57.903, 146.56);
		shape206.curveTo(57.903, 146.56, 57.338, 144.84, 59.264, 145.26);
		shape206.curveTo(61.19, 145.67, 96.259995, 147.59999, 150.38, 178.7);
		shape206.curveTo(150.38, 178.7, 73.317, 143.9, 57.903008, 146.56);
		shape206.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape206);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape206);
	}

	private void paintCompositeGraphicsNode_0_0_0_206(Graphics2D g) {
		// _0_0_0_206_0
		AffineTransform trans_0_0_0_206_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_206_0(g);
		g.setTransform(trans_0_0_0_206_0);
	}

	private void paintShapeNode_0_0_0_207_0(Graphics2D g) {
		GeneralPath shape207 = new GeneralPath();
		shape207.moveTo(67.503, 141.56);
		shape207.curveTo(67.503, 141.56, 66.937996, 139.84, 68.864, 140.26);
		shape207.curveTo(70.79, 140.67, 113.86, 145.0, 203.584, 179.29999);
		shape207.curveTo(203.584, 179.29999, 82.923996, 138.9, 67.504, 141.55998);
		shape207.closePath();
		g.setPaint(new Color(255, 255, 255, 255));
		g.fill(shape207);
		g.setPaint(new Color(0, 0, 0, 255));
		g.draw(shape207);
	}

	private void paintCompositeGraphicsNode_0_0_0_207(Graphics2D g) {
		// _0_0_0_207_0
		AffineTransform trans_0_0_0_207_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_207_0(g);
		g.setTransform(trans_0_0_0_207_0);
	}

	private void paintShapeNode_0_0_0_208_0(Graphics2D g) {
		GeneralPath shape208 = new GeneralPath();
		shape208.moveTo(-43.8, 148.4);
		shape208.curveTo(-43.8, 148.4, -38.6, 148.0, -39.8, 149.59999);
		shape208.curveTo(-41.0, 151.19998, -43.399998, 150.4, -43.399998, 150.4);
		shape208.lineTo(-43.8, 148.4);
		shape208.closePath();
		g.fill(shape208);
	}

	private void paintCompositeGraphicsNode_0_0_0_208(Graphics2D g) {
		// _0_0_0_208_0
		AffineTransform trans_0_0_0_208_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_208_0(g);
		g.setTransform(trans_0_0_0_208_0);
	}

	private void paintShapeNode_0_0_0_209_0(Graphics2D g) {
		GeneralPath shape209 = new GeneralPath();
		shape209.moveTo(-13.0, 162.4);
		shape209.curveTo(-13.0, 162.4, -7.8, 162.0, -9.0, 163.59999);
		shape209.curveTo(-10.2, 165.19998, -12.6, 164.4, -12.6, 164.4);
		shape209.lineTo(-13.0, 162.4);
		shape209.closePath();
		g.fill(shape209);
	}

	private void paintCompositeGraphicsNode_0_0_0_209(Graphics2D g) {
		// _0_0_0_209_0
		AffineTransform trans_0_0_0_209_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_209_0(g);
		g.setTransform(trans_0_0_0_209_0);
	}

	private void paintShapeNode_0_0_0_210_0(Graphics2D g) {
		GeneralPath shape210 = new GeneralPath();
		shape210.moveTo(-21.8, 162.0);
		shape210.curveTo(-21.8, 162.0, -16.599998, 161.6, -17.8, 163.2);
		shape210.curveTo(-19.0, 164.79999, -21.4, 164.0, -21.4, 164.0);
		shape210.lineTo(-21.8, 162.0);
		shape210.closePath();
		g.fill(shape210);
	}

	private void paintCompositeGraphicsNode_0_0_0_210(Graphics2D g) {
		// _0_0_0_210_0
		AffineTransform trans_0_0_0_210_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_210_0(g);
		g.setTransform(trans_0_0_0_210_0);
	}

	private void paintShapeNode_0_0_0_211_0(Graphics2D g) {
		GeneralPath shape211 = new GeneralPath();
		shape211.moveTo(-117.17, 150.18);
		shape211.curveTo(-117.17, 150.18, -112.119995, 151.5, -113.78, 152.62);
		shape211.curveTo(-115.44, 153.73999, -117.45, 152.2, -117.45, 152.2);
		shape211.lineTo(-117.17, 150.18);
		shape211.closePath();
		g.fill(shape211);
	}

	private void paintCompositeGraphicsNode_0_0_0_211(Graphics2D g) {
		// _0_0_0_211_0
		AffineTransform trans_0_0_0_211_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_211_0(g);
		g.setTransform(trans_0_0_0_211_0);
	}

	private void paintShapeNode_0_0_0_212_0(Graphics2D g) {
		GeneralPath shape212 = new GeneralPath();
		shape212.moveTo(-115.17, 140.58);
		shape212.curveTo(-115.17, 140.58, -110.119995, 141.90001, -111.78, 143.02);
		shape212.curveTo(-113.44, 144.14, -115.45, 142.6, -115.45, 142.6);
		shape212.lineTo(-115.17, 140.58);
		shape212.closePath();
		g.fill(shape212);
	}

	private void paintCompositeGraphicsNode_0_0_0_212(Graphics2D g) {
		// _0_0_0_212_0
		AffineTransform trans_0_0_0_212_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_212_0(g);
		g.setTransform(trans_0_0_0_212_0);
	}

	private void paintShapeNode_0_0_0_213_0(Graphics2D g) {
		GeneralPath shape213 = new GeneralPath();
		shape213.moveTo(-122.37, 136.18);
		shape213.curveTo(-122.37, 136.18, -117.32, 137.5, -118.98, 138.62);
		shape213.curveTo(-120.64001, 139.73999, -122.65, 138.2, -122.65, 138.2);
		shape213.lineTo(-122.37, 136.18);
		shape213.closePath();
		g.fill(shape213);
	}

	private void paintCompositeGraphicsNode_0_0_0_213(Graphics2D g) {
		// _0_0_0_213_0
		AffineTransform trans_0_0_0_213_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_213_0(g);
		g.setTransform(trans_0_0_0_213_0);
	}

	private void paintShapeNode_0_0_0_214_0(Graphics2D g) {
		GeneralPath shape214 = new GeneralPath();
		shape214.moveTo(-42.6, 211.2);
		shape214.lineTo(-48.199997, 213.2);
		shape214.curveTo(-50.199997, 213.2, -61.399998, 216.8, -67.0, 226.8);
		shape214.curveTo(-67.0, 226.8, -54.6, 217.2, -42.6, 211.2);
		shape214.closePath();
		g.setPaint(new Color(204, 204, 204, 255));
		g.fill(shape214);
	}

	private void paintCompositeGraphicsNode_0_0_0_214(Graphics2D g) {
		// _0_0_0_214_0
		AffineTransform trans_0_0_0_214_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_214_0(g);
		g.setTransform(trans_0_0_0_214_0);
	}

	private void paintShapeNode_0_0_0_215_0(Graphics2D g) {
		GeneralPath shape215 = new GeneralPath();
		shape215.moveTo(45.116, 303.85);
		shape215.curveTo(45.257, 304.1, 45.312, 304.52002, 45.604, 304.54);
		shape215.curveTo(46.262, 304.58002, 47.495, 304.88, 47.37, 304.25);
		shape215.curveTo(46.522, 299.94, 45.648, 295.0, 41.515, 293.2);
		shape215.curveTo(40.876, 292.92, 39.434, 293.33002, 39.36, 294.22);
		shape215.curveTo(39.233, 295.74, 39.116, 297.09, 39.425, 298.55);
		shape215.curveTo(39.725, 299.97998, 41.883, 299.97998, 42.8, 298.59998);
		shape215.curveTo(43.736, 300.27, 44.168, 302.11996, 45.115997, 303.84998);
		shape215.closePath();
		g.fill(shape215);
	}

	private void paintCompositeGraphicsNode_0_0_0_215(Graphics2D g) {
		// _0_0_0_215_0
		AffineTransform trans_0_0_0_215_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_215_0(g);
		g.setTransform(trans_0_0_0_215_0);
	}

	private void paintShapeNode_0_0_0_216_0(Graphics2D g) {
		GeneralPath shape216 = new GeneralPath();
		shape216.moveTo(34.038, 308.58);
		shape216.curveTo(34.786, 309.99, 34.658997, 311.84998, 36.073997, 312.41998);
		shape216.curveTo(36.814, 312.71, 38.663998, 311.74, 38.246, 310.65997);
		shape216.curveTo(37.444, 308.59998, 37.056, 306.36, 35.667, 304.55);
		shape216.curveTo(35.467, 304.28998, 35.707, 303.75998, 35.547, 303.43);
		shape216.curveTo(34.953, 302.21, 33.808002, 301.47, 32.4, 301.8);
		shape216.curveTo(31.285002, 304.0, 32.433002, 306.12997, 33.955, 307.84);
		shape216.curveTo(34.091003, 307.99, 33.925003, 308.37, 34.038002, 308.58);
		shape216.closePath();
		g.fill(shape216);
	}

	private void paintCompositeGraphicsNode_0_0_0_216(Graphics2D g) {
		// _0_0_0_216_0
		AffineTransform trans_0_0_0_216_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_216_0(g);
		g.setTransform(trans_0_0_0_216_0);
	}

	private void paintShapeNode_0_0_0_217_0(Graphics2D g) {
		GeneralPath shape217 = new GeneralPath();
		shape217.moveTo(-5.564, 303.39);
		shape217.curveTo(-5.672, 303.01, -5.71, 302.55002, -5.545, 302.23);
		shape217.curveTo(-5.014, 301.2, -4.221, 300.08002, -4.558, 299.05002);
		shape217.curveTo(-4.906, 298.00003, -6.0220003, 298.18002, -6.672, 298.75003);
		shape217.curveTo(-7.807, 299.74002, -7.856, 301.57004, -8.547, 302.93002);
		shape217.curveTo(-8.743, 303.31003, -8.692, 303.89, -9.133, 304.28003);
		shape217.curveTo(-9.607, 304.70004, -10.047, 306.22003, -9.951, 306.79004);
		shape217.curveTo(-9.898, 307.11005, -10.081, 317.01004, -9.859, 316.75003);
		shape217.curveTo(-9.24, 316.02002, -6.1900005, 306.28003, -6.1210003, 305.39005);
		shape217.curveTo(-6.064, 304.66003, -5.3320003, 304.20004, -5.564, 303.39005);
		shape217.closePath();
		g.fill(shape217);
	}

	private void paintCompositeGraphicsNode_0_0_0_217(Graphics2D g) {
		// _0_0_0_217_0
		AffineTransform trans_0_0_0_217_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_217_0(g);
		g.setTransform(trans_0_0_0_217_0);
	}

	private void paintShapeNode_0_0_0_218_0(Graphics2D g) {
		GeneralPath shape218 = new GeneralPath();
		shape218.moveTo(-31.202, 296.6);
		shape218.curveTo(-28.567999, 294.1, -25.778, 291.14, -26.22, 287.43);
		shape218.curveTo(-26.335999, 286.44998, -28.111, 286.97998, -28.298, 287.82);
		shape218.curveTo(-29.1, 291.45, -31.139, 294.11002, -33.707, 296.5);
		shape218.curveTo(-35.903, 298.55, -37.765, 304.89, -38.0, 305.4);
		shape218.curveTo(-34.303, 300.13998, -32.046, 297.4, -31.202, 296.6);
		shape218.closePath();
		g.fill(shape218);
	}

	private void paintCompositeGraphicsNode_0_0_0_218(Graphics2D g) {
		// _0_0_0_218_0
		AffineTransform trans_0_0_0_218_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_218_0(g);
		g.setTransform(trans_0_0_0_218_0);
	}

	private void paintShapeNode_0_0_0_219_0(Graphics2D g) {
		GeneralPath shape219 = new GeneralPath();
		shape219.moveTo(-44.776, 290.64);
		shape219.curveTo(-44.253002, 290.26, -44.555, 289.77002, -44.338, 289.44);
		shape219.curveTo(-43.385002, 287.98, -42.084, 286.74, -42.066, 285.0);
		shape219.curveTo(-42.063004, 284.72, -42.441, 284.41, -42.776, 284.64);
		shape219.curveTo(-43.053, 284.82, -43.395, 284.95, -43.503002, 285.08002);
		shape219.curveTo(-45.533, 287.53003, -46.933002, 290.2, -48.376003, 293.01);
		shape219.curveTo(-48.559002, 293.37, -49.703003, 297.86002, -49.390003, 297.97);
		shape219.curveTo(-49.151005, 298.06, -47.431004, 293.88, -47.221004, 293.76);
		shape219.curveTo(-45.958004, 293.08002, -45.946003, 291.46002, -44.776005, 290.64);
		shape219.closePath();
		g.fill(shape219);
	}

	private void paintCompositeGraphicsNode_0_0_0_219(Graphics2D g) {
		// _0_0_0_219_0
		AffineTransform trans_0_0_0_219_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_219_0(g);
		g.setTransform(trans_0_0_0_219_0);
	}

	private void paintShapeNode_0_0_0_220_0(Graphics2D g) {
		GeneralPath shape220 = new GeneralPath();
		shape220.moveTo(-28.043, 310.18);
		shape220.curveTo(-27.598999, 309.31, -26.022999, 308.11, -26.136, 307.22);
		shape220.curveTo(-26.254, 306.29, -25.786, 304.85, -26.698, 305.54);
		shape220.curveTo(-27.955, 306.48, -31.404, 307.83002, -31.674, 313.64);
		shape220.curveTo(-31.699999, 314.21002, -28.726, 311.52002, -28.043, 310.18002);
		shape220.closePath();
		g.fill(shape220);
	}

	private void paintCompositeGraphicsNode_0_0_0_220(Graphics2D g) {
		// _0_0_0_220_0
		AffineTransform trans_0_0_0_220_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_220_0(g);
		g.setTransform(trans_0_0_0_220_0);
	}

	private void paintShapeNode_0_0_0_221_0(Graphics2D g) {
		GeneralPath shape221 = new GeneralPath();
		shape221.moveTo(-13.6, 293.0);
		shape221.curveTo(-13.200001, 292.33, -12.492001, 292.81, -12.033, 292.54);
		shape221.curveTo(-11.385, 292.17, -10.774, 291.61002, -10.482, 290.96002);
		shape221.curveTo(-9.512, 288.82, -7.743, 287.00003, -7.6000004, 284.60004);
		shape221.curveTo(-9.091001, 283.20004, -9.77, 285.24005, -10.400001, 286.20004);
		shape221.curveTo(-11.723001, 284.55005, -12.722, 286.43005, -14.022, 286.95004);
		shape221.curveTo(-14.092, 286.98004, -14.305, 286.63004, -14.38, 286.66003);
		shape221.curveTo(-15.557, 287.10004, -16.237, 288.18002, -17.235, 288.96002);
		shape221.curveTo(-17.406, 289.09003, -17.811, 288.91003, -17.958, 289.05002);
		shape221.curveTo(-18.61, 289.65002, -19.583, 289.98, -19.863, 290.66);
		shape221.curveTo(-20.973001, 293.36002, -24.113, 295.46, -26.0, 303.0);
		shape221.curveTo(-25.619, 303.91, -21.487999, 296.36, -21.001, 295.66);
		shape221.curveTo(-20.164999, 294.46, -20.046999, 297.32, -18.771, 296.66);
		shape221.curveTo(-18.72, 296.63, -18.534, 296.87, -18.4, 297.0);
		shape221.curveTo(-18.206, 296.72, -17.987999, 296.49, -17.6, 296.6);
		shape221.curveTo(-17.6, 296.2, -17.734001, 295.64, -17.533, 295.49002);
		shape221.curveTo(-16.296001, 294.51, -16.380001, 293.44003, -15.600001, 292.2);
		shape221.curveTo(-15.142001, 292.99002, -14.081001, 292.27002, -13.600001, 293.0);
		shape221.closePath();
		g.fill(shape221);
	}

	private void paintCompositeGraphicsNode_0_0_0_221(Graphics2D g) {
		// _0_0_0_221_0
		AffineTransform trans_0_0_0_221_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_221_0(g);
		g.setTransform(trans_0_0_0_221_0);
	}

	private void paintShapeNode_0_0_0_222_0(Graphics2D g) {
		GeneralPath shape222 = new GeneralPath();
		shape222.moveTo(46.2, 347.4);
		shape222.curveTo(46.2, 347.4, 53.600002, 327.0, 49.2, 315.8);
		shape222.curveTo(49.2, 315.8, 60.6, 337.4, 56.0, 348.59998);
		shape222.curveTo(56.0, 348.59998, 55.6, 338.19998, 51.6, 333.19998);
		shape222.curveTo(51.6, 333.19998, 47.6, 345.99997, 46.199997, 347.4);
		shape222.closePath();
		g.fill(shape222);
	}

	private void paintCompositeGraphicsNode_0_0_0_222(Graphics2D g) {
		// _0_0_0_222_0
		AffineTransform trans_0_0_0_222_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_222_0(g);
		g.setTransform(trans_0_0_0_222_0);
	}

	private void paintShapeNode_0_0_0_223_0(Graphics2D g) {
		GeneralPath shape223 = new GeneralPath();
		shape223.moveTo(31.4, 344.8);
		shape223.curveTo(31.4, 344.8, 36.8, 336.0, 28.8, 317.59998);
		shape223.curveTo(28.8, 317.59998, 28.0, 337.99997, 21.199999, 348.99997);
		shape223.curveTo(21.199999, 348.99997, 35.399998, 328.79996, 31.399998, 344.79996);
		shape223.closePath();
		g.fill(shape223);
	}

	private void paintCompositeGraphicsNode_0_0_0_223(Graphics2D g) {
		// _0_0_0_223_0
		AffineTransform trans_0_0_0_223_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_223_0(g);
		g.setTransform(trans_0_0_0_223_0);
	}

	private void paintShapeNode_0_0_0_224_0(Graphics2D g) {
		GeneralPath shape224 = new GeneralPath();
		shape224.moveTo(21.4, 342.8);
		shape224.curveTo(21.4, 342.8, 21.199999, 322.8, 21.6, 319.8);
		shape224.curveTo(21.6, 319.8, 17.800001, 336.4, 7.6000004, 346.0);
		shape224.curveTo(7.6000004, 346.0, 22.0, 334.0, 21.400002, 342.8);
		shape224.closePath();
		g.fill(shape224);
	}

	private void paintCompositeGraphicsNode_0_0_0_224(Graphics2D g) {
		// _0_0_0_224_0
		AffineTransform trans_0_0_0_224_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_224_0(g);
		g.setTransform(trans_0_0_0_224_0);
	}

	private void paintShapeNode_0_0_0_225_0(Graphics2D g) {
		GeneralPath shape225 = new GeneralPath();
		shape225.moveTo(11.8, 310.8);
		shape225.curveTo(11.8, 310.8, 17.8, 324.4, 7.8, 342.8);
		shape225.curveTo(7.8, 342.8, 14.200001, 330.59998, 9.400001, 323.59998);
		shape225.curveTo(9.400001, 323.59998, 12.0, 320.19998, 11.800001, 310.8);
		shape225.closePath();
		g.fill(shape225);
	}

	private void paintCompositeGraphicsNode_0_0_0_225(Graphics2D g) {
		// _0_0_0_225_0
		AffineTransform trans_0_0_0_225_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_225_0(g);
		g.setTransform(trans_0_0_0_225_0);
	}

	private void paintShapeNode_0_0_0_226_0(Graphics2D g) {
		GeneralPath shape226 = new GeneralPath();
		shape226.moveTo(-7.4, 342.4);
		shape226.curveTo(-7.4, 342.4, -8.4, 326.8, -6.6, 324.6);
		shape226.curveTo(-6.6, 324.6, -6.4, 318.2, -6.7999997, 317.2);
		shape226.curveTo(-6.7999997, 317.2, -2.7999997, 311.0, -2.6, 318.40002);
		shape226.curveTo(-2.6, 318.40002, -1.1999999, 326.2, 1.5999999, 330.80002);
		shape226.curveTo(1.5999999, 330.80002, 5.2, 336.2, 5.0, 342.6);
		shape226.curveTo(5.0, 342.6, -5.0, 312.4, -7.3999996, 342.4);
		shape226.closePath();
		g.fill(shape226);
	}

	private void paintCompositeGraphicsNode_0_0_0_226(Graphics2D g) {
		// _0_0_0_226_0
		AffineTransform trans_0_0_0_226_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_226_0(g);
		g.setTransform(trans_0_0_0_226_0);
	}

	private void paintShapeNode_0_0_0_227_0(Graphics2D g) {
		GeneralPath shape227 = new GeneralPath();
		shape227.moveTo(-11.0, 314.8);
		shape227.curveTo(-11.0, 314.8, -17.6, 325.59998, -19.4, 344.59998);
		shape227.curveTo(-19.4, 344.59998, -20.8, 338.39996, -17.0, 323.99997);
		shape227.curveTo(-17.0, 323.99997, -12.8, 308.59998, -11.0, 314.79996);
		shape227.closePath();
		g.fill(shape227);
	}

	private void paintCompositeGraphicsNode_0_0_0_227(Graphics2D g) {
		// _0_0_0_227_0
		AffineTransform trans_0_0_0_227_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_227_0(g);
		g.setTransform(trans_0_0_0_227_0);
	}

	private void paintShapeNode_0_0_0_228_0(Graphics2D g) {
		GeneralPath shape228 = new GeneralPath();
		shape228.moveTo(-32.8, 334.6);
		shape228.curveTo(-32.8, 334.6, -27.8, 329.2, -26.4, 324.2);
		shape228.curveTo(-26.4, 324.2, -22.8, 308.40002, -29.199999, 317.0);
		shape228.curveTo(-29.199999, 317.0, -28.999998, 325.0, -37.199997, 332.4);
		shape228.curveTo(-37.199997, 332.4, -32.399998, 330.0, -32.799995, 334.6);
		shape228.closePath();
		g.fill(shape228);
	}

	private void paintCompositeGraphicsNode_0_0_0_228(Graphics2D g) {
		// _0_0_0_228_0
		AffineTransform trans_0_0_0_228_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_228_0(g);
		g.setTransform(trans_0_0_0_228_0);
	}

	private void paintShapeNode_0_0_0_229_0(Graphics2D g) {
		GeneralPath shape229 = new GeneralPath();
		shape229.moveTo(-38.6, 329.6);
		shape229.curveTo(-38.6, 329.6, -35.199997, 312.2, -34.399998, 311.4);
		shape229.curveTo(-34.399998, 311.4, -32.6, 308.0, -35.399998, 311.19998);
		shape229.curveTo(-35.399998, 311.19998, -44.199997, 330.4, -48.199997, 336.99997);
		shape229.curveTo(-48.199997, 336.99997, -40.199997, 327.79996, -38.6, 329.59998);
		shape229.closePath();
		g.fill(shape229);
	}

	private void paintCompositeGraphicsNode_0_0_0_229(Graphics2D g) {
		// _0_0_0_229_0
		AffineTransform trans_0_0_0_229_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_229_0(g);
		g.setTransform(trans_0_0_0_229_0);
	}

	private void paintShapeNode_0_0_0_230_0(Graphics2D g) {
		GeneralPath shape230 = new GeneralPath();
		shape230.moveTo(-44.4, 313.0);
		shape230.curveTo(-44.4, 313.0, -32.800003, 290.6, -54.600002, 316.4);
		shape230.curveTo(-54.600002, 316.4, -43.600002, 306.6, -44.4, 313.0);
		shape230.closePath();
		g.fill(shape230);
	}

	private void paintCompositeGraphicsNode_0_0_0_230(Graphics2D g) {
		// _0_0_0_230_0
		AffineTransform trans_0_0_0_230_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_230_0(g);
		g.setTransform(trans_0_0_0_230_0);
	}

	private void paintShapeNode_0_0_0_231_0(Graphics2D g) {
		GeneralPath shape231 = new GeneralPath();
		shape231.moveTo(-59.8, 298.4);
		shape231.curveTo(-59.8, 298.4, -55.0, 279.6, -52.399998, 279.8);
		shape231.lineTo(-50.8, 281.4);
		shape231.curveTo(-50.8, 281.4, -56.8, 291.0, -56.2, 300.8);
		shape231.curveTo(-56.2, 300.8, -56.8, 291.19998, -59.8, 298.4);
		shape231.closePath();
		g.fill(shape231);
	}

	private void paintCompositeGraphicsNode_0_0_0_231(Graphics2D g) {
		// _0_0_0_231_0
		AffineTransform trans_0_0_0_231_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_231_0(g);
		g.setTransform(trans_0_0_0_231_0);
	}

	private void paintShapeNode_0_0_0_232_0(Graphics2D g) {
		GeneralPath shape232 = new GeneralPath();
		shape232.moveTo(270.5, 287.0);
		shape232.curveTo(270.5, 287.0, 258.5, 277.0, 256.0, 273.5);
		shape232.curveTo(256.0, 273.5, 269.5, 292.0, 269.5, 299.0);
		shape232.curveTo(269.5, 299.0, 272.0, 291.5, 270.5, 287.0);
		shape232.closePath();
		g.fill(shape232);
	}

	private void paintCompositeGraphicsNode_0_0_0_232(Graphics2D g) {
		// _0_0_0_232_0
		AffineTransform trans_0_0_0_232_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_232_0(g);
		g.setTransform(trans_0_0_0_232_0);
	}

	private void paintShapeNode_0_0_0_233_0(Graphics2D g) {
		GeneralPath shape233 = new GeneralPath();
		shape233.moveTo(276.0, 265.0);
		shape233.curveTo(276.0, 265.0, 255.0, 250.0, 251.5, 242.5);
		shape233.curveTo(251.5, 242.5, 278.0, 272.0, 278.0, 276.5);
		shape233.curveTo(278.0, 276.5, 278.5, 267.5, 276.0, 265.0);
		shape233.closePath();
		g.fill(shape233);
	}

	private void paintCompositeGraphicsNode_0_0_0_233(Graphics2D g) {
		// _0_0_0_233_0
		AffineTransform trans_0_0_0_233_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_233_0(g);
		g.setTransform(trans_0_0_0_233_0);
	}

	private void paintShapeNode_0_0_0_234_0(Graphics2D g) {
		GeneralPath shape234 = new GeneralPath();
		shape234.moveTo(293.0, 111.0);
		shape234.curveTo(293.0, 111.0, 281.0, 103.0, 279.5, 105.0);
		shape234.curveTo(279.5, 105.0, 290.0, 111.5, 292.5, 120.0);
		shape234.curveTo(292.5, 120.0, 291.0, 111.0, 293.0, 111.0);
		shape234.closePath();
		g.fill(shape234);
	}

	private void paintCompositeGraphicsNode_0_0_0_234(Graphics2D g) {
		// _0_0_0_234_0
		AffineTransform trans_0_0_0_234_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_234_0(g);
		g.setTransform(trans_0_0_0_234_0);
	}

	private void paintShapeNode_0_0_0_235_0(Graphics2D g) {
		GeneralPath shape235 = new GeneralPath();
		shape235.moveTo(301.5, 191.5);
		shape235.lineTo(284.0, 179.5);
		shape235.curveTo(284.0, 179.5, 303.0, 196.5, 303.5, 200.5);
		shape235.lineTo(301.5, 191.5);
		shape235.closePath();
		g.fill(shape235);
	}

	private void paintCompositeGraphicsNode_0_0_0_235(Graphics2D g) {
		// _0_0_0_235_0
		AffineTransform trans_0_0_0_235_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_235_0(g);
		g.setTransform(trans_0_0_0_235_0);
	}

	private void paintShapeNode_0_0_0_236_0(Graphics2D g) {
		GeneralPath shape236 = new GeneralPath();
		shape236.moveTo(-89.25, 169.0);
		shape236.lineTo(-67.25, 173.75);
		g.setPaint(new Color(0, 0, 0, 255));
		g.setStroke(new BasicStroke(1.0f,0,0,4.0f,null,0.0f));
		g.draw(shape236);
	}

	private void paintCompositeGraphicsNode_0_0_0_236(Graphics2D g) {
		// _0_0_0_236_0
		AffineTransform trans_0_0_0_236_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_236_0(g);
		g.setTransform(trans_0_0_0_236_0);
	}

	private void paintShapeNode_0_0_0_237_0(Graphics2D g) {
		GeneralPath shape237 = new GeneralPath();
		shape237.moveTo(-39.0, 331.0);
		shape237.curveTo(-39.0, 331.0, -39.5, 327.5, -48.5, 338.0);
		g.draw(shape237);
	}

	private void paintCompositeGraphicsNode_0_0_0_237(Graphics2D g) {
		// _0_0_0_237_0
		AffineTransform trans_0_0_0_237_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_237_0(g);
		g.setTransform(trans_0_0_0_237_0);
	}

	private void paintShapeNode_0_0_0_238_0(Graphics2D g) {
		GeneralPath shape238 = new GeneralPath();
		shape238.moveTo(-33.5, 336.0);
		shape238.curveTo(-33.5, 336.0, -31.5, 329.5, -38.0, 334.0);
		g.draw(shape238);
	}

	private void paintCompositeGraphicsNode_0_0_0_238(Graphics2D g) {
		// _0_0_0_238_0
		AffineTransform trans_0_0_0_238_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_238_0(g);
		g.setTransform(trans_0_0_0_238_0);
	}

	private void paintShapeNode_0_0_0_239_0(Graphics2D g) {
		GeneralPath shape239 = new GeneralPath();
		shape239.moveTo(20.5, 344.5);
		shape239.curveTo(20.5, 344.5, 22.0, 333.5, 10.5, 346.5);
		g.draw(shape239);
	}

	private void paintCompositeGraphicsNode_0_0_0_239(Graphics2D g) {
		// _0_0_0_239_0
		AffineTransform trans_0_0_0_239_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintShapeNode_0_0_0_239_0(g);
		g.setTransform(trans_0_0_0_239_0);
	}

	private void paintCompositeGraphicsNode_0_0_0(Graphics2D g) {
		// _0_0_0_0
		AffineTransform trans_0_0_0_0 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_0(g);
		g.setTransform(trans_0_0_0_0);
		// _0_0_0_1
		AffineTransform trans_0_0_0_1 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_1(g);
		g.setTransform(trans_0_0_0_1);
		// _0_0_0_2
		AffineTransform trans_0_0_0_2 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_2(g);
		g.setTransform(trans_0_0_0_2);
		// _0_0_0_3
		AffineTransform trans_0_0_0_3 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_3(g);
		g.setTransform(trans_0_0_0_3);
		// _0_0_0_4
		AffineTransform trans_0_0_0_4 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_4(g);
		g.setTransform(trans_0_0_0_4);
		// _0_0_0_5
		AffineTransform trans_0_0_0_5 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_5(g);
		g.setTransform(trans_0_0_0_5);
		// _0_0_0_6
		AffineTransform trans_0_0_0_6 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_6(g);
		g.setTransform(trans_0_0_0_6);
		// _0_0_0_7
		AffineTransform trans_0_0_0_7 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_7(g);
		g.setTransform(trans_0_0_0_7);
		// _0_0_0_8
		AffineTransform trans_0_0_0_8 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_8(g);
		g.setTransform(trans_0_0_0_8);
		// _0_0_0_9
		AffineTransform trans_0_0_0_9 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_9(g);
		g.setTransform(trans_0_0_0_9);
		// _0_0_0_10
		AffineTransform trans_0_0_0_10 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_10(g);
		g.setTransform(trans_0_0_0_10);
		// _0_0_0_11
		AffineTransform trans_0_0_0_11 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_11(g);
		g.setTransform(trans_0_0_0_11);
		// _0_0_0_12
		AffineTransform trans_0_0_0_12 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_12(g);
		g.setTransform(trans_0_0_0_12);
		// _0_0_0_13
		AffineTransform trans_0_0_0_13 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_13(g);
		g.setTransform(trans_0_0_0_13);
		// _0_0_0_14
		AffineTransform trans_0_0_0_14 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_14(g);
		g.setTransform(trans_0_0_0_14);
		// _0_0_0_15
		AffineTransform trans_0_0_0_15 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_15(g);
		g.setTransform(trans_0_0_0_15);
		// _0_0_0_16
		AffineTransform trans_0_0_0_16 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_16(g);
		g.setTransform(trans_0_0_0_16);
		// _0_0_0_17
		AffineTransform trans_0_0_0_17 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_17(g);
		g.setTransform(trans_0_0_0_17);
		// _0_0_0_18
		AffineTransform trans_0_0_0_18 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_18(g);
		g.setTransform(trans_0_0_0_18);
		// _0_0_0_19
		AffineTransform trans_0_0_0_19 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_19(g);
		g.setTransform(trans_0_0_0_19);
		// _0_0_0_20
		AffineTransform trans_0_0_0_20 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_20(g);
		g.setTransform(trans_0_0_0_20);
		// _0_0_0_21
		AffineTransform trans_0_0_0_21 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_21(g);
		g.setTransform(trans_0_0_0_21);
		// _0_0_0_22
		AffineTransform trans_0_0_0_22 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_22(g);
		g.setTransform(trans_0_0_0_22);
		// _0_0_0_23
		AffineTransform trans_0_0_0_23 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_23(g);
		g.setTransform(trans_0_0_0_23);
		// _0_0_0_24
		AffineTransform trans_0_0_0_24 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_24(g);
		g.setTransform(trans_0_0_0_24);
		// _0_0_0_25
		AffineTransform trans_0_0_0_25 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_25(g);
		g.setTransform(trans_0_0_0_25);
		// _0_0_0_26
		AffineTransform trans_0_0_0_26 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_26(g);
		g.setTransform(trans_0_0_0_26);
		// _0_0_0_27
		AffineTransform trans_0_0_0_27 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_27(g);
		g.setTransform(trans_0_0_0_27);
		// _0_0_0_28
		AffineTransform trans_0_0_0_28 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_28(g);
		g.setTransform(trans_0_0_0_28);
		// _0_0_0_29
		AffineTransform trans_0_0_0_29 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_29(g);
		g.setTransform(trans_0_0_0_29);
		// _0_0_0_30
		AffineTransform trans_0_0_0_30 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_30(g);
		g.setTransform(trans_0_0_0_30);
		// _0_0_0_31
		AffineTransform trans_0_0_0_31 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_31(g);
		g.setTransform(trans_0_0_0_31);
		// _0_0_0_32
		AffineTransform trans_0_0_0_32 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_32(g);
		g.setTransform(trans_0_0_0_32);
		// _0_0_0_33
		AffineTransform trans_0_0_0_33 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_33(g);
		g.setTransform(trans_0_0_0_33);
		// _0_0_0_34
		AffineTransform trans_0_0_0_34 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_34(g);
		g.setTransform(trans_0_0_0_34);
		// _0_0_0_35
		AffineTransform trans_0_0_0_35 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_35(g);
		g.setTransform(trans_0_0_0_35);
		// _0_0_0_36
		AffineTransform trans_0_0_0_36 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_36(g);
		g.setTransform(trans_0_0_0_36);
		// _0_0_0_37
		AffineTransform trans_0_0_0_37 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_37(g);
		g.setTransform(trans_0_0_0_37);
		// _0_0_0_38
		AffineTransform trans_0_0_0_38 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_38(g);
		g.setTransform(trans_0_0_0_38);
		// _0_0_0_39
		AffineTransform trans_0_0_0_39 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_39(g);
		g.setTransform(trans_0_0_0_39);
		// _0_0_0_40
		AffineTransform trans_0_0_0_40 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_40(g);
		g.setTransform(trans_0_0_0_40);
		// _0_0_0_41
		AffineTransform trans_0_0_0_41 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_41(g);
		g.setTransform(trans_0_0_0_41);
		// _0_0_0_42
		AffineTransform trans_0_0_0_42 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_42(g);
		g.setTransform(trans_0_0_0_42);
		// _0_0_0_43
		AffineTransform trans_0_0_0_43 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_43(g);
		g.setTransform(trans_0_0_0_43);
		// _0_0_0_44
		AffineTransform trans_0_0_0_44 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_44(g);
		g.setTransform(trans_0_0_0_44);
		// _0_0_0_45
		AffineTransform trans_0_0_0_45 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_45(g);
		g.setTransform(trans_0_0_0_45);
		// _0_0_0_46
		AffineTransform trans_0_0_0_46 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_46(g);
		g.setTransform(trans_0_0_0_46);
		// _0_0_0_47
		AffineTransform trans_0_0_0_47 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_47(g);
		g.setTransform(trans_0_0_0_47);
		// _0_0_0_48
		AffineTransform trans_0_0_0_48 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_48(g);
		g.setTransform(trans_0_0_0_48);
		// _0_0_0_49
		AffineTransform trans_0_0_0_49 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_49(g);
		g.setTransform(trans_0_0_0_49);
		// _0_0_0_50
		AffineTransform trans_0_0_0_50 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_50(g);
		g.setTransform(trans_0_0_0_50);
		// _0_0_0_51
		AffineTransform trans_0_0_0_51 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_51(g);
		g.setTransform(trans_0_0_0_51);
		// _0_0_0_52
		AffineTransform trans_0_0_0_52 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_52(g);
		g.setTransform(trans_0_0_0_52);
		// _0_0_0_53
		AffineTransform trans_0_0_0_53 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_53(g);
		g.setTransform(trans_0_0_0_53);
		// _0_0_0_54
		AffineTransform trans_0_0_0_54 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_54(g);
		g.setTransform(trans_0_0_0_54);
		// _0_0_0_55
		AffineTransform trans_0_0_0_55 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_55(g);
		g.setTransform(trans_0_0_0_55);
		// _0_0_0_56
		AffineTransform trans_0_0_0_56 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_56(g);
		g.setTransform(trans_0_0_0_56);
		// _0_0_0_57
		AffineTransform trans_0_0_0_57 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_57(g);
		g.setTransform(trans_0_0_0_57);
		// _0_0_0_58
		AffineTransform trans_0_0_0_58 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_58(g);
		g.setTransform(trans_0_0_0_58);
		// _0_0_0_59
		AffineTransform trans_0_0_0_59 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_59(g);
		g.setTransform(trans_0_0_0_59);
		// _0_0_0_60
		AffineTransform trans_0_0_0_60 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_60(g);
		g.setTransform(trans_0_0_0_60);
		// _0_0_0_61
		AffineTransform trans_0_0_0_61 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_61(g);
		g.setTransform(trans_0_0_0_61);
		// _0_0_0_62
		AffineTransform trans_0_0_0_62 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_62(g);
		g.setTransform(trans_0_0_0_62);
		// _0_0_0_63
		AffineTransform trans_0_0_0_63 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_63(g);
		g.setTransform(trans_0_0_0_63);
		// _0_0_0_64
		AffineTransform trans_0_0_0_64 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_64(g);
		g.setTransform(trans_0_0_0_64);
		// _0_0_0_65
		AffineTransform trans_0_0_0_65 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_65(g);
		g.setTransform(trans_0_0_0_65);
		// _0_0_0_66
		AffineTransform trans_0_0_0_66 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_66(g);
		g.setTransform(trans_0_0_0_66);
		// _0_0_0_67
		AffineTransform trans_0_0_0_67 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_67(g);
		g.setTransform(trans_0_0_0_67);
		// _0_0_0_68
		AffineTransform trans_0_0_0_68 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_68(g);
		g.setTransform(trans_0_0_0_68);
		// _0_0_0_69
		AffineTransform trans_0_0_0_69 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_69(g);
		g.setTransform(trans_0_0_0_69);
		// _0_0_0_70
		AffineTransform trans_0_0_0_70 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_70(g);
		g.setTransform(trans_0_0_0_70);
		// _0_0_0_71
		AffineTransform trans_0_0_0_71 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_71(g);
		g.setTransform(trans_0_0_0_71);
		// _0_0_0_72
		AffineTransform trans_0_0_0_72 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_72(g);
		g.setTransform(trans_0_0_0_72);
		// _0_0_0_73
		AffineTransform trans_0_0_0_73 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_73(g);
		g.setTransform(trans_0_0_0_73);
		// _0_0_0_74
		AffineTransform trans_0_0_0_74 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_74(g);
		g.setTransform(trans_0_0_0_74);
		// _0_0_0_75
		AffineTransform trans_0_0_0_75 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_75(g);
		g.setTransform(trans_0_0_0_75);
		// _0_0_0_76
		AffineTransform trans_0_0_0_76 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_76(g);
		g.setTransform(trans_0_0_0_76);
		// _0_0_0_77
		AffineTransform trans_0_0_0_77 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_77(g);
		g.setTransform(trans_0_0_0_77);
		// _0_0_0_78
		AffineTransform trans_0_0_0_78 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_78(g);
		g.setTransform(trans_0_0_0_78);
		// _0_0_0_79
		AffineTransform trans_0_0_0_79 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_79(g);
		g.setTransform(trans_0_0_0_79);
		// _0_0_0_80
		AffineTransform trans_0_0_0_80 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_80(g);
		g.setTransform(trans_0_0_0_80);
		// _0_0_0_81
		AffineTransform trans_0_0_0_81 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_81(g);
		g.setTransform(trans_0_0_0_81);
		// _0_0_0_82
		AffineTransform trans_0_0_0_82 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_82(g);
		g.setTransform(trans_0_0_0_82);
		// _0_0_0_83
		AffineTransform trans_0_0_0_83 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_83(g);
		g.setTransform(trans_0_0_0_83);
		// _0_0_0_84
		AffineTransform trans_0_0_0_84 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_84(g);
		g.setTransform(trans_0_0_0_84);
		// _0_0_0_85
		AffineTransform trans_0_0_0_85 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_85(g);
		g.setTransform(trans_0_0_0_85);
		// _0_0_0_86
		AffineTransform trans_0_0_0_86 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_86(g);
		g.setTransform(trans_0_0_0_86);
		// _0_0_0_87
		AffineTransform trans_0_0_0_87 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_87(g);
		g.setTransform(trans_0_0_0_87);
		// _0_0_0_88
		AffineTransform trans_0_0_0_88 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_88(g);
		g.setTransform(trans_0_0_0_88);
		// _0_0_0_89
		AffineTransform trans_0_0_0_89 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_89(g);
		g.setTransform(trans_0_0_0_89);
		// _0_0_0_90
		AffineTransform trans_0_0_0_90 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_90(g);
		g.setTransform(trans_0_0_0_90);
		// _0_0_0_91
		AffineTransform trans_0_0_0_91 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_91(g);
		g.setTransform(trans_0_0_0_91);
		// _0_0_0_92
		AffineTransform trans_0_0_0_92 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_92(g);
		g.setTransform(trans_0_0_0_92);
		// _0_0_0_93
		AffineTransform trans_0_0_0_93 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_93(g);
		g.setTransform(trans_0_0_0_93);
		// _0_0_0_94
		AffineTransform trans_0_0_0_94 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_94(g);
		g.setTransform(trans_0_0_0_94);
		// _0_0_0_95
		AffineTransform trans_0_0_0_95 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_95(g);
		g.setTransform(trans_0_0_0_95);
		// _0_0_0_96
		AffineTransform trans_0_0_0_96 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_96(g);
		g.setTransform(trans_0_0_0_96);
		// _0_0_0_97
		AffineTransform trans_0_0_0_97 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_97(g);
		g.setTransform(trans_0_0_0_97);
		// _0_0_0_98
		AffineTransform trans_0_0_0_98 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_98(g);
		g.setTransform(trans_0_0_0_98);
		// _0_0_0_99
		AffineTransform trans_0_0_0_99 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_99(g);
		g.setTransform(trans_0_0_0_99);
		// _0_0_0_100
		AffineTransform trans_0_0_0_100 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_100(g);
		g.setTransform(trans_0_0_0_100);
		// _0_0_0_101
		AffineTransform trans_0_0_0_101 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_101(g);
		g.setTransform(trans_0_0_0_101);
		// _0_0_0_102
		AffineTransform trans_0_0_0_102 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_102(g);
		g.setTransform(trans_0_0_0_102);
		// _0_0_0_103
		AffineTransform trans_0_0_0_103 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_103(g);
		g.setTransform(trans_0_0_0_103);
		// _0_0_0_104
		AffineTransform trans_0_0_0_104 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_104(g);
		g.setTransform(trans_0_0_0_104);
		// _0_0_0_105
		AffineTransform trans_0_0_0_105 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_105(g);
		g.setTransform(trans_0_0_0_105);
		// _0_0_0_106
		AffineTransform trans_0_0_0_106 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_106(g);
		g.setTransform(trans_0_0_0_106);
		// _0_0_0_107
		AffineTransform trans_0_0_0_107 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_107(g);
		g.setTransform(trans_0_0_0_107);
		// _0_0_0_108
		AffineTransform trans_0_0_0_108 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_108(g);
		g.setTransform(trans_0_0_0_108);
		// _0_0_0_109
		AffineTransform trans_0_0_0_109 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_109(g);
		g.setTransform(trans_0_0_0_109);
		// _0_0_0_110
		AffineTransform trans_0_0_0_110 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_110(g);
		g.setTransform(trans_0_0_0_110);
		// _0_0_0_111
		AffineTransform trans_0_0_0_111 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_111(g);
		g.setTransform(trans_0_0_0_111);
		// _0_0_0_112
		AffineTransform trans_0_0_0_112 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_112(g);
		g.setTransform(trans_0_0_0_112);
		// _0_0_0_113
		AffineTransform trans_0_0_0_113 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_113(g);
		g.setTransform(trans_0_0_0_113);
		// _0_0_0_114
		AffineTransform trans_0_0_0_114 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_114(g);
		g.setTransform(trans_0_0_0_114);
		// _0_0_0_115
		AffineTransform trans_0_0_0_115 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_115(g);
		g.setTransform(trans_0_0_0_115);
		// _0_0_0_116
		AffineTransform trans_0_0_0_116 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_116(g);
		g.setTransform(trans_0_0_0_116);
		// _0_0_0_117
		AffineTransform trans_0_0_0_117 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_117(g);
		g.setTransform(trans_0_0_0_117);
		// _0_0_0_118
		AffineTransform trans_0_0_0_118 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_118(g);
		g.setTransform(trans_0_0_0_118);
		// _0_0_0_119
		AffineTransform trans_0_0_0_119 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_119(g);
		g.setTransform(trans_0_0_0_119);
		// _0_0_0_120
		AffineTransform trans_0_0_0_120 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_120(g);
		g.setTransform(trans_0_0_0_120);
		// _0_0_0_121
		AffineTransform trans_0_0_0_121 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_121(g);
		g.setTransform(trans_0_0_0_121);
		// _0_0_0_122
		AffineTransform trans_0_0_0_122 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_122(g);
		g.setTransform(trans_0_0_0_122);
		// _0_0_0_123
		AffineTransform trans_0_0_0_123 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_123(g);
		g.setTransform(trans_0_0_0_123);
		// _0_0_0_124
		AffineTransform trans_0_0_0_124 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_124(g);
		g.setTransform(trans_0_0_0_124);
		// _0_0_0_125
		AffineTransform trans_0_0_0_125 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_125(g);
		g.setTransform(trans_0_0_0_125);
		// _0_0_0_126
		AffineTransform trans_0_0_0_126 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_126(g);
		g.setTransform(trans_0_0_0_126);
		// _0_0_0_127
		AffineTransform trans_0_0_0_127 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_127(g);
		g.setTransform(trans_0_0_0_127);
		// _0_0_0_128
		AffineTransform trans_0_0_0_128 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_128(g);
		g.setTransform(trans_0_0_0_128);
		// _0_0_0_129
		AffineTransform trans_0_0_0_129 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_129(g);
		g.setTransform(trans_0_0_0_129);
		// _0_0_0_130
		AffineTransform trans_0_0_0_130 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_130(g);
		g.setTransform(trans_0_0_0_130);
		// _0_0_0_131
		AffineTransform trans_0_0_0_131 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_131(g);
		g.setTransform(trans_0_0_0_131);
		// _0_0_0_132
		AffineTransform trans_0_0_0_132 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_132(g);
		g.setTransform(trans_0_0_0_132);
		// _0_0_0_133
		AffineTransform trans_0_0_0_133 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_133(g);
		g.setTransform(trans_0_0_0_133);
		// _0_0_0_134
		AffineTransform trans_0_0_0_134 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_134(g);
		g.setTransform(trans_0_0_0_134);
		// _0_0_0_135
		AffineTransform trans_0_0_0_135 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_135(g);
		g.setTransform(trans_0_0_0_135);
		// _0_0_0_136
		AffineTransform trans_0_0_0_136 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_136(g);
		g.setTransform(trans_0_0_0_136);
		// _0_0_0_137
		AffineTransform trans_0_0_0_137 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_137(g);
		g.setTransform(trans_0_0_0_137);
		// _0_0_0_138
		AffineTransform trans_0_0_0_138 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_138(g);
		g.setTransform(trans_0_0_0_138);
		// _0_0_0_139
		AffineTransform trans_0_0_0_139 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_139(g);
		g.setTransform(trans_0_0_0_139);
		// _0_0_0_140
		AffineTransform trans_0_0_0_140 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_140(g);
		g.setTransform(trans_0_0_0_140);
		// _0_0_0_141
		AffineTransform trans_0_0_0_141 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_141(g);
		g.setTransform(trans_0_0_0_141);
		// _0_0_0_142
		AffineTransform trans_0_0_0_142 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_142(g);
		g.setTransform(trans_0_0_0_142);
		// _0_0_0_143
		AffineTransform trans_0_0_0_143 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_143(g);
		g.setTransform(trans_0_0_0_143);
		// _0_0_0_144
		AffineTransform trans_0_0_0_144 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_144(g);
		g.setTransform(trans_0_0_0_144);
		// _0_0_0_145
		AffineTransform trans_0_0_0_145 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_145(g);
		g.setTransform(trans_0_0_0_145);
		// _0_0_0_146
		AffineTransform trans_0_0_0_146 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_146(g);
		g.setTransform(trans_0_0_0_146);
		// _0_0_0_147
		AffineTransform trans_0_0_0_147 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_147(g);
		g.setTransform(trans_0_0_0_147);
		// _0_0_0_148
		AffineTransform trans_0_0_0_148 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_148(g);
		g.setTransform(trans_0_0_0_148);
		// _0_0_0_149
		AffineTransform trans_0_0_0_149 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_149(g);
		g.setTransform(trans_0_0_0_149);
		// _0_0_0_150
		AffineTransform trans_0_0_0_150 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_150(g);
		g.setTransform(trans_0_0_0_150);
		// _0_0_0_151
		AffineTransform trans_0_0_0_151 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_151(g);
		g.setTransform(trans_0_0_0_151);
		// _0_0_0_152
		AffineTransform trans_0_0_0_152 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_152(g);
		g.setTransform(trans_0_0_0_152);
		// _0_0_0_153
		AffineTransform trans_0_0_0_153 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_153(g);
		g.setTransform(trans_0_0_0_153);
		// _0_0_0_154
		AffineTransform trans_0_0_0_154 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_154(g);
		g.setTransform(trans_0_0_0_154);
		// _0_0_0_155
		AffineTransform trans_0_0_0_155 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_155(g);
		g.setTransform(trans_0_0_0_155);
		// _0_0_0_156
		AffineTransform trans_0_0_0_156 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_156(g);
		g.setTransform(trans_0_0_0_156);
		// _0_0_0_157
		AffineTransform trans_0_0_0_157 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_157(g);
		g.setTransform(trans_0_0_0_157);
		// _0_0_0_158
		AffineTransform trans_0_0_0_158 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_158(g);
		g.setTransform(trans_0_0_0_158);
		// _0_0_0_159
		AffineTransform trans_0_0_0_159 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_159(g);
		g.setTransform(trans_0_0_0_159);
		// _0_0_0_160
		AffineTransform trans_0_0_0_160 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_160(g);
		g.setTransform(trans_0_0_0_160);
		// _0_0_0_161
		AffineTransform trans_0_0_0_161 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_161(g);
		g.setTransform(trans_0_0_0_161);
		// _0_0_0_162
		AffineTransform trans_0_0_0_162 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_162(g);
		g.setTransform(trans_0_0_0_162);
		// _0_0_0_163
		AffineTransform trans_0_0_0_163 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_163(g);
		g.setTransform(trans_0_0_0_163);
		// _0_0_0_164
		AffineTransform trans_0_0_0_164 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_164(g);
		g.setTransform(trans_0_0_0_164);
		// _0_0_0_165
		AffineTransform trans_0_0_0_165 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_165(g);
		g.setTransform(trans_0_0_0_165);
		// _0_0_0_166
		AffineTransform trans_0_0_0_166 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_166(g);
		g.setTransform(trans_0_0_0_166);
		// _0_0_0_167
		AffineTransform trans_0_0_0_167 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_167(g);
		g.setTransform(trans_0_0_0_167);
		// _0_0_0_168
		AffineTransform trans_0_0_0_168 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_168(g);
		g.setTransform(trans_0_0_0_168);
		// _0_0_0_169
		AffineTransform trans_0_0_0_169 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_169(g);
		g.setTransform(trans_0_0_0_169);
		// _0_0_0_170
		AffineTransform trans_0_0_0_170 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_170(g);
		g.setTransform(trans_0_0_0_170);
		// _0_0_0_171
		AffineTransform trans_0_0_0_171 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_171(g);
		g.setTransform(trans_0_0_0_171);
		// _0_0_0_172
		AffineTransform trans_0_0_0_172 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_172(g);
		g.setTransform(trans_0_0_0_172);
		// _0_0_0_173
		AffineTransform trans_0_0_0_173 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_173(g);
		g.setTransform(trans_0_0_0_173);
		// _0_0_0_174
		AffineTransform trans_0_0_0_174 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_174(g);
		g.setTransform(trans_0_0_0_174);
		// _0_0_0_175
		AffineTransform trans_0_0_0_175 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_175(g);
		g.setTransform(trans_0_0_0_175);
		// _0_0_0_176
		AffineTransform trans_0_0_0_176 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_176(g);
		g.setTransform(trans_0_0_0_176);
		// _0_0_0_177
		AffineTransform trans_0_0_0_177 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_177(g);
		g.setTransform(trans_0_0_0_177);
		// _0_0_0_178
		AffineTransform trans_0_0_0_178 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_178(g);
		g.setTransform(trans_0_0_0_178);
		// _0_0_0_179
		AffineTransform trans_0_0_0_179 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_179(g);
		g.setTransform(trans_0_0_0_179);
		// _0_0_0_180
		AffineTransform trans_0_0_0_180 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_180(g);
		g.setTransform(trans_0_0_0_180);
		// _0_0_0_181
		AffineTransform trans_0_0_0_181 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_181(g);
		g.setTransform(trans_0_0_0_181);
		// _0_0_0_182
		AffineTransform trans_0_0_0_182 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_182(g);
		g.setTransform(trans_0_0_0_182);
		// _0_0_0_183
		AffineTransform trans_0_0_0_183 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_183(g);
		g.setTransform(trans_0_0_0_183);
		// _0_0_0_184
		AffineTransform trans_0_0_0_184 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_184(g);
		g.setTransform(trans_0_0_0_184);
		// _0_0_0_185
		AffineTransform trans_0_0_0_185 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_185(g);
		g.setTransform(trans_0_0_0_185);
		// _0_0_0_186
		AffineTransform trans_0_0_0_186 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_186(g);
		g.setTransform(trans_0_0_0_186);
		// _0_0_0_187
		AffineTransform trans_0_0_0_187 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_187(g);
		g.setTransform(trans_0_0_0_187);
		// _0_0_0_188
		AffineTransform trans_0_0_0_188 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_188(g);
		g.setTransform(trans_0_0_0_188);
		// _0_0_0_189
		AffineTransform trans_0_0_0_189 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_189(g);
		g.setTransform(trans_0_0_0_189);
		// _0_0_0_190
		AffineTransform trans_0_0_0_190 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_190(g);
		g.setTransform(trans_0_0_0_190);
		// _0_0_0_191
		AffineTransform trans_0_0_0_191 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_191(g);
		g.setTransform(trans_0_0_0_191);
		// _0_0_0_192
		AffineTransform trans_0_0_0_192 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_192(g);
		g.setTransform(trans_0_0_0_192);
		// _0_0_0_193
		AffineTransform trans_0_0_0_193 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_193(g);
		g.setTransform(trans_0_0_0_193);
		// _0_0_0_194
		AffineTransform trans_0_0_0_194 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_194(g);
		g.setTransform(trans_0_0_0_194);
		// _0_0_0_195
		AffineTransform trans_0_0_0_195 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_195(g);
		g.setTransform(trans_0_0_0_195);
		// _0_0_0_196
		AffineTransform trans_0_0_0_196 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_196(g);
		g.setTransform(trans_0_0_0_196);
		// _0_0_0_197
		AffineTransform trans_0_0_0_197 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_197(g);
		g.setTransform(trans_0_0_0_197);
		// _0_0_0_198
		AffineTransform trans_0_0_0_198 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_198(g);
		g.setTransform(trans_0_0_0_198);
		// _0_0_0_199
		AffineTransform trans_0_0_0_199 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_199(g);
		g.setTransform(trans_0_0_0_199);
		// _0_0_0_200
		AffineTransform trans_0_0_0_200 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_200(g);
		g.setTransform(trans_0_0_0_200);
		// _0_0_0_201
		AffineTransform trans_0_0_0_201 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_201(g);
		g.setTransform(trans_0_0_0_201);
		// _0_0_0_202
		AffineTransform trans_0_0_0_202 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_202(g);
		g.setTransform(trans_0_0_0_202);
		// _0_0_0_203
		AffineTransform trans_0_0_0_203 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_203(g);
		g.setTransform(trans_0_0_0_203);
		// _0_0_0_204
		AffineTransform trans_0_0_0_204 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_204(g);
		g.setTransform(trans_0_0_0_204);
		// _0_0_0_205
		AffineTransform trans_0_0_0_205 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_205(g);
		g.setTransform(trans_0_0_0_205);
		// _0_0_0_206
		AffineTransform trans_0_0_0_206 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_206(g);
		g.setTransform(trans_0_0_0_206);
		// _0_0_0_207
		AffineTransform trans_0_0_0_207 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_207(g);
		g.setTransform(trans_0_0_0_207);
		// _0_0_0_208
		AffineTransform trans_0_0_0_208 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_208(g);
		g.setTransform(trans_0_0_0_208);
		// _0_0_0_209
		AffineTransform trans_0_0_0_209 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_209(g);
		g.setTransform(trans_0_0_0_209);
		// _0_0_0_210
		AffineTransform trans_0_0_0_210 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_210(g);
		g.setTransform(trans_0_0_0_210);
		// _0_0_0_211
		AffineTransform trans_0_0_0_211 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_211(g);
		g.setTransform(trans_0_0_0_211);
		// _0_0_0_212
		AffineTransform trans_0_0_0_212 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_212(g);
		g.setTransform(trans_0_0_0_212);
		// _0_0_0_213
		AffineTransform trans_0_0_0_213 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_213(g);
		g.setTransform(trans_0_0_0_213);
		// _0_0_0_214
		AffineTransform trans_0_0_0_214 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_214(g);
		g.setTransform(trans_0_0_0_214);
		// _0_0_0_215
		AffineTransform trans_0_0_0_215 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_215(g);
		g.setTransform(trans_0_0_0_215);
		// _0_0_0_216
		AffineTransform trans_0_0_0_216 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_216(g);
		g.setTransform(trans_0_0_0_216);
		// _0_0_0_217
		AffineTransform trans_0_0_0_217 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_217(g);
		g.setTransform(trans_0_0_0_217);
		// _0_0_0_218
		AffineTransform trans_0_0_0_218 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_218(g);
		g.setTransform(trans_0_0_0_218);
		// _0_0_0_219
		AffineTransform trans_0_0_0_219 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_219(g);
		g.setTransform(trans_0_0_0_219);
		// _0_0_0_220
		AffineTransform trans_0_0_0_220 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_220(g);
		g.setTransform(trans_0_0_0_220);
		// _0_0_0_221
		AffineTransform trans_0_0_0_221 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_221(g);
		g.setTransform(trans_0_0_0_221);
		// _0_0_0_222
		AffineTransform trans_0_0_0_222 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_222(g);
		g.setTransform(trans_0_0_0_222);
		// _0_0_0_223
		AffineTransform trans_0_0_0_223 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_223(g);
		g.setTransform(trans_0_0_0_223);
		// _0_0_0_224
		AffineTransform trans_0_0_0_224 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_224(g);
		g.setTransform(trans_0_0_0_224);
		// _0_0_0_225
		AffineTransform trans_0_0_0_225 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_225(g);
		g.setTransform(trans_0_0_0_225);
		// _0_0_0_226
		AffineTransform trans_0_0_0_226 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_226(g);
		g.setTransform(trans_0_0_0_226);
		// _0_0_0_227
		AffineTransform trans_0_0_0_227 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_227(g);
		g.setTransform(trans_0_0_0_227);
		// _0_0_0_228
		AffineTransform trans_0_0_0_228 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_228(g);
		g.setTransform(trans_0_0_0_228);
		// _0_0_0_229
		AffineTransform trans_0_0_0_229 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_229(g);
		g.setTransform(trans_0_0_0_229);
		// _0_0_0_230
		AffineTransform trans_0_0_0_230 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_230(g);
		g.setTransform(trans_0_0_0_230);
		// _0_0_0_231
		AffineTransform trans_0_0_0_231 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_231(g);
		g.setTransform(trans_0_0_0_231);
		// _0_0_0_232
		AffineTransform trans_0_0_0_232 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_232(g);
		g.setTransform(trans_0_0_0_232);
		// _0_0_0_233
		AffineTransform trans_0_0_0_233 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_233(g);
		g.setTransform(trans_0_0_0_233);
		// _0_0_0_234
		AffineTransform trans_0_0_0_234 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_234(g);
		g.setTransform(trans_0_0_0_234);
		// _0_0_0_235
		AffineTransform trans_0_0_0_235 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_235(g);
		g.setTransform(trans_0_0_0_235);
		// _0_0_0_236
		AffineTransform trans_0_0_0_236 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_236(g);
		g.setTransform(trans_0_0_0_236);
		// _0_0_0_237
		AffineTransform trans_0_0_0_237 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_237(g);
		g.setTransform(trans_0_0_0_237);
		// _0_0_0_238
		AffineTransform trans_0_0_0_238 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_238(g);
		g.setTransform(trans_0_0_0_238);
		// _0_0_0_239
		AffineTransform trans_0_0_0_239 = g.getTransform();
		g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
		paintCompositeGraphicsNode_0_0_0_239(g);
		g.setTransform(trans_0_0_0_239);
	}

	private void paintCanvasGraphicsNode_0_0(Graphics2D g) {
		// _0_0_0
		AffineTransform trans_0_0_0 = g.getTransform();
		g.transform(new AffineTransform(1.7656463384628296f, 0.0f, 0.0f, 1.7656463384628296f, 324.90716552734375f, 255.00941467285156f));
		paintCompositeGraphicsNode_0_0_0(g);
		g.setTransform(trans_0_0_0);
	}

	private void paintRootGraphicsNode_0(Graphics2D g) {
		// _0_0
		g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
		AffineTransform trans_0_0 = g.getTransform();
		g.transform(new AffineTransform(0.4444444477558136f, 0.0f, 0.0f, 0.4444444477558136f, -0.0f, -0.0f));
		paintCanvasGraphicsNode_0_0(g);
		g.setTransform(trans_0_0);
	}



    /**
     * Returns the X of the bounding box of the original SVG image.
     * @return The X of the bounding box of the original SVG image.
     */
    public int getOrigX() {
        return 1;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * @return The Y of the bounding box of the original SVG image.
     */
    public int getOrigY() {
        return 0;
    }

    /**
     * Returns the width of the bounding box of the original SVG image.
     * @return The width of the bounding box of the original SVG image.
     */
    public int getOrigWidth() {
        return 392;
    }

    /**
     * Returns the height of the bounding box of the original SVG image.
     * @return The height of the bounding box of the original SVG image.
     */
    public int getOrigHeight() {
        return 400;
    }
    
    
	/**
	 * The current width of this resizable icon.
	 */
	int width;

	/**
	 * The current height of this resizable icon.
	 */
	int height;

	/**
	 * Creates a new transcoded SVG image.
	 */
	public ResultingClassName() {
        this.width = getOrigWidth();
        this.height = getOrigHeight();
	}

	/*
	 * (non-Javadoc)
	 * @see javax.swing.Icon#getIconHeight()
	 */
    @Override
	public int getIconHeight() {
		return height;
	}

	/*
	 * (non-Javadoc)
	 * @see javax.swing.Icon#getIconWidth()
	 */
    @Override
	public int getIconWidth() {
		return width;
	}

	/*
	 * Set the dimension of the icon.
	 */

	public void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

	/*
	 * (non-Javadoc)
	 * @see javax.swing.Icon#paintIcon(java.awt.Component, java.awt.Graphics, int, int)
	 */
    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.translate(x, y);

		double coef1 = (double) this.width / (double) getOrigWidth();
		double coef2 = (double) this.height / (double) getOrigHeight();
		double coef = Math.min(coef1, coef2);
		g2d.scale(coef, coef);
		paint(g2d);
		g2d.dispose();
	}
}

