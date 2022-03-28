/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designPattern.structuralDesign.adapter;
/**
 *
 * @author Mr T.Khine
 */
public class ObjectAdpater  implements NewApi{
    
    OldApi oldApi = new OldApi();
    
    public static void main(String[] args) {
        NewApi newApi = new ObjectAdpater();
        newApi.receiveDamage(30);
    }
	@Override
	public void receiveDamage(int damage) {
		// TODO Auto-generated method stub
		oldApi.damageIn(damage);
	}
}
