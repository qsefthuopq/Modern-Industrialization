package aztech.modern_industrialization.material;

public class MIMaterials {

    public static MIMaterial gold = new MIMaterial("gold", true).addItemType(new String [] { "crushed_dust","curved_plate","double_ingot","dust","large_plate","plate","rod","small_dust"});
    public static MIMaterial iron = new MIMaterial("iron", true).addItemType(new String [] { "blade","bolt","crushed_dust","curved_plate","double_ingot","dust","gear","large_plate","plate","ring","rod","rotor","small_dust"});
    public static MIMaterial coal = new MIMaterial("coal", true).addItemType(new String [] { "crushed_dust","dust","small_dust"});
    public static MIMaterial copper = new MIMaterial("copper", false).addItemType(new String [] { "blade","bolt","crushed_dust","curved_plate","double_ingot","dust","gear","ingot","large_plate","nugget","plate","ring","rod","rotor","small_dust"}).addBlockType(new String [] { "block","ore" }).setupOreGenerator(20, 9, 128);
    public static MIMaterial bronze = new MIMaterial("bronze", false).addItemType(new String [] { "blade","bolt","curved_plate","double_ingot","dust","gear","ingot","large_plate","nugget","plate","ring","rod","rotor","small_dust"}).addBlockType(new String [] { "block" });
    public static MIMaterial tin = new MIMaterial("tin", false).addItemType(new String [] { "blade","bolt","crushed_dust","curved_plate","double_ingot","dust","gear","ingot","large_plate","nugget","plate","ring","rod","rotor","small_dust"}).addBlockType(new String [] { "block","ore" }).setupOreGenerator(8, 9, 64);
    public static MIMaterial steel = new MIMaterial("steel", false).addItemType(new String [] { "blade","bolt","curved_plate","double_ingot","dust","gear","ingot","large_plate","nugget","plate","ring","rod","rotor","small_dust"}).addBlockType(new String [] { "block" });
    public static MIMaterial aluminum = new MIMaterial("aluminum", false).addItemType(new String [] { "crushed_dust","curved_plate","double_ingot","dust","ingot","large_plate","nugget","plate","rod","small_dust"}).addBlockType(new String [] { "block","ore" }).setupOreGenerator(6, 6, 64);
    public static MIMaterial lignite_coal = new MIMaterial("lignite_coal", false).addItemType(new String [] { "crushed_dust","dust","lignite_coal","small_dust"}).addBlockType(new String [] { "ore" }).setupOreGenerator(20, 17, 128);
    public static MIMaterial lead = new MIMaterial("lead", false).addItemType(new String [] { "crushed_dust","curved_plate","double_ingot","dust","ingot","large_plate","nugget","plate","rod","small_dust"}).addBlockType(new String [] { "block","ore" }).setupOreGenerator(4, 8, 64);
    public static MIMaterial antimony = new MIMaterial("antimony", false).addItemType(new String [] { "crushed_dust","dust","ingot","nugget","small_dust"}).addBlockType(new String [] { "ore" }).setupOreGenerator(4, 6, 64);
    public static MIMaterial nickel = new MIMaterial("nickel", false).addItemType(new String [] { "crushed_dust","curved_plate","double_ingot","dust","ingot","large_plate","nugget","plate","rod","small_dust"}).addBlockType(new String [] { "block","ore" }).setupOreGenerator(4, 6, 64);
    public static MIMaterial silver = new MIMaterial("silver", false).addItemType(new String [] { "crushed_dust","curved_plate","double_ingot","dust","ingot","large_plate","nugget","plate","rod","small_dust"}).addBlockType(new String [] { "block","ore" }).setupOreGenerator(4, 6, 64);

}