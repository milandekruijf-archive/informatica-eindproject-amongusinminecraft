package com.minecraftmultiplayer.packets.common;

import com.minecraftmultiplayer.pluggit.common.compatible.Compatible;
import com.minecraftmultiplayer.pluggit.common.container.node.Node;
import com.minecraftmultiplayer.pluggit.common.container.node.type.component.Component;

@Node.Config(
    version = "1.0"
)
public abstract class Packet<T extends Packet<T>> extends Component<T> implements Compatible
{
    public enum Type
    {
        HANDSHAKE_CLIENT_SET_PROTOCOL(0x00),
        PLAY_SERVER_SPAWN_ENTITY(0x00),
        PLAY_SERVER_SPAWN_ENTITY_EXPERIENCE_ORB(0x01),
        PLAY_SERVER_SPAWN_ENTITY_LIVING(0x02),
        PLAY_SERVER_SPAWN_ENTITY_PAINTING(0x03),
        PLAY_SERVER_NAMED_ENTITY_SPAWN(0x04),
        PLAY_SERVER_ANIMATION(0x05),
        PLAY_SERVER_STATISTIC(0x06),
        PLAY_SERVER_BLOCK_BREAK(0x07),
        PLAY_SERVER_BLOCK_BREAK_ANIMATION(0x08),
        PLAY_SERVER_TILE_ENTITY_DATA(0x09),
        PLAY_SERVER_BLOCK_ACTION(0x0A),
        PLAY_SERVER_BLOCK_CHANGE(0x0B),
        PLAY_SERVER_BOSS(0x0C),
        PLAY_SERVER_SERVER_DIFFICULTY(0x0D),
        PLAY_SERVER_CHAT(0x0E),
        PLAY_SERVER_TAB_COMPLETE(0x0F),
        PLAY_SERVER_COMMANDS(0x10),
        PLAY_SERVER_TRANSACTION(0x11),
        PLAY_SERVER_CLOSE_WINDOW(0x12),
        PLAY_SERVER_WINDOW_ITEMS(0x13),
        PLAY_SERVER_WINDOW_DATA(0x14),
        PLAY_SERVER_SET_SLOT(0x15),
        PLAY_SERVER_SET_COOLDOWN(0x16),
        PLAY_SERVER_CUSTOM_PAYLOAD(0x17),
        PLAY_SERVER_CUSTOM_SOUND_EFFECT(0x18),
        PLAY_SERVER_KICK_DISCONNECT(0x19),
        PLAY_SERVER_ENTITY_STATUS(0x1A),
        PLAY_SERVER_EXPLOSION(0x1B),
        PLAY_SERVER_UNLOAD_CHUNK(0x1C),
        PLAY_SERVER_GAME_STATE_CHANGE(0x1D),
        PLAY_SERVER_OPEN_WINDOW_HORSE(0x1E),
        PLAY_SERVER_KEEP_ALIVE(0x1F),
        PLAY_SERVER_MAP_CHUNK(0x20),
        PLAY_SERVER_WORLD_EVENT(0x21),
        PLAY_SERVER_WORLD_PARTICLES(0x22),
        PLAY_SERVER_LIGHT_UPDATE(0x23),
        PLAY_SERVER_LOGIN(0x24),
        PLAY_SERVER_MAP(0x25),
        PLAY_SERVER_OPEN_WINDOW_MERCHANT(0x26),
        PLAY_SERVER_REL_ENTITY_MOVE(0x27),
        PLAY_SERVER_REL_ENTITY_MOVE_LOOK(0x28),
        PLAY_SERVER_ENTITY_LOOK(0x29),
        PLAY_SERVER_ENTITY(0x2A),
        PLAY_SERVER_VEHICLE_MOVE(0x2B),
        PLAY_SERVER_OPEN_BOOK(0x2C),
        PLAY_SERVER_OPEN_WINDOW(0x2D),
        PLAY_SERVER_OPEN_SIGN_EDITOR(0x2E),
        PLAY_SERVER_AUTO_RECIPE(0x2F),
        PLAY_SERVER_ABILITIES(0x30),
        PLAY_SERVER_COMBAT_EVENT(0x31),
        PLAY_SERVER_PLAYER_INFO(0x32),
        PLAY_SERVER_LOOK_AT(0x33),
        PLAY_SERVER_POSITION(0x34),
        PLAY_SERVER_RECIPES(0x35),
        PLAY_SERVER_ENTITY_DESTROY(0x36),
        PLAY_SERVER_REMOVE_ENTITY_EFFECT(0x37),
        PLAY_SERVER_RESOURCE_PACK_SEND(0x38),
        PLAY_SERVER_RESPAWN(0x39),
        PLAY_SERVER_ENTITY_HEAD_ROTATION(0x3A),
        PLAY_SERVER_MULTI_BLOCK_CHANGE(0x3B),
        PLAY_SERVER_SELECT_ADVANCEMENT_TAB(0x3C),
        PLAY_SERVER_WORLD_BORDER(0x3D),
        PLAY_SERVER_CAMERA(0x3E),
        PLAY_SERVER_HELD_ITEM_SLOT(0x3F),
        PLAY_SERVER_VIEW_CENTRE(0x40),
        PLAY_SERVER_VIEW_DISTANCE(0x41),
        PLAY_SERVER_SPAWN_POSITION(0x42),
        PLAY_SERVER_SCOREBOARD_DISPLAY_OBJECTIVE(0x43),
        PLAY_SERVER_ENTITY_METADATA(0x44),
        PLAY_SERVER_ATTACH_ENTITY(0x45),
        PLAY_SERVER_ENTITY_VELOCITY(0x46),
        PLAY_SERVER_ENTITY_EQUIPMENT(0x47),
        PLAY_SERVER_EXPERIENCE(0x48),
        PLAY_SERVER_UPDATE_HEALTH(0x49),
        PLAY_SERVER_SCOREBOARD_OBJECTIVE(0x4A),
        PLAY_SERVER_MOUNT(0x4B),
        PLAY_SERVER_SCOREBOARD_TEAM(0x4C),
        PLAY_SERVER_SCOREBOARD_SCORE(0x4D),
        PLAY_SERVER_UPDATE_TIME(0x4E),
        PLAY_SERVER_TITLE(0x4F),
        PLAY_SERVER_ENTITY_SOUND(0x50),
        PLAY_SERVER_NAMED_SOUND_EFFECT(0x51),
        PLAY_SERVER_STOP_SOUND(0x52),
        PLAY_SERVER_PLAYER_LIST_HEADER_FOOTER(0x53),
        PLAY_SERVER_NBT_QUERY(0x54),
        PLAY_SERVER_COLLECT(0x55),
        PLAY_SERVER_ENTITY_TELEPORT(0x56),
        PLAY_SERVER_ADVANCEMENTS(0x57),
        PLAY_SERVER_UPDATE_ATTRIBUTES(0x58),
        PLAY_SERVER_ENTITY_EFFECT(0x59),
        PLAY_SERVER_RECIPE_UPDATE(0x5A),
        PLAY_SERVER_TAGS(0x5B),
        // removed in 1.9
        PLAY_SERVER_MAP_CHUNK_BULK(255),
        PLAY_SERVER_SET_COMPRESSION(254),
        PLAY_SERVER_UPDATE_ENTITY_NBT(253),
        // replaced in 1.9.4
        PLAY_SERVER_UPDATE_SIGN(252),
        // removed in 1.14
        PLAY_SERVER_BED(0x33),
        // removed in 1.16
        PLAY_SERVER_SPAWN_ENTITY_WEATHER(0x02),
        PLAY_CLIENT_TELEPORT_ACCEPT(0x00),
        PLAY_CLIENT_TILE_NBT_QUERY(0x01),
        PLAY_CLIENT_DIFFICULTY_CHANGE(0x02),
        PLAY_CLIENT_CHAT(0x03),
        PLAY_CLIENT_CLIENT_COMMAND(0x04),
        PLAY_CLIENT_SETTINGS(0x05),
        PLAY_CLIENT_TAB_COMPLETE(0x06),
        PLAY_CLIENT_TRANSACTION(0x07),
        PLAY_CLIENT_ENCHANT_ITEM(0x08),
        PLAY_CLIENT_WINDOW_CLICK(0x09),
        PLAY_CLIENT_CLOSE_WINDOW(0x0A),
        PLAY_CLIENT_CUSTOM_PAYLOAD(0x0B),
        PLAY_CLIENT_B_EDIT(0x0C),
        PLAY_CLIENT_ENTITY_NBT_QUERY(0x0D),
        PLAY_CLIENT_USE_ENTITY(0x0E),
        PLAY_CLIENT_JIGSAW_GENERATE(0x0F),
        PLAY_CLIENT_KEEP_ALIVE(0x10),
        PLAY_CLIENT_DIFFICULTY_LOCK(0x11),
        PLAY_CLIENT_POSITION(0x12),
        PLAY_CLIENT_POSITION_LOOK(0x13),
        PLAY_CLIENT_LOOK(0x14),
        PLAY_CLIENT_FLYING(0x15),
        PLAY_CLIENT_VEHICLE_MOVE(0x16),
        PLAY_CLIENT_BOAT_MOVE(0x17),
        PLAY_CLIENT_PICK_ITEM(0x18),
        PLAY_CLIENT_AUTO_RECIPE(0x19),
        PLAY_CLIENT_ABILITIES(0x1A),
        PLAY_CLIENT_BLOCK_DIG(0x1B),
        PLAY_CLIENT_ENTITY_ACTION(0x1C),
        PLAY_CLIENT_STEER_VEHICLE(0x1D),
        PLAY_CLIENT_RECIPE_SETTINGS(0x1E),
        PLAY_CLIENT_RECIPE_DISPLAYED(0x1F),
        PLAY_CLIENT_ITEM_NAME(0x20),
        PLAY_CLIENT_RESOURCE_PACK_STATUS(0x21),
        PLAY_CLIENT_ADVANCEMENTS(0x22),
        PLAY_CLIENT_TR_SEL(0x23),
        PLAY_CLIENT_BEACON(0x24),
        PLAY_CLIENT_HELD_ITEM_SLOT(0x25),
        PLAY_CLIENT_SET_COMMAND_BLOCK(0x26),
        PLAY_CLIENT_SET_COMMAND_MINECART(0x27),
        PLAY_CLIENT_SET_CREATIVE_SLOT(0x28),
        PLAY_CLIENT_SET_JIGSAW(0x29),
        PLAY_CLIENT_STRUCT(0x2A),
        PLAY_CLIENT_UPDATE_SIGN(0x2B),
        PLAY_CLIENT_ARM_ANIMATION(0x2C),
        PLAY_CLIENT_SPECTATE(0x2D),
        PLAY_CLIENT_USE_ITEM(0x2E),
        PLAY_CLIENT_BLOCK_PLACE(0x2F),
        STATUS_SERVER_SERVER_INFO(0x00),
        STATUS_SERVER_PONG(0x01),
        STATUS_CLIENT_START(0x00),
        STATUS_CLIENT_PING(0x01),
        LOGIN_SERVER_DISCONNECT(0x00),
        LOGIN_SERVER_ENCRYPTION_BEGIN(0x01),
        LOGIN_SERVER_SUCCESS(0x02),
        LOGIN_SERVER_SET_COMPRESSION(0x03),
        LOGIN_SERVER_CUSTOM_PAYLOAD(0x04),
        LOGIN_CLIENT_START(0x05),
        LOGIN_CLIENT_ENCRYPTION_BEGIN(0x06),
        LOGIN_CLIENT_CUSTOM_PAYLOAD(0x07);

        Type(final int id)
        {

        }
    }
}
