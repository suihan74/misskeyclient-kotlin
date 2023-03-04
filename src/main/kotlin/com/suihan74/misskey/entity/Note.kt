package com.suihan74.misskey.entity

import com.suihan74.misskey.serializer.InstantISO8601Serializer
import kotlinx.serialization.Serializable
import java.time.Instant

/**
 * ノート
 */
@Serializable
data class Note(
    val id: String,

    @Serializable(with = InstantISO8601Serializer::class)
    val createdAt: Instant,

    val userId: String,

    val user: User,

    val text: String?,

    val cw: String?,

    val visibility: Visibility,

    val localOnly: Boolean,

    val renoteCount: Int,

    val repliesCount: Int,

    val reactions: Map<String, Int>,

    val reactionEmojis: Map<String, String>,

    val fileIds: List<String>,

    val files: List<File>,

    val replyId: String?,

    val renoteId: String?,

    val mentions: List<String> = emptyList()
)

/*
[
  {
    id: '9bxd6a07wb',
    createdAt: '2023-03-04T10:06:34.279Z',
    userId: '8kdsrgsj3j',
    user: {
      id: '8kdsrgsj3j',
      name: 'たちあな',
      username: 'Fiona006',
      host: null,
      avatarUrl: 'https://nos3.arkjp.net/avatar.webp?url=https%3A%2F%2Fs3.arkjp.net%2Fmisskey%2Fwebpublic-a61a91c4-cc19-4ea8-966d-1e8e1f3bef53.jpg&avatar=1',
      avatarBlurhash: 'yHFh*eH?QnjL~CD~9H^mv~^lw6aIxWN3IB^8?G#uD#-p%N~DrdRO?0-OIooz$Toy#rR:%JoIRQr}%JssRPRQs*W?tU${E5xVRnnykE',
      isBot: false,
      isCat: false,
      emojis: {},
      onlineStatus: 'unknown',
      badgeRoles: [],
    },
    text: 'Rider Time龍騎視聴終了。出てこなかったメンツの蟹刑事、東條、サノマン、美穂はあの軸だとライダーになっておらず普通の人間として生きているのかしら？',
    cw: null,
    visibility: 'public',
    localOnly: false,
    renoteCount: 0,
    repliesCount: 0,
    reactions: {},
    reactionEmojis: {},
    fileIds: [],
    files: [],
    replyId: null,
    renoteId: null,
  },
  {
    id: '9bxd69lxsj',
    createdAt: '2023-03-04T10:06:33.765Z',
    userId: '85ctbo3f60',
    user: {
      id: '85ctbo3f60',
      name: ':petthex_syuilo_9597:  #しゅいろの頭なでなでオフ',
      username: 'KawaneRio',
      host: null,
      avatarUrl: 'https://nos3.arkjp.net/avatar.webp?url=https%3A%2F%2Fs3.arkjp.net%2Fmisskey%2Fbafcfc21-97b4-4651-aefa-0dc3baf92831.png&avatar=1',
      avatarBlurhash: 'ynF=gg9GM{ofs:oKWC~VE1NGWVoeofayxaofRkR*a}j[oKRkt7aya|R*ayofa}ayt6j[Rjj[ofs:WBofazayWBWCj[oLWBayofR*ay',
      isBot: false,
      isCat: false,
      emojis: {},
      onlineStatus: 'online',
      badgeRoles: [
        {
          name: 'Patreon Miskist',
          iconUrl: 'https://s3.arkjp.net/misskey/f72dc7fb-111d-4838-81be-4f72d86a6e8c.png',
        },
      ],
    },
    text: null,
    cw: null,
    visibility: 'public',
    localOnly: false,
    renoteCount: 0,
    repliesCount: 0,
    reactions: {},
    reactionEmojis: {},
    fileIds: [],
    files: [],
    replyId: null,
    renoteId: '9bxd43rh9d',
    renote: {
      id: '9bxd43rh9d',
      createdAt: '2023-03-04T10:04:52.877Z',
      userId: '8rfcn6son7',
      user: {
        id: '8rfcn6son7',
        name: 'aqz/tamaina',
        username: 'aqz',
        host: 'p1.a9z.dev',
        avatarUrl: 'https://nos3.arkjp.net/avatar.webp?url=https%3A%2F%2Ffiles-p1.a9z.dev%2Fp1%2F70a4b357-7896-4b58-af89-2a5e25ddf7ea.png&avatar=1',
        avatarBlurhash: 'eFJ@n54:00?H01I9M{_3a}E100RP_3t7$g_Nxu9FIUM_MwogxuRj%g',
        isBot: false,
        isCat: false,
        instance: {
          name: 'p1.a9z.dev',
          softwareName: 'misskey',
          softwareVersion: '13.9.1-p1.1',
          iconUrl: 'https://p1.a9z.dev/static-assets/icons/192.png',
          faviconUrl: 'https://p1.a9z.dev/favicon.ico',
          themeColor: '#eb4034',
        },
        emojis: {
          duckdance: 'https://nos3.arkjp.net/emoji.webp?url=https%3A%2F%2Ffiles-p1.a9z.dev%2Fp1%2Fb8fc8dcb-a13a-4a07-80b9-24f964946c34.gif',
        },
        onlineStatus: 'unknown',
      },
      text: 'なんとかしたいっすね〜\n（一生実装しない気配のする発言',
      cw: null,
      visibility: 'public',
      localOnly: false,
      renoteCount: 1,
      repliesCount: 0,
      reactions: {
        ':sleeping_ai@.:': 1,
      },
      reactionEmojis: {},
      emojis: {},
      fileIds: [],
      files: [],
      replyId: null,
      renoteId: '9bxd3hxyf1',
      uri: 'https://p1.a9z.dev/notes/9bxd43rhxz',
      renote: {
        id: '9bxd3hxyf1',
        createdAt: '2023-03-04T10:04:24.598Z',
        userId: '9a7ibx871t',
        user: {
          id: '9a7ibx871t',
          name: 'はるかみ☆',
          username: 'reasonset',
          host: null,
          avatarUrl: 'https://nos3.arkjp.net/avatar.webp?url=https%3A%2F%2Fs3.arkjp.net%2Fmisskey%2F965d7f4d-a7c7-460a-808e-e90627cbf5b9.png&avatar=1',
          avatarBlurhash: 'eGJi;U%M004ntkUvt7yC%MS28_R5_3S#IB~Ct79Fxa%Mk=oLRjrrf6',
          isBot: false,
          isCat: false,
          emojis: {},
          onlineStatus: 'online',
          badgeRoles: [
            {
              name: 'Patreon Supporter',
              iconUrl: 'https://s3.arkjp.net/misskey/6686b09c-2418-4c08-8a80-5b3adee917af.png',
            },
          ],
        },
        text: '送った対象で追えないのと、送ったあと返信が来てない投稿を探すのが困難なの割と致命的',
        cw: null,
        visibility: 'public',
        localOnly: false,
        renoteCount: 3,
        repliesCount: 0,
        reactions: {
          ':naruhodo@.:': 1,
          ':thinking_omurice@.:': 1,
          ':wakaru@p1.a9z.dev:': 1,
          ':wakarimi@mi.okin-jp.net:': 1,
        },
        reactionEmojis: {
          'wakaru@p1.a9z.dev': 'https://nos3.arkjp.net/emoji.webp?url=https%3A%2F%2Ffiles-p1.a9z.dev%2Fp1%2F2f7f6b34-0d85-4b4b-a84a-75790cb73493.png',
          'wakarimi@mi.okin-jp.net': 'https://nos3.arkjp.net/emoji.webp?url=https%3A%2F%2Fmi-blob.okin-jp.net%2Fblob%2F4c9c28da-49b3-4de8-b113-9a5ec21136c8.png',
        },
        fileIds: [],
        files: [],
        replyId: null,
        renoteId: '9bxcyz1xor',
        renote: {
          id: '9bxcyz1xor',
          createdAt: '2023-03-04T10:00:53.493Z',
          userId: '8rfcn6son7',
          user: {
            id: '8rfcn6son7',
            name: 'aqz/tamaina',
            username: 'aqz',
            host: 'p1.a9z.dev',
            avatarUrl: 'https://nos3.arkjp.net/avatar.webp?url=https%3A%2F%2Ffiles-p1.a9z.dev%2Fp1%2F70a4b357-7896-4b58-af89-2a5e25ddf7ea.png&avatar=1',
            avatarBlurhash: 'eFJ@n54:00?H01I9M{_3a}E100RP_3t7$g_Nxu9FIUM_MwogxuRj%g',
            isBot: false,
            isCat: false,
            instance: {
              name: 'p1.a9z.dev',
              softwareName: 'misskey',
              softwareVersion: '13.9.1-p1.1',
              iconUrl: 'https://p1.a9z.dev/static-assets/icons/192.png',
              faviconUrl: 'https://p1.a9z.dev/favicon.ico',
              themeColor: '#eb4034',
            },
            emojis: {
              duckdance: 'https://nos3.arkjp.net/emoji.webp?url=https%3A%2F%2Ffiles-p1.a9z.dev%2Fp1%2Fb8fc8dcb-a13a-4a07-80b9-24f964946c34.gif',
            },
            onlineStatus: 'unknown',
          },
          text: 'DMっぽい機能（ダイレクト公開範囲）はある',
          cw: null,
          visibility: 'public',
          localOnly: false,
          renoteCount: 1,
          repliesCount: 0,
          reactions: {
            ':ablobcatheadbangfastultra@sushi.ski:': 1,
          },
          reactionEmojis: {
            'ablobcatheadbangfastultra@sushi.ski': 'https://nos3.arkjp.net/emoji.webp?url=https%3A%2F%2Fmedia.sushi.ski%2Ffiles%2F4606052f-f25c-48c6-b21d-c2956d4c7876.gif',
          },
          emojis: {},
          fileIds: [],
          files: [],
          replyId: null,
          renoteId: null,
          uri: 'https://p1.a9z.dev/notes/9bxcyz1xxk',
        },
      },
    },
  },
  {
    id: '9bxd69cxdz',
    createdAt: '2023-03-04T10:06:33.441Z',
    userId: '9bshuwg4xw',
    user: {
      id: '9bshuwg4xw',
      name: null,
      username: 'moyuu_',
      host: null,
      avatarUrl: 'https://misskey.io/identicon/9bshuwg4xw',
      avatarBlurhash: null,
      isBot: false,
      isCat: false,
      emojis: {},
      onlineStatus: 'online',
      badgeRoles: [],
    },
    text: '～2011と～2019の間の8年間はいろんな層いそう',
    cw: null,
    visibility: 'public',
    localOnly: false,
    renoteCount: 0,
    repliesCount: 0,
    reactions: {},
    reactionEmojis: {},
    fileIds: [],
    files: [],
    replyId: null,
    renoteId: null,
  },
  {
    id: '9bxd69b21c',
    createdAt: '2023-03-04T10:06:33.374Z',
    userId: '9brujy2fk8',
    user: {
      id: '9brujy2fk8',
      name: null,
      username: 'Archarios',
      host: null,
      avatarUrl: 'https://nos3.arkjp.net/avatar.webp?url=https%3A%2F%2Fs3.arkjp.net%2Fmisskey%2Fbed6b9c1-4c4b-41a7-a1e8-c8d7e1236ed3.png&avatar=1',
      avatarBlurhash: 'eBHBrM4.00?GIp^%xt-AM{9ZiZ%gR4NHoL}nR*0Kxa?c00In~qV@-=',
      isBot: false,
      isCat: false,
      emojis: {},
      onlineStatus: 'online',
      badgeRoles: [],
    },
    text: null,
    cw: null,
    visibility: 'public',
    localOnly: false,
    renoteCount: 0,
    repliesCount: 0,
    reactions: {},
    reactionEmojis: {},
    fileIds: [],
    files: [],
    replyId: null,
    renoteId: '9bxd5ag4rz',
    renote: {
      id: '9bxd5ag4rz',
      createdAt: '2023-03-04T10:05:48.196Z',
      userId: '9aet5yzoak',
      user: {
        id: '9aet5yzoak',
        name: 'ほわらべ:verified_blue:',
        username: 'whitelabel1940',
        host: null,
        avatarUrl: 'https://nos3.arkjp.net/avatar.webp?url=https%3A%2F%2Fs3.arkjp.net%2Fmisskey%2Fd07923fb-44a8-4e1c-ad8f-1497935a9430.png&avatar=1',
        avatarBlurhash: 'eHMFwFM|~Ut7a^RQf+oLj[M|S~ofs:ayjvoykBs.j[WBwdofWVj[W;',
        isBot: false,
        isCat: true,
        emojis: {},
        onlineStatus: 'online',
        badgeRoles: [
          {
            name: 'Patreon Supporter',
            iconUrl: 'https://s3.arkjp.net/misskey/6686b09c-2418-4c08-8a80-5b3adee917af.png',
          },
        ],
      },
      text: ':misskey2022: :io: $[x2 ってあの頃のインターネットみたいだよね… ]\n\n\n**貴方の思い描いた 「あの頃」っていつ頃？**',
      cw: null,
      visibility: 'public',
      localOnly: false,
      renoteCount: 3,
      repliesCount: 0,
      reactions: {},
      reactionEmojis: {},
      fileIds: [],
      files: [],
      replyId: null,
      renoteId: null,
      poll: {
        multiple: false,
        expiresAt: null,
        choices: [
          {
            text: 'パソコン通信時代',
            votes: 0,
            isVoted: false,
          },
          {
            text: '～00年前後（インターネット黎明期）',
            votes: 3,
            isVoted: false,
          },
          {
            text: '～05年くらい（Web2.0以前）',
            votes: 3,
            isVoted: false,
          },
          {
            text: '～11年くらい（震災前まで）',
            votes: 13,
            isVoted: false,
          },
          {
            text: '～19年くらい（コロナ前まで）',
            votes: 4,
            isVoted: false,
          },
          {
            text: 'それ以降',
            votes: 1,
            isVoted: false,
          },
        ],
      },
    },
  },
  {
    id: '9bxd67u4jk',
    createdAt: '2023-03-04T10:06:31.468Z',
    userId: '9bvwxfk8hy',
    user: {
      id: '9bvwxfk8hy',
      name: null,
      username: 'Medusa',
      host: null,
      avatarUrl: 'https://nos3.arkjp.net/avatar.webp?url=https%3A%2F%2Fs3.arkjp.net%2Fmisskey%2F799bf304-bccc-428d-9450-9ed871bc537b.png&avatar=1',
      avatarBlurhash: 'ebP@Lpoz~CxuxZ_3oeaKafIpm-azODkBs-?Gj@R+afRlRRj[oyj[jY',
      isBot: false,
      isCat: false,
      emojis: {},
      onlineStatus: 'online',
      badgeRoles: [],
    },
    text: null,
    cw: null,
    visibility: 'public',
    localOnly: false,
    renoteCount: 0,
    repliesCount: 0,
    reactions: {},
    reactionEmojis: {},
    fileIds: [],
    files: [],
    replyId: null,
    renoteId: '9bwe72845a',
    renote: {
      id: '9bwe72845a',
      createdAt: '2023-03-03T17:47:24.292Z',
      userId: '9bvwxfk8hy',
      user: {
        id: '9bvwxfk8hy',
        name: null,
        username: 'Medusa',
        host: null,
        avatarUrl: 'https://nos3.arkjp.net/avatar.webp?url=https%3A%2F%2Fs3.arkjp.net%2Fmisskey%2F799bf304-bccc-428d-9450-9ed871bc537b.png&avatar=1',
        avatarBlurhash: 'ebP@Lpoz~CxuxZ_3oeaKafIpm-azODkBs-?Gj@R+afRlRRj[oyj[jY',
        isBot: false,
        isCat: false,
        emojis: {},
        onlineStatus: 'online',
        badgeRoles: [],
      },
      text: ':yosano_akiko_is_always_watching_you:<paypayどこで使えるか知ってますか！？',
      cw: null,
      visibility: 'public',
      localOnly: false,
      renoteCount: 1,
      repliesCount: 0,
      reactions: {
        '🈁': 1,
        '🇨🇱': 1,
        ':send_money@.:': 4,
        ':is_all_scam@.:': 12,
        ':misskey2022@.:': 1,
        ':petthex_yosano_akiko@.:': 3,
        ':kanneiyahataseitetsusyo@.:': 56,
        ':sokoni_nakereba_naidesune@.:': 3,
      },
      reactionEmojis: {},
      fileIds: [],
      files: [],
      replyId: null,
      renoteId: null,
    },
  },
  {
    id: '9bxd67l6tq',
    createdAt: '2023-03-04T10:06:31.146Z',
    userId: '9bphm65dga',
    user: {
      id: '9bphm65dga',
      name: 'カルツク',
      username: 'karutuku',
      host: null,
      avatarUrl: 'https://nos3.arkjp.net/avatar.webp?url=https%3A%2F%2Fs3.arkjp.net%2Fmisskey%2Fwebpublic-ccd8e74a-34ce-4e3e-874c-d972fd23442c.jpg&avatar=1',
      avatarBlurhash: 'ecP6gNoh_0oz%J9as*-;j=tRyEj]XBWFM|~qbIM|j]M{?bWBRPoeRj',
      isBot: false,
      isCat: false,
      emojis: {},
      onlineStatus: 'online',
      badgeRoles: [],
    },
    text: ':nyuuyoku_ha_igyou:',
    cw: null,
    visibility: 'public',
    localOnly: false,
    renoteCount: 0,
    repliesCount: 0,
    reactions: {},
    reactionEmojis: {},
    fileIds: [],
    files: [],
    replyId: null,
    renoteId: null,
  },
  {
    id: '9bxd67h4fm',
    createdAt: '2023-03-04T10:06:31.000Z',
    userId: '998dceldqf',
    user: {
      id: '998dceldqf',
      name: 'Kris',
      username: 'Krisss',
      host: 'mastodon.nl',
      avatarUrl: 'https://nos3.arkjp.net/avatar.webp?url=https%3A%2F%2Fmastodon.nl%2Fsystem%2Faccounts%2Favatars%2F109%2F561%2F516%2F905%2F487%2F068%2Foriginal%2Ffc8459e22a78a54a.jpg&avatar=1',
      avatarBlurhash: 'y8E-]xrY4TXTH?xWyWY*s.rEixxsShi_l9xaM_V@xas:V[oxNwV@kAJnR-oeaKocoLW;xakDWA%Ms-M|Rjs:xtWDWVSgRln$kVW;ae',
      isBot: false,
      isCat: false,
      instance: {
        name: 'Mastodon.nl',
        softwareName: 'mastodon',
        softwareVersion: '4.0.2',
        iconUrl: 'https://mastodon.nl/packs/media/icons/android-chrome-36x36-4c61fdb42936428af85afdbf8c6a45a8.png',
        faviconUrl: 'https://mastodon.nl/packs/media/icons/favicon-48x48-c1197e9664ee6476d2715a1c4293bf61.png',
        themeColor: '#191b22',
      },
      emojis: {},
      onlineStatus: 'unknown',
    },
    text: null,
    cw: null,
    visibility: 'public',
    localOnly: false,
    renoteCount: 0,
    repliesCount: 0,
    reactions: {},
    reactionEmojis: {},
    emojis: {},
    fileIds: [],
    files: [],
    replyId: null,
    renoteId: '9bwvwiawmt',
    uri: 'https://mastodon.nl/users/Krisss/statuses/109964452921391732/activity',
    renote: {
      id: '9bwvwiawmt',
      createdAt: '2023-03-04T02:03:05.000Z',
      userId: '99gfy3vrxt',
      user: {
        id: '99gfy3vrxt',
        name: 'Bill Gallagher Photography',
        username: 'BGP',
        host: 'socel.net',
        avatarUrl: 'https://nos3.arkjp.net/avatar.webp?url=https%3A%2F%2Fcdn.masto.host%2Fsocelnet%2Faccounts%2Favatars%2F109%2F531%2F203%2F973%2F108%2F653%2Foriginal%2F5ce798b14260d22b.jpg&avatar=1',
        avatarBlurhash: 'eWGu8qbdbv-:oe~Uxut7x]tR?anhoftRoc-;kCfPt8ofpJX9s:xuay',
        isBot: false,
        isCat: false,
        instance: {
          name: 'Socel: Social for the Animation Arts',
          softwareName: 'mastodon',
          softwareVersion: '4.1.0',
          iconUrl: 'https://socel.net/packs/media/icons/android-chrome-36x36-4c61fdb42936428af85afdbf8c6a45a8.png',
          faviconUrl: 'https://socel.net/packs/media/icons/favicon-48x48-c1197e9664ee6476d2715a1c4293bf61.png',
          themeColor: '#191b22',
        },
        emojis: {},
        onlineStatus: 'unknown',
      },
      text: "Darwin Falls Vertical\n\nDarwin Falls is a small gem of a waterfall that can be found running year around in Death Valley National Park. That's right, a waterfall in Death Valley.\nThe hike back to the falls is a moderate 2 mile out and back hike. The trail is easy for the most part with a little rock scrambling required near the end of the trail. See the full image here: https://fineartamerica.com/featured/darwin-falls-vertical-bill-gallagher.html #AYearForArt #BillGallagherPhotography #DarwinFalls #DeathValley #Waterfall #Oasis #nature #desert",
      cw: null,
      visibility: 'public',
      localOnly: false,
      renoteCount: 2,
      repliesCount: 0,
      reactions: {},
      reactionEmojis: {},
      emojis: {},
      tags: [
        'ayearforart',
        'billgallagherphotography',
        'darwinfalls',
        'deathvalley',
        'waterfall',
        'oasis',
        'nature',
        'desert',
      ],
      fileIds: [
        '9bwzt02mms',
      ],
      files: [
        {
          id: '9bwzt02mms',
          createdAt: '2023-03-04T03:52:19.870Z',
          name: '960ae4951ba50ea9.jpeg',
          type: 'image/jpeg',
          md5: '3c14e34a7fba6c978df55cb4607203a5',
          size: 0,
          isSensitive: false,
          blurhash: 'eBEV+m_30LRpOE~os;NF%2NG-s?btQRPnjRQoMWERjs.S}M|NEW-kE',
          properties: {
            width: 1176,
            height: 1764,
          },
          url: 'https://nos3.arkjp.net/image.webp?url=https%3A%2F%2Fcdn.masto.host%2Fsocelnet%2Fmedia_attachments%2Ffiles%2F109%2F962%2F423%2F253%2F332%2F377%2Foriginal%2F960ae4951ba50ea9.jpeg',
          thumbnailUrl: 'https://nos3.arkjp.net/static.webp?url=https%3A%2F%2Fcdn.masto.host%2Fsocelnet%2Fmedia_attachments%2Ffiles%2F109%2F962%2F423%2F253%2F332%2F377%2Foriginal%2F960ae4951ba50ea9.jpeg&static=1',
          comment: "It's hard to believe that this little gem exist in Death Valley National Park. This is a spring fed creek that flows into the Darwin Wash towards Panamint Springs. \nIn this image the log in the lower left hand of the image leads the eye to the reflection of the waterfall in the pond at the base of the falls. \nThe pond is reflecting the cliffs and waterfall in a slightly rippled fashion. The fall itself drop down and splits over a large moss covered outcropping.\nReeds and grasses grow on the opposite bank an",
          folderId: null,
          folder: null,
          userId: null,
          user: null,
        },
      ],
      replyId: null,
      renoteId: null,
      uri: 'https://socel.net/users/BGP/statuses/109962551997842826',
      url: 'https://socel.net/@BGP/109962551997842826',
    },
  },
  {
    id: '9bxd67h43x',
    createdAt: '2023-03-04T10:06:31.000Z',
    userId: '7rl7zho3r9',
    user: {
      id: '7rl7zho3r9',
      name: 'ロリコントラップ',
      username: 'ltrapippon',
      host: 'pawoo.net',
      avatarUrl: 'https://nos3.arkjp.net/avatar.webp?url=https%3A%2F%2Fimg.pawoo.net%2Faccounts%2Favatars%2F000%2F127%2F014%2Foriginal%2F99437d33db14d1d7.jpg&avatar=1',
      avatarBlurhash: null,
      isBot: false,
      isCat: false,
      instance: {
        name: 'Pawoo',
        softwareName: 'mastodon',
        softwareVersion: '3.3.3',
        iconUrl: 'https://pawoo.net/android-chrome-192x192.png',
        faviconUrl: 'https://pawoo.net/favicon.ico',
        themeColor: '#282c37',
      },
      emojis: {},
      onlineStatus: 'unknown',
    },
    text: '身体よりも先に精神で悦びを覚えたウイちゃん | Lとらっぷ＠一本院遊郭 #pixiv https://www.pixiv.net/artworks/105908459',
    cw: null,
    visibility: 'public',
    localOnly: false,
    renoteCount: 0,
    repliesCount: 0,
    reactions: {},
    reactionEmojis: {},
    emojis: {},
    tags: [
      'pixiv',
    ],
    fileIds: [],
    files: [],
    replyId: null,
    renoteId: null,
    uri: 'https://pawoo.net/users/ltrapippon/statuses/109964452932661107',
    url: 'https://pawoo.net/@ltrapippon/109964452932661107',
  },
  {
    id: '9bxd67dhd0',
    createdAt: '2023-03-04T10:06:30.869Z',
    userId: '9bdfxouxn9',
    user: {
      id: '9bdfxouxn9',
      name: 'らとさん:verify:',
      username: 'ruttt',
      host: null,
      avatarUrl: 'https://nos3.arkjp.net/avatar.webp?url=https%3A%2F%2Fs3.arkjp.net%2Fmisskey%2Ffa15ef57-91ee-4f52-bff3-23c264d9b546.png&avatar=1',
      avatarBlurhash: 'eNCG.epy4oS6tRPWkXozbHay4:WW-;j?Rjx]WXRjofofRkWBt7t7ay',
      isBot: false,
      isCat: false,
      emojis: {},
      onlineStatus: 'online',
      badgeRoles: [],
    },
    text: null,
    cw: null,
    visibility: 'public',
    localOnly: false,
    renoteCount: 0,
    repliesCount: 0,
    reactions: {},
    reactionEmojis: {},
    fileIds: [
      '9bxd64eomm',
    ],
    files: [
      {
        id: '9bxd64eomm',
        createdAt: '2023-03-04T10:06:27.024Z',
        name: '2023-03-04 19-06-28 1.png',
        type: 'image/png',
        md5: '709c54dac2e1d50d625b45878c086ebb',
        size: 6820,
        isSensitive: false,
        blurhash: 'e88}6~?d9#5S00TgE6nh?Ew@4mI9ng%1-;#5-PS69dNg9Gbb%LxWxu',
        properties: {
          width: 138,
          height: 59,
        },
        url: 'https://s3.arkjp.net/misskey/1ad0762a-b0d8-4627-8696-685c16e45d33.png',
        thumbnailUrl: 'https://s3.arkjp.net/misskey/thumbnail-957a820d-d717-41bc-aadd-513c93579d05.webp',
        comment: null,
        folderId: null,
        folder: null,
        userId: null,
        user: null,
      },
    ],
    replyId: null,
    renoteId: null,
  },
  {
    id: '9bxd65yipb',
    createdAt: '2023-03-04T10:06:29.034Z',
    userId: '993z8hgxr8',
    user: {
      id: '993z8hgxr8',
      name: 'くあは🍬/',
      username: 'kuaha_',
      host: 'misskey.cf',
      avatarUrl: 'https://nos3.arkjp.net/avatar.webp?url=https%3A%2F%2Fapi.misskey.cf%2Ffedv%2Fmskycf%2F458694bb-63a2-43f6-9996-fc9411574244.png&avatar=1',
      avatarBlurhash: 'eaQ875w|%$VF.mz;RjpIf6W.bvs:o}o}VY$kWBofaKbbpct7V@V@i_',
      isBot: false,
      isCat: false,
      instance: {
        name: 'misskey.cf',
        softwareName: 'misskey',
        softwareVersion: '13.8.1',
        iconUrl: 'https://misskey.cf/static-assets/icons/192.png',
        faviconUrl: 'https://api.misskey.cf/fedv/mskycf/038703ec-0595-4355-864f-1bb5a965d557.ico',
        themeColor: '#6600cc',
      },
      emojis: {},
      onlineStatus: 'unknown',
    },
    text: '絵柄好きです！！！フォロー失礼します！',
    cw: null,
    visibility: 'public',
    localOnly: false,
    renoteCount: 0,
    repliesCount: 0,
    reactions: {},
    reactionEmojis: {},
    emojis: {},
    fileIds: [],
    files: [],
    replyId: null,
    renoteId: '9bxbxdoxw6',
    uri: 'https://misskey.cf/notes/9bxd65yiw5',
    renote: {
      id: '9bxbxdoxw6',
      createdAt: '2023-03-04T09:31:39.537Z',
      userId: '9bxbxicevz',
      user: {
        id: '9bxbxicevz',
        name: '鱧たろ',
        username: '1123thanks',
        host: 'misskey.cf',
        avatarUrl: 'https://nos3.arkjp.net/avatar.webp?url=https%3A%2F%2Fapi.misskey.cf%2Ffedv%2Fmskycf%2Ffd9408c5-879b-46b1-9b66-445751b0fbef.jpg&avatar=1',
        avatarBlurhash: 'eBDk_Z=y56V@tR0eNG-ot7oL9Z-p?GozM{~VRj9Zaxt7IoNGxtoKt7',
        isBot: false,
        isCat: false,
        instance: {
          name: 'misskey.cf',
          softwareName: 'misskey',
          softwareVersion: '13.8.1',
          iconUrl: 'https://misskey.cf/static-assets/icons/192.png',
          faviconUrl: 'https://api.misskey.cf/fedv/mskycf/038703ec-0595-4355-864f-1bb5a965d557.ico',
          themeColor: '#6600cc',
        },
        emojis: {},
        onlineStatus: 'unknown',
      },
      text: 'うちの子まとめ！\nソロンお兄さん→ユニフィルちゃん→ランデルくん→知り合いくんの順番です～～～',
      cw: null,
      visibility: 'public',
      localOnly: false,
      renoteCount: 0,
      repliesCount: 1,
      reactions: {
        ':suki@misskey.cf:': 5,
        ':kawaii@misskey.cf:': 1,
        ':google_hart@sushi.ski:': 1,
        ':ablobmeltsoblove@misskey.cf:': 1,
      },
      reactionEmojis: {
        'suki@misskey.cf': 'https://nos3.arkjp.net/emoji.webp?url=https%3A%2F%2Fapi.misskey.cf%2Ffedv%2Fmskycf%2Fwebpublic-fd6cd559-9790-4cb1-83ba-d0d7a07f6632.png',
        'kawaii@misskey.cf': 'https://nos3.arkjp.net/emoji.webp?url=https%3A%2F%2Fapi.misskey.cf%2Ffedv%2Fmskycf%2Fwebpublic-edd9c231-394e-4c90-b8ea-5d0ce1e9967e.png',
        'google_hart@sushi.ski': 'https://nos3.arkjp.net/emoji.webp?url=https%3A%2F%2Fmedia.sushi.ski%2Ffiles%2Fd54b28e2-1233-49ba-9068-f797d7318056.gif',
        'ablobmeltsoblove@misskey.cf': 'https://nos3.arkjp.net/emoji.webp?url=https%3A%2F%2Fapi.misskey.cf%2Ffedv%2Fmskycf%2F3b9c57d6-702d-47ce-b3b9-eb2eaf8bed05.png',
      },
      emojis: {},
      fileIds: [
        '9bxbxjl6w3',
        '9bxbxjknw2',
        '9bxbxk4nw4',
        '9bxbxk4sw5',
      ],
      files: [
        {
          id: '9bxbxjl6w3',
          createdAt: '2023-03-04T09:31:47.178Z',
          name: '067a88ad-f88a-4e3d-bb51-f4fdea7cf06a.png',
          type: 'image/png',
          md5: '8547e09d3603292f58eefae2dc7f9b07',
          size: 0,
          isSensitive: false,
          blurhash: 'etQk~pnj_Mt7Oqr?WBX7oLof%gofRQWVaKozofofbGay%MbHM{kBn*',
          properties: {
            width: 2012,
            height: 2048,
          },
          url: 'https://nos3.arkjp.net/image.webp?url=https%3A%2F%2Fapi.misskey.cf%2Ffedv%2Fmskycf%2F067a88ad-f88a-4e3d-bb51-f4fdea7cf06a.png',
          thumbnailUrl: 'https://nos3.arkjp.net/static.webp?url=https%3A%2F%2Fapi.misskey.cf%2Ffedv%2Fmskycf%2F067a88ad-f88a-4e3d-bb51-f4fdea7cf06a.png&static=1',
          comment: null,
          folderId: null,
          folder: null,
          userId: null,
          user: null,
        },
        {
          id: '9bxbxjknw2',
          createdAt: '2023-03-04T09:31:47.159Z',
          name: 'fcd383ab-d400-45d7-a33f-26e9fc54125f.png',
          type: 'image/png',
          md5: 'dbf5311dcc5df04a9274f9858f2c21b2',
          size: 0,
          isSensitive: false,
          blurhash: 'e69Z7s0KE1~V560|ozxZwfwJnixaI:R*of56%2WVR*xusoX8oLELxu',
          properties: {
            width: 2048,
            height: 1504,
          },
          url: 'https://nos3.arkjp.net/image.webp?url=https%3A%2F%2Fapi.misskey.cf%2Ffedv%2Fmskycf%2Ffcd383ab-d400-45d7-a33f-26e9fc54125f.png',
          thumbnailUrl: 'https://nos3.arkjp.net/static.webp?url=https%3A%2F%2Fapi.misskey.cf%2Ffedv%2Fmskycf%2Ffcd383ab-d400-45d7-a33f-26e9fc54125f.png&static=1',
          comment: null,
          folderId: null,
          folder: null,
          userId: null,
          user: null,
        },
        {
          id: '9bxbxk4nw4',
          createdAt: '2023-03-04T09:31:47.879Z',
          name: 'e727a7e2-99f1-4307-94a7-7b32166ceec5.png',
          type: 'image/png',
          md5: 'e5e64d2873638a1fb94f9efa667cd433',
          size: 0,
          isSensitive: false,
          blurhash: 'e36kt|yD00rDV@PVb^Qlm,%N0Kx]~WDi0KIT%M-;E0E1$2Mx9Zx^?b',
          properties: {
            width: 1488,
            height: 1707,
          },
          url: 'https://nos3.arkjp.net/image.webp?url=https%3A%2F%2Fapi.misskey.cf%2Ffedv%2Fmskycf%2Fe727a7e2-99f1-4307-94a7-7b32166ceec5.png',
          thumbnailUrl: 'https://nos3.arkjp.net/static.webp?url=https%3A%2F%2Fapi.misskey.cf%2Ffedv%2Fmskycf%2Fe727a7e2-99f1-4307-94a7-7b32166ceec5.png&static=1',
          comment: null,
          folderId: null,
          folder: null,
          userId: null,
          user: null,
        },
        {
          id: '9bxbxk4sw5',
          createdAt: '2023-03-04T09:31:47.884Z',
          name: '459e9481-6a23-4195-abf2-e2d032ef88c0.png',
          type: 'image/png',
          md5: 'b7c86c2631fe8cea6f127727da13f7bd',
          size: 0,
          isSensitive: false,
          blurhash: 'e9B2lls.01R-=|}=s.9^RkRk0fj[}[WBE10}WX=xoJoLElWCwHoe%2',
          properties: {
            width: 1803,
            height: 1832,
          },
          url: 'https://nos3.arkjp.net/image.webp?url=https%3A%2F%2Fapi.misskey.cf%2Ffedv%2Fmskycf%2F459e9481-6a23-4195-abf2-e2d032ef88c0.png',
          thumbnailUrl: 'https://nos3.arkjp.net/static.webp?url=https%3A%2F%2Fapi.misskey.cf%2Ffedv%2Fmskycf%2F459e9481-6a23-4195-abf2-e2d032ef88c0.png&static=1',
          comment: null,
          folderId: null,
          folder: null,
          userId: null,
          user: null,
        },
      ],
      replyId: null,
      renoteId: null,
      uri: 'https://misskey.cf/notes/9bxbxdoxg9',
    },
  },
]
 */