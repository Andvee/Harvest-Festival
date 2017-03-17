package joshie.harvest.town;

import joshie.harvest.api.buildings.BuildingLocation;

import static joshie.harvest.buildings.HFBuildings.*;

public class BuildingLocations {
    public static final BuildingLocation FISHING_HUT_UPSTAIRS = new BuildingLocation(FISHING_HUT, "fisher.upstairs").withDistance(8D);
    public static final BuildingLocation FISHING_HUT_DOWNSTAIRS = new BuildingLocation(FISHING_HUT, "jacob").withDistance(8D);
    public static final BuildingLocation FISHER_LEFT = new BuildingLocation(FISHING_HUT, "fisher.left").withDistance(16D);
    public static final BuildingLocation FISHING_HUT_WORK = new BuildingLocation(FISHING_HUT, "fisher.work").withDistance(1D).withTime(3);
    public static final BuildingLocation FISHING_HUT_RIGHT = new BuildingLocation(FISHING_HUT, "fisher.right").withDistance(16D);
    public static final BuildingLocation FISHING_HUT_DOOR = new BuildingLocation(FISHING_HUT, "fisher.door").withDistance(16D);
    public static final BuildingLocation FISHING_POND_CENTRE = new BuildingLocation(FISHING_HOLE, "pond.water").withDistance(1D);
    public static final BuildingLocation FISHING_POND_PIER = new BuildingLocation(FISHING_HOLE, "pond.pier").withDistance(1D);
    public static final BuildingLocation FISHING_POND_BACK = new BuildingLocation(FISHING_HOLE, "pond.back").withDistance(20D);
    public static final BuildingLocation FISHING_POND_LEFT = new BuildingLocation(FISHING_HOLE, "pond.left").withDistance(20D);
    public static final BuildingLocation FISHING_POND_RIGHT = new BuildingLocation(FISHING_HOLE, "pond.right").withDistance(20D);
    public static final BuildingLocation GODDESS_POND_BACK_RIGHT = new BuildingLocation(GODDESS_POND, "goddess.right.back").withDistance(24D);
    public static final BuildingLocation GODDESS_POND_FRONT = new BuildingLocation(GODDESS_POND, "goddess.front").withDistance(24D);
    public static final BuildingLocation GODDESS_POND_FRONT_LEFT = new BuildingLocation(GODDESS_POND, "goddess.left").withDistance(24D);
    public static final BuildingLocation GODDESS_POND_FRONT_RIGHT = new BuildingLocation(GODDESS_POND, "goddess.right").withDistance(24D);
    public static final BuildingLocation GODDESS_POND_BACK_LEFT = new BuildingLocation(GODDESS_POND, "goddess.left.back").withDistance(16D);
    public static final BuildingLocation GODDESS_POND_BACK = new BuildingLocation(GODDESS_POND, "goddess.back").withDistance(16D);
    public static final BuildingLocation BARN_INSIDE = new BuildingLocation(BARN, "jim").withDistance(8D);
    public static final BuildingLocation BARN_WORK = new BuildingLocation(BARN, "barn.work").withDistance(1D).withTime(3);
    public static final BuildingLocation BARN_LEFT_PEN = new BuildingLocation(BARN, "barn.left").withDistance(8D);
    public static final BuildingLocation BARN_DOOR = new BuildingLocation(BARN, "barn.door").withDistance(20D);
    public static final BuildingLocation BARN_RIGHT_PEN = new BuildingLocation(BARN, "barn.right").withDistance(20D);
    public static final BuildingLocation POULTRY_CENTRE = new BuildingLocation(POULTRY_FARM, "ashlee").withDistance(8D);
    public static final BuildingLocation POULTRY_WORK = new BuildingLocation(POULTRY_FARM, "poultry.work").withDistance(1D).withTime(3);
    public static final BuildingLocation POULTRY_DOOR = new BuildingLocation(POULTRY_FARM, "poultry.door").withDistance(10D);
    public static final BuildingLocation POULTRY_FRONT = new BuildingLocation(POULTRY_FARM, "poultry.front").withDistance(20D);
    public static final BuildingLocation TOWNHALL_LEFT = new BuildingLocation(TOWNHALL, "townhall.wing.left").withDistance(10D);
    public static final BuildingLocation TOWNHALL_RIGHT = new BuildingLocation(TOWNHALL, "townhall.wing.right").withDistance(10D);
    public static final BuildingLocation TOWNHALL_RIGHT_OF_STAGE = new BuildingLocation(TOWNHALL, "townhall.stage.right").withDistance(8D);
    public static final BuildingLocation TOWNHALL_LEFT_OF_STAGE = new BuildingLocation(TOWNHALL, "townhall.stage.left").withDistance(8D);
    public static final BuildingLocation TOWNHALL_FRONT_OF_STAGE = new BuildingLocation(TOWNHALL, "townhall.stage.front").withDistance(8D);
    public static final BuildingLocation TOWNHALL_ENTRANCE = new BuildingLocation(TOWNHALL, "townhall.door").withDistance(10D);
    public static final BuildingLocation TOWNHALL_CENTRE = new BuildingLocation(TOWNHALL, "townhall.entrance").withDistance(10D);
    public static final BuildingLocation TOWNHALL_STAGE = new BuildingLocation(TOWNHALL, "jamie");
    public static final BuildingLocation TOWNHALL_TEEN = new BuildingLocation(TOWNHALL, "townhall.bedroom.teen");
    public static final BuildingLocation TOWNHALL_TEEN_BED = new BuildingLocation(TOWNHALL, "cloe");
    public static final BuildingLocation TOWNHALL_ADULT_BED = new BuildingLocation(TOWNHALL, "townhall.bedroom.adult");
    public static final BuildingLocation TOWNHALL_CHILD_BED = new BuildingLocation(TOWNHALL, "abi");
    public static final BuildingLocation CHURCH_INSIDE = new BuildingLocation(CHURCH, "thomas").withDistance(10D);
    public static final BuildingLocation CHURCH_PEW_FRONT_LEFT = new BuildingLocation(CHURCH, "church.pew.left.front").withDistance(3D);
    public static final BuildingLocation CHURCH_PEW_FRONT_RIGHT = new BuildingLocation(CHURCH, "church.pew.right.front").withDistance(3D);
    public static final BuildingLocation CHURCH_PEW_CENTRE = new BuildingLocation(CHURCH, "church.pew.centre").withDistance(3D);
    public static final BuildingLocation CHURCHPEWBACKLEFT = new BuildingLocation(CHURCH, "church.pew.left.back").withDistance(3D);
    public static final BuildingLocation CHURCH_PEW_BACK_RIGHT = new BuildingLocation(CHURCH, "church.pew.right.back").withDistance(3D);
    public static final BuildingLocation CHURCH_RIGHT = new BuildingLocation(CHURCH, "church.right").withDistance(20D);
    public static final BuildingLocation CHURCH_LEFT = new BuildingLocation(CHURCH, "church.left").withDistance(20D);
    public static final BuildingLocation GENERAL_CUSTOMER = new BuildingLocation(SUPERMARKET, "market.customer").withDistance(16D);
    public static final BuildingLocation GENERAL_STORE_FRONT = new BuildingLocation(SUPERMARKET, "market.front").withDistance(16D);
    public static final BuildingLocation GENERAL_GARDEN = new BuildingLocation(SUPERMARKET, "market.garden").withDistance(16D);
    public static final BuildingLocation GENERAL_BEDROOM = new BuildingLocation(SUPERMARKET, "market.bedroom").withDistance(4D);
    public static final BuildingLocation GENERAL_BED = new BuildingLocation(SUPERMARKET, "candice").withDistance(8D);
    public static final BuildingLocation GENERAL_TILL = new BuildingLocation(SUPERMARKET, "jenni").withDistance(1D).withTime(3);
    public static final BuildingLocation CARPENTER_WORK = new BuildingLocation(CARPENTER, "carpenter.door").withDistance(1D).withTime(3);
    public static final BuildingLocation CARPENTER_FRONT = new BuildingLocation(CARPENTER, "carpenter.entrance").withDistance(24D);
    public static final BuildingLocation CARPENTER_DOWNSTAIRS = new BuildingLocation(CARPENTER, "carpenter.downstairs").withDistance(3D);
    public static final BuildingLocation CARPENTER_UPSTAIRS = new BuildingLocation(CARPENTER, "jade").withDistance(3D);
    public static final BuildingLocation CHURCH_FRONT = new BuildingLocation(CHURCH, "church.door").withDistance(24D);
    public static final BuildingLocation CHURCH_WORK = new BuildingLocation(CHURCH, "church.work").withDistance(1D).withTime(3);
    public static final BuildingLocation MINE_ENTRANCE = new BuildingLocation(MINING_HILL, "mine.front").withDistance(24D);
    public static final BuildingLocation MINE_RIGHT = new BuildingLocation(MINING_HILL, "mine.right").withDistance(16D);
    public static final BuildingLocation MINE_BACK = new BuildingLocation(MINING_HILL, "mine.back").withDistance(16D);
    public static final BuildingLocation CAFE_TILL = new BuildingLocation(CAFE, "cafe.till").withDistance(1D);
    public static final BuildingLocation CAFE_FRONT = new BuildingLocation(CAFE, "cafe.entrance").withDistance(16D);
    public static final BuildingLocation CAFE_DOOR = new BuildingLocation(CAFE, "cafe.door").withDistance(8D);
    public static final BuildingLocation CAFE_CUSTOMER = new BuildingLocation(CAFE, "cafe.customer").withDistance(16D);
    public static final BuildingLocation CAFE_BALCONY = new BuildingLocation(CAFE, "liara").withDistance(16D);
    public static final BuildingLocation CAFE_KITCHEN = new BuildingLocation(CAFE, "katlin").withDistance(16D);
    public static final BuildingLocation CAFE_STAIRS = new BuildingLocation(CAFE, "cafe.stairs").withDistance(4D);
    public static final BuildingLocation BLACKSMITH_FRONT = new BuildingLocation(BLACKSMITH, "blacksmith.entrance").withDistance(16D);
    public static final BuildingLocation BLACKMSITH_DOOR = new BuildingLocation(BLACKSMITH, "blacksmith.door").withDistance(20D);
    public static final BuildingLocation BLACKSMITH_FURNACE = new BuildingLocation(BLACKSMITH, "daniel").withDistance(5D);
    public static final BuildingLocation BLACKSMITH_WORK = new BuildingLocation(BLACKSMITH, "blacksmith.work").withDistance(1D).withTime(3);
    public static final BuildingLocation CLOCKMAKER_DOOR = new BuildingLocation(CLOCKMAKER, "clockworker.door");
    public static final BuildingLocation CLOCKMAKER_UPSTAIRS = new BuildingLocation(CLOCKMAKER, "fenn");
    public static final BuildingLocation CLOCKMAKER_DOWNSTAIRS = new BuildingLocation(CLOCKMAKER, "tiberius");
    public static final BuildingLocation CLOCKMAKER_WORK = new BuildingLocation(CLOCKMAKER, "clockworker.work").withDistance(1D).withTime(3);
    public static final BuildingLocation PARK_STALL = new BuildingLocation(FESTIVAL_GROUNDS, "park.stall").withDistance(1D);
    public static final BuildingLocation PARK_CAFE = new BuildingLocation(FESTIVAL_GROUNDS, "park.cafe").withDistance(1D);
    public static final BuildingLocation PARK_TABLE = new BuildingLocation(FESTIVAL_GROUNDS, "park.table").withDistance(5D);
    public static final BuildingLocation PARK_LEFT = new BuildingLocation(FESTIVAL_GROUNDS, "park.left").withDistance(5D);
    public static final BuildingLocation PARK_CUSTOMER = new BuildingLocation(FESTIVAL_GROUNDS, "park.customer").withDistance(3D);
    public static final BuildingLocation PARK_BENCH = new BuildingLocation(FESTIVAL_GROUNDS, "park.bench").withDistance(5D);
    public static final BuildingLocation PARK_CENTRE = new BuildingLocation(FESTIVAL_GROUNDS, "park.centre").withDistance(5D);
    public static final BuildingLocation PARK_LAMP_BACK = new BuildingLocation(FESTIVAL_GROUNDS, "park.back.lamps").withDistance(5D);
    public static final BuildingLocation PARK_BACK_LEFT = new BuildingLocation(FESTIVAL_GROUNDS, "park.back.left").withDistance(5D);
    public static final BuildingLocation PARK_OAK = new BuildingLocation(FESTIVAL_GROUNDS, "park.oak").withDistance(5D);
    public static final BuildingLocation PARK_SPRUCE = new BuildingLocation(FESTIVAL_GROUNDS, "park.spruce").withDistance(5D);
    public static final BuildingLocation PARK_BOTTOM = new BuildingLocation(FESTIVAL_GROUNDS, "park.bottom").withDistance(5D);
    public static final BuildingLocation PARK_TRADER = new BuildingLocation(FESTIVAL_GROUNDS, "girafi").withDistance(1D);
    public static final BuildingLocation PARK_PODIUM = new BuildingLocation(FESTIVAL_GROUNDS, "park.podium").withDistance(1.5D);
    public static final BuildingLocation PARK_BUSH = new BuildingLocation(FESTIVAL_GROUNDS, "park.bush").withDistance(1.5D);
    public static final BuildingLocation PARK_STAGE_RIGHT = new BuildingLocation(FESTIVAL_GROUNDS, "stage.right").withDistance(0.5D);
    public static final BuildingLocation PARK_STAGE_LEFT = new BuildingLocation(FESTIVAL_GROUNDS, "stage.left").withDistance(0.5D);
    public static final BuildingLocation PARK_STAGE_STAND1 = new BuildingLocation(FESTIVAL_GROUNDS, "stage.stand1").withDistance(0.5D);
    public static final BuildingLocation PARK_STAGE_STAND2 = new BuildingLocation(FESTIVAL_GROUNDS, "stage.stand2").withDistance(0.5D);
    public static final BuildingLocation PARK_STAGE_STAND3 = new BuildingLocation(FESTIVAL_GROUNDS, "stage.stand3").withDistance(0.5D);
    public static final BuildingLocation PARK_STAGE_STAND4 = new BuildingLocation(FESTIVAL_GROUNDS, "stage.stand4").withDistance(0.5D);
    public static final BuildingLocation PARK_STAGE_STAND1_HUMAN = new BuildingLocation(FESTIVAL_GROUNDS, "stage.stand1.human").withDistance(0.5D);
    public static final BuildingLocation PARK_STAGE_STAND2_HUMAN = new BuildingLocation(FESTIVAL_GROUNDS, "stage.stand2.human").withDistance(0.5D);
    public static final BuildingLocation PARK_STAGE_STAND3_HUMAN = new BuildingLocation(FESTIVAL_GROUNDS, "stage.stand3.human").withDistance(0.5D);
    public static final BuildingLocation PARK_STAGE_STAND4_HUMAN = new BuildingLocation(FESTIVAL_GROUNDS, "stage.stand4.human").withDistance(0.5D);
    public static final BuildingLocation PARK_TRADER_LEFT = new BuildingLocation(FESTIVAL_GROUNDS, "newyear.left").withDistance(1D);
    public static final BuildingLocation PARK_TRADER_RIGHT = new BuildingLocation(FESTIVAL_GROUNDS, "newyear.right").withDistance(1D);
    public static final BuildingLocation PARK_NOODLES_STAND = new BuildingLocation(FESTIVAL_GROUNDS, "noodles").withDistance(1D);
    public static final BuildingLocation PARK_COW_JUDGE = new BuildingLocation(FESTIVAL_GROUNDS, "festival.cow.candice").withDistance(1D);
    public static final BuildingLocation PARK_COW_BARN = new BuildingLocation(FESTIVAL_GROUNDS, "festival.cow.jim").withDistance(1D);
    public static final BuildingLocation PARK_COW_BACK = new BuildingLocation(FESTIVAL_GROUNDS, "festival.cow.back").withDistance(3D);
    public static final BuildingLocation PARK_COW_SEATS = new BuildingLocation(FESTIVAL_GROUNDS, "festival.cow.seats").withDistance(5D);
    public static final BuildingLocation PARK_COW_BACK_LEFT = new BuildingLocation(FESTIVAL_GROUNDS, "festival.cow.back.left").withDistance(5D);
    public static final BuildingLocation PARK_COW_EDGE = new BuildingLocation(FESTIVAL_GROUNDS, "festival.cow.edge").withDistance(7D);
    public static final BuildingLocation PARK_COW_BENCH = new BuildingLocation(FESTIVAL_GROUNDS, "festival.cow.bench").withDistance(4D);
    public static final BuildingLocation PARK_SHEEP_JUDGE = new BuildingLocation(FESTIVAL_GROUNDS, "festival.sheep.jim").withDistance(1D);
    public static final BuildingLocation PARK_SHEEP_SHOP = new BuildingLocation(FESTIVAL_GROUNDS, "festival.sheep.candice").withDistance(1D);
    public static final BuildingLocation PARK_SHEEP_GRANNY = new BuildingLocation(FESTIVAL_GROUNDS, "festival.sheep.granny").withDistance(1D);
    public static final BuildingLocation PARK_SHEEP_YULIF = new BuildingLocation(FESTIVAL_GROUNDS, "festival.sheep.yulif").withDistance(5D);
    public static final BuildingLocation PARK_SHEEP_JENNI = new BuildingLocation(FESTIVAL_GROUNDS, "festival.sheep.jenni").withDistance(5D);
    public static final BuildingLocation PARK_SHEEP_ASHLEE = new BuildingLocation(FESTIVAL_GROUNDS, "festival.sheep.ashlee").withDistance(5D);
    public static final BuildingLocation PARK_SHEEP_DANIERU = new BuildingLocation(FESTIVAL_GROUNDS, "festival.sheep.danieru").withDistance(5D);
    public static final BuildingLocation PARK_SHEEP_TIBERIUS = new BuildingLocation(FESTIVAL_GROUNDS, "festival.sheep.tiberius").withDistance(5D);
    public static final BuildingLocation PARK_SHEEP_LIARA = new BuildingLocation(FESTIVAL_GROUNDS, "festival.sheep.liara").withDistance(5D);
    public static final BuildingLocation PARK_SHEEP_JAKOB = new BuildingLocation(FESTIVAL_GROUNDS, "festival.sheep.jakob").withDistance(5D);
    public static final BuildingLocation PARK_SHEEP_MAYOR = new BuildingLocation(FESTIVAL_GROUNDS, "festival.sheep.mayor").withDistance(7D);

    //TODO: With Scheduling the seating arrangements, update thee seat places when i have them from serious
    public static final BuildingLocation PARK_STARRY_NIGHT_SEAT1 = new BuildingLocation(FESTIVAL_GROUNDS, "festival.sheep.mayor").withDistance(1D).withTime(3);
    public static final BuildingLocation PARK_STARRY_NIGHT_SEAT2 = new BuildingLocation(FESTIVAL_GROUNDS, "festival.sheep.mayor").withDistance(1D).withTime(3);
    public static final BuildingLocation PARK_STARRY_NIGHT_SEAT3 = new BuildingLocation(FESTIVAL_GROUNDS, "festival.sheep.mayor").withDistance(1D).withTime(3);
    public static final BuildingLocation PARK_STARRY_NIGHT_SEAT4 = new BuildingLocation(FESTIVAL_GROUNDS, "festival.sheep.mayor").withDistance(1D).withTime(3);

    //TODO: Convert to building locations vvv
    public static final String TOWNHALL_CHILD_BEDROOM = "townhall.bedroom.child";
    public static final String MINE_STAIRS = "mine.stairs";
    public static final String MINER_HALL = "miner.hall";
    public static final String GODDESS_MIDDLE_RIGHT = "goddess.right.middle";
    public static final String GODDESS_MIDDLE_LEFT = "goddess.left.middle";
    public static final String GODDESS_WATER = "goddess.water";
}
